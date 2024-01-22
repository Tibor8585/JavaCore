package Task13Car;

public class FormulaOneRunner {

    public static void main(String[] args) {
        MercedesPilotOne mercedesPilotOne = new MercedesPilotOne("Mercedes", "Hamilton");
        mercedesPilotOne.acceleration(2.2);
        mercedesPilotOne.setNationality("brit");
        System.out.println(mercedesPilotOne);
    }
}
