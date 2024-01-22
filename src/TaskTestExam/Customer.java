package TaskTestExam;

public class Customer extends AbstractEntity{

    protected String customerName;
    protected String totalPurchases;
    protected String customerID;


    void displayCustomerInfo(){

    }

    public Customer(String totalPurchases, String customerID) {
        this.totalPurchases = totalPurchases;
        this.customerID = customerID;
        customerID = generateId();
    }

    @Override
    String generateId() {
        return null;
    }

    @Override
    String toFileString() {
        return null;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(String totalPurchases) {
        this.totalPurchases = totalPurchases;
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
                ", totalPurchases='" + totalPurchases + '\'' +
                ", customerID='" + customerID + '\'' +
                "} " ;
    }
}
