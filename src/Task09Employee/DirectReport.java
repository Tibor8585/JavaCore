package Task09Employee;

public class DirectReport extends Employee {

    private String exactitude;


   public DirectReport(){

   }

    public String getExactitude() {
        return exactitude;
    }

    public void setExactitude(String exactitude) {
        this.exactitude = exactitude;
    }

    public void repair(){
        System.out.println("The direct report has to repair many things.");
    }

    @Override
    public String toString() {
        return "DirectReport{" +
                "exactitude='" + exactitude +
                ", age=" + getAge() +
                ", gender=" + getGender() +
        '}';
    }
}


