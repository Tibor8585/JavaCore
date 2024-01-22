package Task17Employee;

public abstract class AbstractEmployee {
    protected String position;
    protected String name;
    protected String salary;
    protected String customField;

    public AbstractEmployee(String position, String name, String salary, String customField) {
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.customField = customField;
    }

    @Override
    public String toString() {
        return "AbstractEmployee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", customField='" + customField + '\'' +
                '}';
    }
}
