package Task11Interface;

public class Rectangle implements Polygoninterface {
    private int sideA;
    private int sideB;

    public Rectangle() {
        System.out.println("Rectangle created.");
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public int getArea(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
