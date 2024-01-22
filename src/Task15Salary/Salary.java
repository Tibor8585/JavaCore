package Task15Salary;

public abstract class Salary {
    abstract  void salaryCalculation(int dailySalary, int workedDay);
    protected void writeThanksNote (){
        System.out.println("Thanks for using me and let me assist in your calculation");
    }
}
