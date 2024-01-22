package Task10webshopHome;

import java.util.Scanner;

public class Order implements OrderInterface{
private String productName;
private int productNumber;
    @Override
    public void makeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a vásárolni kívánt termék nevét");
        productName = scanner.nextLine();
        System.out.println("Add meg a vásárolni kívánt termék darabszámát");
        productNumber =Integer.parseInt(scanner.nextLine());
        System.out.println("Köszönjük a megrendelést!");

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", productNumber=" + productNumber +
                '}';
    }
}
