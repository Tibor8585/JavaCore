package Task10;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order();
        order.makeOrder();

        PaymentService paymentService = new PaymentService();
        ProductAvailabilityService productAvailabilityService = new ProductAvailabilityService();

        if(productAvailabilityService.getAvailability()){
            System.out.println(" “Success! Thank you for your order. The price is: " + paymentService.getPrice() + "HUF");
        }else {
            System.out.println("Product is not available.");
        }
    }
}
