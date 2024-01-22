package Task14abstract;

public class HrAssistant extends Employee {
    private Boolean NoMorePeople;


    public HrAssistant(String position, String name, String salary, Boolean noMorePeople) {
        super(position, name, salary);
        NoMorePeople = noMorePeople;
    }

    @Override
    public int computePay() {
        return 0;
    }
}