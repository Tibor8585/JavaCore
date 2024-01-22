package Task07öröklés;

public class Car {
    private String manufacturer;
    private String model;
    private String color;
    private int passengerCount;
    private boolean selfDrive;

    public void acceleration(){
        System.out.println("The car is accelerate.");
    }
    public void stop(){
        System.out.println("The car is stopped.");
    }
    public void horn(){
        System.out.println("The car is horn used.");
    }

    public void indicate(){
            System.out.println("The car is indicated.");
        }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public boolean isSelfDrive() {
        return selfDrive;
    }

    public void setSelfDrive(boolean selfDrive) {
        this.selfDrive = selfDrive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", passengerCount=" + passengerCount +
                ", selfDrive=" + selfDrive +
                '}';
    }
}

