package Task11Interface;

public class PolygonRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        int area = rectangle1.getArea(2, 3);
        System.out.println("Rectangle: " + rectangle1 + " Rectangle area: " + area);

        Square square = new Square();
        area = square.getArea(3, 3);
        System.out.println("Square area: " + area);
    }
}
