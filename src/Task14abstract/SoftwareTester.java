package Task14abstract;

public class SoftwareTester extends Employee {

    private int bugCount;

    public SoftwareTester(String position, String name, String salary, int bugCount) {
        super(position, name, salary);
        this.bugCount = bugCount;
    }

    @Override
    public int computePay() {
        return 3000;
    }

    @Override
    public String toString() {
        return "SoftwareTester{" +
                "bugCount=" + bugCount + '\'' +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                "} ";
    }
}
