package TaskTestExam;

import java.util.ArrayList;
import java.util.List;

public class InventoryService implements InventoryInterface{

    List<Product> products = new ArrayList<>();
    List<Customer> customers= new ArrayList<>();
    List<SalesTransaction> transactions=new ArrayList<>();

    public InventoryService() {

    }

    @Override
    public void sellProduct(Product product, Customer customer, int quantity) {


    }

    @Override
    public void restockProduct(Product product, int quantity) {
        products.add(product);

    }

    @Override
    public void displayProductList(List<Product> products) {
        System.out.println(products);

    }


    @Override
    public void displayCustomerList(List<Customer> customers) {
       // customers.add();

    }

    @Override
    public void saveDataToFile(List<Product> products, List<Customer> customers, List<SalesTransaction> transactions) {

    }

    @Override
    public List<Product> loadProductsFromFile() {
        return null;
    }

    @Override
    public List<Customer> loadCustomersFromFile() {
        return null;
    }

    @Override
    public List<SalesTransaction> loadTransactionsFromFile() {
        return null;
    }




}
