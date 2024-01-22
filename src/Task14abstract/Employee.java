package Task14abstract;

public abstract class Employee {
    protected String position;
   protected String name;
    protected String salary;

    public Employee(String position, String name, String salary) {
        this.position = position;
        this.name = name;
        this.salary = salary;
    }

    public abstract int  computePay();

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
