package Task03;

public class Main {
    public static void main(String[] args) {
        Donate classicDonut = new Donate("circle", 10, "choclate", "apple", "bug");
        Donate testDonut = new Donate("rectangle", "sugar");
        System.out.println(classicDonut);
        classicDonut.setShape("square");
        System.out.println(classicDonut);
        System.out.println(testDonut);
    }

}
