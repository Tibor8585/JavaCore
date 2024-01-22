package Task16Dog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DogRegister {
    List<AbstractDog> dogsList = new ArrayList<>();

    public List<AbstractDog> getDogsList() {
        return dogsList;
    }

    public void setDogsList(List<AbstractDog> dogsList) {
        this.dogsList = dogsList;
    }

    void readCsvFile(){

        try {
            List<String> dogFile = Files.readAllLines(Path.of("resources/Dog.csv"));
            for (String dog : dogFile){
                String[]dogs = dog.split(", ");
                String type = dogs[0];
                String name = dogs[1];
                String gender = dogs[2];
                String birthDay = dogs[3];
                String weight = dogs[4];
                String additionalProperties = dogs[5];

                if (type.equals("Bulldog")){
                    dogsList.add(new Bulldog(type, name, gender, birthDay, weight, additionalProperties));
                }else if (type.equals("YorkshireTerrier")){
                    dogsList.add(new YorkshireTerrier(type, name, gender, birthDay, weight, additionalProperties));
                }else if (type.equals("CaucasianShepherd")){
                    dogsList.add(new CaucasianShepherd(type, name, gender, birthDay, weight, additionalProperties));
                }else {
                    System.out.println("Wrong dog.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }


}
