package Task10;

import java.util.Scanner;

public class Order implements OrderInterface{
private String productName;
private int productCount;

    @Override
    public void makeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a vásárolni kívánt termék nevét");
        productName = scanner.nextLine();
        System.out.println("Add meg a vásárolni kívánt termék darabszámát");
        productCount = scanner.nextInt();
    }
}
