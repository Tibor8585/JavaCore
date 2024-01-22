package Task10;

import java.util.Random;

public class PaymentService {

    public int getPrice() {
        Random random = new Random();
        int price = random.nextInt(200, 2000);

        return price;
    }
}
