package segment;

public class Main {
    public static void main(String[] args) {
        Segment segment = new Segment();
        segment.a = new Point(1,1);
        segment.b = new Point(2,2);
        System.out.println(segment.leight());
        System.out.println(segment.middle().x);
        System.out.println(segment.middle().y);
    }
}