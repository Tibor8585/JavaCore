package TaskTestExam;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        InventoryService inventoryService = new InventoryService();
        Product product = new Product();
        Customer customer = new Customer("3", "fd"); //Csak random valami

        System.out.println("Válasszon egy menüpontot (1/termékeladás, 2/termék bevételezés, 3/Elérhető termékek megjelenítése, 4/Vásárolt ügyfelek megjelenítése, 5/Tranzakciók megjelenítése, 6/Save and Exit )");

        String answer = scanner.nextLine();


        do {
            switch (answer){

                case "1":
                    System.out.println("Milyen terméket szeretne vásárolni?");
                    String productName = scanner.nextLine();
                    int number = scanner.nextInt();


                case "2":
                    System.out.println("Adja mega készlethez adandó termék nevét.");
                    productName = scanner.nextLine();
                    product.setProductName(productName);
                    System.out.println("Adja mega készlethez adandó termék darabszámát.");
                    number = scanner.nextInt();
                    product.setAvailableQuantity(number);
                    inventoryService.restockProduct(product, number);

                case "3":

                case "4":
                    System.out.println("Adja meg a vásárlóra vonatkozó adatokat");
                    String customerName = scanner.nextLine();
                    customer.setCustomerName(customerName);
                    customer.setCustomerID(customer.generateId());
                    System.out.println("Hanyadik alkalommal van itt vásárolni");
                    String numberOfShoppings = scanner.nextLine();
                    customer.setTotalPurchases(numberOfShoppings);

            }
        }while (answer.equals("6"));

        }

}

