package Task09Employee;

public class Employee {
    private String gender;
    private int age;



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void working(){
        System.out.println("The emmployees are working day by day");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
