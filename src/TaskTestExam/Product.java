package TaskTestExam;

import java.util.Random;

public class Product extends AbstractEntity {
protected String productName;
protected String productCode;
protected int unitPrice;
protected int availableQuantity;



void displayProductInfo(){

}

    public Product() {
    productCode = generateId();
    Random rnd = new Random();
    unitPrice = rnd.nextInt(100,1000);
    }

    @Override
    String generateId() {
        return null;
    }

    @Override
    String toFileString() {
        return null;
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
