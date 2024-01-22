package Task02;

public class Runner {
    public static void main(String[] args) {
        auto yaris = new auto();
        yaris.setGyarto("Toyota");
        yaris.setTipus("Yaris");
        yaris.setEvjarat(2020);
        yaris.setAjtokszama(5);
        yaris.setSzin("kek");

        System.out.println(yaris.toString()); //Elég a yaris is toString nélkül

        auto scania = new auto();
        scania.setGyarto("Scania");
        scania.setTipus("R500 super");
        scania.setEvjarat(2021);
        scania.setAjtokszama(2);
        scania.setSzin("Tűzpiros");
        System.out.println(scania);

    }
}
