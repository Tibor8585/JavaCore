package TaskTestExam2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. Sell Product");
            System.out.println("2. Restock Product");
            System.out.println("3. Display Product List");
            System.out.println("4. Display Customer List");
            System.out.println("5. Display Transaction List");
            System.out.println("6. Save and Exit");

            String productName;
            Product product;
            int quantity;

            System.out.println("Válassz egy lehetőséget!");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Vásárolni kívánt termék neve?");
                    productName = scanner.nextLine();
                    product = new Product();
                    product.setProductName(productName);

                    System.out.println("Hány darabot vásárol?");
                    quantity = scanner.nextInt();

                    System.out.println("Vásárló neve?");
                    String customerName = scanner.nextLine();
                    Customer customer = new Customer(customerName, quantity*product.getUnitPrice());
                    inventoryService.sellProduct(product,customer,quantity);
                    break;
                case 2:
                    System.out.println("Feltölteni kívánt termék neve?");
                    productName = scanner.nextLine();
                    product = new Product();
                    product.setProductName(productName);

                    System.out.println("Feltölteni kívánt mennyiség?");
                    quantity = scanner.nextInt();
                    inventoryService.restockProduct(product,quantity);
                    break;
                case 3:
                    inventoryService.displayProductList();
                    break;
                case 4:
                    inventoryService.displayCustomerList();
                    break;
                case 5:
                    inventoryService.displayTransactionList();
                break;
                case 6:
                    inventoryService.saveDataToFile();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }


    }

}
