package TaskTestExam2;

public class Customer extends AbstractEntity {
protected String customerName;
protected  int  totalPurchases;
protected String customerID;


    public Customer(String customerName, int totalPurchases) {
        this.customerName = customerName;
        this.totalPurchases = totalPurchases;
        customerID =generateId();
    }

    @Override
    protected String toFileString() {
        return customerID + ", " + customerName + ", " + totalPurchases;
    }

    void displayCustomerInfo(){
        System.out.println(toFileString());
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", totalPurchases=" + totalPurchases +
                ", customerID='" + customerID + '\'' +
                "} ";
    }
}
