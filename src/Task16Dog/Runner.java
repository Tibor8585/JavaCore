package Task16Dog;

public class Runner {
    public static void main(String[] args) {
        DogRegister dogRegister = new DogRegister();
        dogRegister.readCsvFile();
        System.out.println(dogRegister.getDogsList());
        System.out.println(dogRegister.getDogsList().size());

    }
}
