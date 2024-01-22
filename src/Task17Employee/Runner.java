package Task17Employee;

public class Runner {
    public static void main(String[] args) {
        EmployeeRegister reg = new EmployeeRegister();
        reg.readCSVFile();
        System.out.println(reg.getEmployee());
        System.out.println(reg.getEmployee().size());


    }
}
