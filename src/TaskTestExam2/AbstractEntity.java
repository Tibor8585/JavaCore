package TaskTestExam2;

import java.util.Random;

public abstract class AbstractEntity {
    protected String id;

   protected abstract String toFileString();


     protected String generateId(){
        Random random = new Random();
        int number = random.nextInt(1000, 10000);
        id = "2024/ODR" + number;

        return id;
    };

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id='" + id + '\'' +
                '}';
    }
}
