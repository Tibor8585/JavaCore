package TaskTestExam2;

import java.util.List;

public interface InventoryInterface {
    void sellProduct(Product product, Customer customer, int quantity);
    void restockProduct(Product product, int quantity);
    void displayProductList();
    void displayCustomerList();
    void displayTransactionList();
    void saveDataToFile();
    List<Product> loadProductsFromFile();
    List<Customer> loadCustomersFromFile();
    List<SalesTransaction> loadTransactionsFromFile();

}
