package TaskTestExam;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SalesTransaction {
    private  Product product;
    protected Customer customer;
    protected int quantitySold;
    protected LocalDateTime  transactionDate;


    public SalesTransaction(Product product, Customer customer, int quantitySold) {
        this.product = product;
        this.customer = customer;
        this.quantitySold = quantitySold;
        transactionDate = LocalDateTime.now();
    }

    void displayTransactionInfo(){

    };


   void toFileString(){

   };


}
