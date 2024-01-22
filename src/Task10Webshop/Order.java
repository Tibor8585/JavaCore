package Task10Webshop;

import java.util.Scanner;

public class Order implements OrderInterFace {
    private String productName;
    private int productCount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public void makeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add mega termék nevét: ");
        productName = scanner.nextLine();
        System.out.println("Add mega termék darabszámát: ");
        productCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Mentve a kosárba.");
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
