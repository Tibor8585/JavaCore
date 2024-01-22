package Task10webshopHome;

import java.util.Random;

public class PaymentService {

    Random random = new Random();

    int getprice(){
        int price = random.nextInt(100, 1000);

        return price;
    }



}
