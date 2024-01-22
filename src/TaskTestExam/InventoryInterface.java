package TaskTestExam;

import java.util.ArrayList;
import java.util.List;

public interface InventoryInterface {


    void sellProduct(Product product, Customer customer, int quantity);
    void restockProduct(Product product, int quantity);
    void displayProductList(List<Product> products);
    void displayCustomerList(List<Customer> customers);
    void saveDataToFile(List<Product> products, List<Customer> customers, List<SalesTransaction> transactions);
    List<Product> loadProductsFromFile();
    List<Customer> loadCustomersFromFile();
    List<SalesTransaction> loadTransactionsFromFile();




}
