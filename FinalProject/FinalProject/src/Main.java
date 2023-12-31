import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import  static java.awt.event.KeyEvent.*;

import static java.lang.Math.*;

public class Main extends JPanel implements KeyListener {

    int totalWidth = 100, totalHeight = 100;
    int cellSize = 50;

    int centerX = totalWidth / 2, centerY = totalHeight / 2;

    Timer timer = new Timer(1000 / 10, x->onTick());

    Snake snake;
    GameMap map;

    BufferedImage mapImage;
    Main() {
        newGame();
    }

    void newGame() {
        snake = new Snake(centerX, centerY, 5);
        map = new GameMap(totalWidth, totalHeight);

        for (int i = 0; i < sqrt(totalWidth * totalHeight); i++)
            map.placeRandom(CellType.Apple);
        for (int i = 0; i < sqrt(totalWidth * totalHeight); i++)
            map.placeRandom(CellType.Trap);
    }

    public static void main(String[] args) {
        var window = new JFrame("Змейка. Финальный проект");
        //window.setPreferredSize(new Dimension(400, 400));
        var panel = new Main();
        window.add(panel);
        window.setVisible(true);
        window.setSize(new Dimension(1280,680));
        window.addKeyListener(panel);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        preRender();
        graphics.drawImage(mapImage, 0, 0, this);
        graphics.setColor(Color.white);
    }

    public void preRender() {
        var img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        var graphics = img.getGraphics();
        int width = getWidth() / cellSize;
        int height = getHeight() / cellSize;

        int offsetX = max(0, min(totalWidth - width, snake.body.getFirst().x - width / 2));
        int offsetY = max(0, min(totalHeight - height, snake.body.getFirst().y - height / 2));

        int fitX = min(totalWidth, offsetX + width + 1);
        int fitY = min(totalHeight, offsetY + height + 1);

        int drawOffsetX = max((getWidth() - totalWidth * cellSize) / 2, 0);
        int drawOffsetY = max((getHeight() - totalHeight * cellSize) / 2, 0);

        for (int x = offsetX; x < fitX; x++) {
            for (int y = offsetY; y < fitY; y++) {
                var type = map.cellAt(new MyPlace(x, y), CellType.Blank);
                if (type == CellType.Blank) {
                    if ((x + y) % 2 == 0)
                        graphics.setColor(new Color(129, 129, 129));
                    else
                        graphics.setColor(new Color(131,131,131));
                }
                else if (type == CellType.Apple) graphics.setColor(new Color(255, 0, 0));
                else if (type == CellType.Trap) graphics.setColor(new Color(0, 0, 0));
                else if (type == CellType.Snake) graphics.setColor(new Color(0, 255, 0));
                graphics.fillRect((x - offsetX) * cellSize + drawOffsetX, (y - offsetY) * cellSize + drawOffsetY, cellSize, cellSize);
            }
        }
        int x = snake.body.getFirst().x;
        int y = snake.body.getFirst().y;
        graphics.setColor(Color.white);
        graphics.fillRect((x - offsetX) * cellSize + drawOffsetX, (y - offsetY) * cellSize + drawOffsetY, cellSize, cellSize);
        var renderMiniMap = drawOffsetX + drawOffsetY == 0;

        if (renderMiniMap) {
            x = getWidth() - totalWidth * map.miniMapScale - 5;
            y = getHeight() - totalHeight * map.miniMapScale- 5;
            graphics.drawRect(x - 1, y - 1, totalWidth * map.miniMapScale + 2, totalHeight * map.miniMapScale + 2);
            graphics.drawImage(map.image, x, y, this);
        }

        mapImage = img;
    }

    void move() {
        var newPos = snake.body.getFirst().add(snake.direction);
        snake.body.addFirst(newPos);

        if (map.cellAt(newPos) == CellType.Apple)
            map.placeRandom(CellType.Apple);
        else {
            var last = snake.body.removeLast();
            if (!last.equals(snake.body.getLast()))
                map.clearCell(last);
        }

        if (newPos.x < 0 || newPos.x >= totalWidth ||
            newPos.y < 0 || newPos.y >= totalHeight ||
            map.cellAt(newPos) == CellType.Snake || map.cellAt(newPos) == CellType.Trap) {
            timer.stop();
            System.out.println("Потрачено...");
            newGame();
            return;
        }
        map.changeCell(newPos, CellType.Snake);
        snake.prevDirection = snake.direction;
    }

    void onTick() {
        move();
        repaint();
    }

//    private void update() {
//        move();
//    }

    public void keyPressed(KeyEvent keyEvent) {
        if (!timer.isRunning()) timer.start();
        var eventKeyCode = keyEvent.getKeyCode();
        if (eventKeyCode == VK_W || eventKeyCode == VK_UP) snake.setDirection(0, -1);
        if (eventKeyCode == VK_S || eventKeyCode == VK_DOWN) snake.setDirection(0, 1);
        if (eventKeyCode == VK_A || eventKeyCode == VK_LEFT) snake.setDirection(-1, 0);
        if (eventKeyCode == VK_D || eventKeyCode == VK_RIGHT) snake.setDirection(1, 0);
    }

    public void keyReleased(KeyEvent keyEvent) { }
    public void keyTyped(KeyEvent keyEvent) { }
}
