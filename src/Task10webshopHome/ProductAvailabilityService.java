package Task10webshopHome;

import Task13Car.Racer;

import java.util.Random;

public class ProductAvailabilityService {

    public boolean getAvailability(){
        Random random = new Random();
        boolean isAvailable = false;
        int number = random.nextInt(1, 4);
        if(number==1){
           isAvailable=false;
        }else {
            isAvailable=true;
        }
        return isAvailable;
    }


}
