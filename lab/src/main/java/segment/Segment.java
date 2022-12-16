package segment;

public class Segment {
    public Point a;

    public Point b;

    public Point middle() {
        return new Point((a.x + b.x) / 2, (a.y + b.y) / 2);

    }

    public double leight() {
        return Math.sqrt((b.x - a.x) * (b.x - a.x)) + ((b.y - a.y) * (b.y - a.y));
    }
}