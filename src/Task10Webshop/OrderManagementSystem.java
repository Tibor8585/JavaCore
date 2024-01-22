package Task10Webshop;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order();
        order.makeOrder();
        System.out.println(order);

        ProductAvailabilityService productAvailabilityService = new ProductAvailabilityService();
        boolean available = productAvailabilityService.getAvailability();
        System.out.println("Termék elérhetősége: " + available);

        if(available){
            PaymentService paymentService = new PaymentService();
            int price = paymentService.getPrice();
            System.out.println("Random ára: " + price);
            System.out.println("Siekres! Az ára: " + price + "Forint.");
        }else{
            System.out.println("A termék nem elérhető.");
        }

    }
}
