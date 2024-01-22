package Task07öröklés;

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.acceleration();
        AmbulanceCar ambulanceCar = new AmbulanceCar();
        ambulanceCar.acceleration();
        System.out.println(ambulanceCar);
        ambulanceCar.enterTheHospital();

        RacerCar myRacerCar = new RacerCar();
        myRacerCar.horn();
        myRacerCar.racing();
        myRacerCar.setColor("red");

        System.out.println(myRacerCar);
    }
}
