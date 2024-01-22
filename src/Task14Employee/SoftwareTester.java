package Task14Employee;

public class SoftwareTester extends Employee {
    private int bugCount;

    public SoftwareTester(String name, String position, String salary, int bugCount) {
        super(name, position, salary);
        this.bugCount=bugCount;
    }


    @Override
    public String comutePay() {
        return "1000";
    }

    @Override
    public String toString() {
        return "SoftwareTester{" +
                "bugCount=" + bugCount +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} ";
    }
}
