package Task16Dog;

public abstract class AbstractDog {
    protected String type;
    protected String gender;
    protected String birthDay;
    protected String weight;
    protected String additionalProperties;

    @Override
    public String toString() {
        return "AbstractDog{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", weight='" + weight + '\'' +
                ", additionalProperties='" + additionalProperties + '\'' +
                '}';
    }

    public AbstractDog(String type, String name, String gender, String birthDay, String weight, String additionalProperties) {
        this.type = type;
        this.gender = gender;
        this.birthDay = birthDay;
        this.weight = weight;
        this.additionalProperties = additionalProperties;


    }
}
