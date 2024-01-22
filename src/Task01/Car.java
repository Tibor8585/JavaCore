package Task01;

public class Car {
private String model;
private String color;
    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    public Car(){

    }


    public void setModel(String newmodel){
    this.model = newmodel;
}

    public void setColor(String newColor){
        color = newColor;
    }

    public String getModel(){
        return model;
    }

public String getValues(){
    return "Model: " + model + " Color: "  + color;
}
}
