package TaskTestExam;

import java.util.Random;

public abstract class AbstractEntity {
    protected String id;

    String generateId(){
        Random random = new Random();
        int number = random.nextInt(1000, 10000);
        id = "2024/ODR" + number;

        return id;
    };


    abstract String toFileString();

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id='" + id + '\'' +
                '}';
    }
}
