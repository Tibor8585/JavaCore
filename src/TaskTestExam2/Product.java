package TaskTestExam2;

import java.util.Random;

public class Product extends AbstractEntity {
    protected String productName;
    protected String  productCode;
    protected int unitPrice;
    protected int availableQuantity;


    public Product() {
        productCode = generateId();
        Random random = new Random();
        unitPrice= random.nextInt(100, 1000);
    }

    @Override
    protected String toFileString() {
        return productCode + ", " + productName + ", " + unitPrice + ", " + availableQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    void displayProductInfo(){
        System.out.println(toFileString());
    };

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", unitPrice=" + unitPrice +
                ", availableQuantity=" + availableQuantity +
                "} " ;
    }
}
