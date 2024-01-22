package Task07öröklés;

public class RacerCar extends Car{

    private boolean hasExtraBody;
    private boolean hasExtraFireSystem;
    public RacerCar(){

    }

   public boolean isHasExtraBody(){
        return hasExtraBody;
   }

    public boolean isHasExtraFireSystem(){
        return hasExtraFireSystem;
    }

    public void racing(){
        System.out.println("Racer is racing now.");
    }

    @Override
    public String toString() {
        return "RacerCar{" +
                "hasExtraBody=" + hasExtraBody +
                ", hasExtraFireSystem=" + hasExtraFireSystem +
                ", manufacturer=" + getManufacturer() +
                ", model=" + getModel() +
                ", color=" + getColor() +
                ", selfdriver=" + isSelfDrive() +
        '}';
    }
}
