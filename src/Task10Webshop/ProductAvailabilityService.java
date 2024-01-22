package Task10Webshop;

import java.util.Random;

public class ProductAvailabilityService {
    public boolean getAvailability(){
        boolean isAvailable = false;
        Random rnd = new Random();
        int result = rnd.nextInt(4);

        if(result==0){
            isAvailable=false;
        }else {
            isAvailable=true;
        }

        return isAvailable;
    }
}
