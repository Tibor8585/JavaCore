package TaskTestExam2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InventoryService implements InventoryInterface{
    List<Product> products = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();
    List<SalesTransaction> transactions = new ArrayList<>();


    public InventoryService() {
        products=loadProductsFromFile();
        customers=loadCustomersFromFile();
        transactions=loadTransactionsFromFile();

    }

    @Override
    public void sellProduct(Product product, Customer customer, int quantity) {
        for(Product storedProducts : products){
            if(storedProducts.getProductName().equals(product.getProductName())){
                storedProducts.setAvailableQuantity(storedProducts.getAvailableQuantity()-quantity);
                SalesTransaction salesTransaction = new SalesTransaction(storedProducts, customer, quantity);
                transactions.add(salesTransaction);
                customers.add(customer);

                salesTransaction.displayTransactionInfo();
                customer.displayCustomerInfo();
                storedProducts.displayProductInfo();
            }else {
                System.out.println("Hiba lépett fel a vásárlás során.");
            }
        }

    }

    @Override
    public void restockProduct(Product product, int quantity) {
        if (products.contains(product)){
            for(Product storedProducts : products){
               if (storedProducts.getProductCode().equals(product.getProductCode())){
                   storedProducts.setAvailableQuantity(storedProducts.getAvailableQuantity() + quantity);
               }else {
                   products.add(product);
                   product.setAvailableQuantity(quantity);

               }
            }

        }


    }

    @Override
    public void displayProductList() {
        System.out.println("Products: " + products);

    }

    @Override
    public void displayCustomerList() {
        System.out.println("Customers: " + customers);
    }

    @Override
    public void displayTransactionList() {
        System.out.println("Transactions: " + transactions);
    }

    @Override
    public void saveDataToFile() {
        String content = "";
        for (Product product: products){
            content+=product + System.lineSeparator();
            write("products.txt", content);
        }

        content="";
        for(Customer customer: customers){
            content+=customer + System.lineSeparator();
            write("customers.txt", content);
        }

        content="";
        for (SalesTransaction transaction : transactions){
            content+=transaction + System.lineSeparator();
            write("transactions.txt", content);
        }

    }

    @Override
    public List<Product> loadProductsFromFile() {
        List<Product> products = new ArrayList<>();
        List<String>productFromfile = read("products.txt");
        for(String productsFromFile : productFromfile ){
            String[] productsElement= productsFromFile.split(", ");
            Product product = new Product();
            product.setProductCode(productsElement[0]);
            product.setProductName(productsElement[1]);
            product.setUnitPrice(Integer.parseInt(productsElement[2]));
            product.setAvailableQuantity(Integer.parseInt(productsElement[3]));
            products.add(product);

        }


        return products;
    }

    @Override
    public List<Customer> loadCustomersFromFile() {
        List<Customer> customers = new ArrayList<>();
        List<String>customersFromFile= read("customers.txt");
        for(String customerFromFile : customersFromFile){
            String[] customerElements = customerFromFile.split(", ");
            Customer customer = new Customer(customerElements[1], Integer.parseInt(customerElements[2]));
            customer.setCustomerID(customerElements[0]);
            customers.add(customer);
        }
        return customers;

    }

    @Override
    public List<SalesTransaction> loadTransactionsFromFile() {
        List<SalesTransaction> salesTransactions = new ArrayList<>();
        List<String>transactionsFromFile = read("transactions.txt");
        for(String transactionFromFile : transactionsFromFile){
            String[] transactionElement = transactionFromFile.split(", ");

            Product product = new Product();
            product.setProductCode(transactionElement[1]);
            product.setProductName(transactionElement[2]);
            product.setUnitPrice(Integer.parseInt(transactionElement[3]));
            product.setAvailableQuantity(Integer.parseInt(transactionElement[4]));

            Customer customer = new Customer(transactionElement[6], Integer.parseInt(transactionElement[7]));
            customer.setCustomerID(transactionElement[5]);

            SalesTransaction salesTransaction = new SalesTransaction(product, customer, Integer.parseInt(transactionElement[8]));
            salesTransaction.setTransactionDate(LocalDateTime.parse(transactionElement[0]));
            salesTransactions.add(salesTransaction);


        }

        return salesTransactions;
    }

    public static void write(String fileName,String content){
        try {

            Files.write(Paths.get("savedFiles/" + fileName), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> read (String fileName){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("savedFiles/" + fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }
        return lines;

    }
}
