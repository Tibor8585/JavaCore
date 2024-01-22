package Task10;

import java.util.Random;

public class ProductAvailabilityService {
    public boolean getAvailability(){

        Random random = new Random();

        int availability = random.nextInt(1,3);
        boolean available = true;

        if (availability==1){
            available = false;
        }else {
            available = true;
        }
        return available;
    }
}
