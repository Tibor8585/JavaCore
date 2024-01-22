package Task15Salary;

public class HungarianSalary extends Salary {
   protected int  hungarianTaxes;

    @Override
    protected void salaryCalculation(int dailySalary, int workedDay) {
        System.out.println("Magyar fizetés: " + dailySalary * workedDay/hungarianTaxes);
    }

    public HungarianSalary(int hungarianTaxes) {
        this.hungarianTaxes = hungarianTaxes;
    }
}
