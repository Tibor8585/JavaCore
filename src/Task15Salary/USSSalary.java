package Task15Salary;

public class USSSalary extends Salary {
protected int ussTaxes;
    @Override
    protected void salaryCalculation(int dailySalary, int workedDay) {
        System.out.println("A amerikai fizetés: " + dailySalary + workedDay/ussTaxes);

    }

    public USSSalary(int ussTaxes) {
        this.ussTaxes = ussTaxes;
    }
}
