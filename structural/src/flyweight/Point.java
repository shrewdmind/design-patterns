package flyweight;

public class Point {
    private final int x;
    private final int y;
    private final PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s with (%d and %d) coordinates\n", icon.getType(), x, y);
    }
}
