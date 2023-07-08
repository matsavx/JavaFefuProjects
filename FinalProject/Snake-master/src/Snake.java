import java.util.Deque;
import java.util.LinkedList;

public class Snake {
    Snake(int x, int y, int length) {
        for (int i = 0; i < length; i++) {
            body.addFirst(new MyPlace(x, y));
        }
    }
    Deque<MyPlace> body = new LinkedList<>();
    MyPlace direction = new MyPlace(0, 0);
    MyPlace prevDirection;

    public void setDirection(MyPlace direction) {
        if (direction.inv().equals(this.prevDirection)) return;
        this.direction = direction;
    }

    public void setDirection(int x, int y) {
        setDirection(new MyPlace(x, y));
    }
}
