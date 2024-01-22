package Task17EmployeeHome;

public class Runner {
    public static void main(String[] args) {
        EmployeeRegister employeeRegister = new EmployeeRegister();
        employeeRegister.readCSVFile();
        System.out.println(employeeRegister.EmployeeList.size());
        System.out.println(employeeRegister.getEmployeeList());

    }
}
