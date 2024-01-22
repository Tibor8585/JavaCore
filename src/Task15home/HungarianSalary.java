package Task15home;

public class HungarianSalary extends Salary {
protected int  hungarianTaxes;

    public HungarianSalary(int hungarianTaxes) {
        this.hungarianTaxes = hungarianTaxes;
    }


    @Override
    public void salaryCalculation(int dailySalary, int workedDay) {
        System.out.println("A havi netto bér magyarországon: " + workedDay*workedDay/hungarianTaxes);
    }
}
