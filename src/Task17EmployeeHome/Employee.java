package Task17EmployeeHome;

public abstract class  Employee {

protected String position;

protected String name;

protected String salary;
protected String customField;

    public Employee(String position, String name, String salary, String customField) {
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.customField = customField;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", customField='" + customField + '\'' +
                '}';
    }
}
