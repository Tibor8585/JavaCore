package TaskTestExam2;

import java.time.LocalDateTime;

public class SalesTransaction extends AbstractEntity {

    protected Product product;
    protected Customer customer;
    protected LocalDateTime transactionDate;

    protected String quantitySold;


    public SalesTransaction(Product product, Customer customer, int quantitySold) {
        this.product = product;
        this.customer = customer;
        this.quantitySold = String.valueOf(quantitySold); /// Ez se kell
        transactionDate=LocalDateTime.now();
    }

    @Override
    protected String toFileString() {
        return transactionDate + ", " + product.toFileString() + ", " + customer.toFileString() + ", " + quantitySold;
    }

    void displayTransactionInfo(){
        System.out.println(toFileString());

    };

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "SalesTransaction{" +
                "product=" + product +
                ", customer=" + customer +
                ", transactionDate=" + transactionDate +
                ", quantitySold='" + quantitySold + '\'' +
                "} " ;
    }
}
