package Task13Car;

public class MercedesPilotOne implements Car, Racer {

    private String manufacturer;
    private double acceleration;
    private String racerName;

    private String nationality;

    public MercedesPilotOne(String manufacturer, String racerName) {
        this.manufacturer = manufacturer;
        this.racerName = racerName;
    }

    @Override
    public void acceleration(double second) {
        acceleration = second;
    }

    @Override
    public String getCarManufacturer() {
        return manufacturer;
    }

    @Override
    public String getRacerName() {
        return racerName;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "MercedesPilotOne{" +
                "gmanufacturer='" + manufacturer + '\'' +
                ", acceleration=" + acceleration +
                ", racerName='" + racerName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
