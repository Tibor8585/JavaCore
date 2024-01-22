package Task09Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        DirectReport directReport = new DirectReport();
        directReport.setExactitude("medium");
        directReport.setAge(30);
        directReport.setGender("Male");
        directReport.repair();
        System.out.println(directReport);

        Manager manager = new Manager();
        manager.setWorkExperience("high");
        manager.setAge(60);
        manager.setGender("Female");
        manager.control();
        System.out.println(manager);

    }
}
