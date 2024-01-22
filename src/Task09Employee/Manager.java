package Task09Employee;

public class Manager extends Employee{
    private String workExperience;

    public Manager(){

    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public void control(){
        System.out.println("Manager controls the processing of work.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "workExperience='" + workExperience +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
