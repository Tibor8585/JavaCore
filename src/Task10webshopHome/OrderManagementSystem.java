package Task10webshopHome;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order();
        order.makeOrder();

        ProductAvailabilityService productAvailabilityService = new ProductAvailabilityService();

        PaymentService paymentService = new PaymentService();

       boolean available = productAvailabilityService.getAvailability();

        if (available){
           int price = paymentService.getprice();
           System.out.println("Siekres! Az ára: " + price + "Forint.");
        }else {
            System.out.println("A termék nem elérhető.");
        }


    }
}
