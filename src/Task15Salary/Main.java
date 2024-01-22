package Task15Salary;

public class Main {


    public static void main(String[] args) {
        HungarianSalary hun = new HungarianSalary(36);
        hun.salaryCalculation(4000, 22);
        hun.writeThanksNote();

        USSSalary uss = new USSSalary(30);
        uss.salaryCalculation(300, 20);

    }
}
