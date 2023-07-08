public class MyPlace {
    final int x, y;

    public MyPlace(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPlace myPlace = (MyPlace) o;

        if (x != myPlace.x) return false;
        return y == myPlace.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public MyPlace add(MyPlace direction) {
        return new MyPlace(x + direction.x, y + direction.y);
    }

    public MyPlace inv() {
        return new MyPlace(-x, -y);
    }
}
