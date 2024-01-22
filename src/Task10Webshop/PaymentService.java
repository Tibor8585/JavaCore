package Task10Webshop;

import java.util.Random;

public class PaymentService {
   public int getPrice(){
       Random random = new Random();
       int price = random.nextInt(1000, 10000);

       return price;
   }
}
