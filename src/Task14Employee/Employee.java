package Task14Employee;

public abstract class Employee {
    protected String name;
    protected String position;
    protected String salary;

    public Employee(String name, String position, String salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    public abstract String comutePay();

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
