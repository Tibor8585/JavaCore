package Task01;

import Task01.Car;

public class PlayGround {
    public static void main(String[] args) {
        Car ferrari = new Car("Gt1000", "red");
        Car fiat = new Car();
        Car kia = new Car();
       // ferrari.color = "red";
        ferrari.setColor("red");
     //   ferrari.model = "GT1000";
        ferrari.setModel("GT1000");

       // kia.color = "black";
       // kia.model = "Sport";
       // kia.model = "Old";
        kia.setModel("New");
        kia.setColor("red");
        System.out.println(kia.getValues());
        System.out.println(kia.getModel());

    }
}
