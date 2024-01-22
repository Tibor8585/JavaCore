package Task06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        List<Booking> users = new ArrayList<>();
        int numberOfUsers = Integer.parseInt(args[0]);

        while (users.size()!=numberOfUsers) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Add meg a neved: ");
            String name = scan.nextLine();
            System.out.println("Add meg az érkezés dátumát: ");
            String checkIn = scan.nextLine();
            System.out.println("Add meg a távozás dátumát: ");
            String checkOut = scan.nextLine();
            System.out.println("Add meg a vendégek számát: ");
            int guestNumbers = scan.nextInt();
            System.out.println("Add meg a telefonszámot (opcionális): ");
            int phone = scan.nextInt();
            Booking user = new Booking(name, checkIn, checkOut, guestNumbers);
            user.setPhoneNumber(phone);
            users.add(user);
        }
        System.out.println(users);


        //Célszerű az összes beolvasást beletenni egy trycatch ágba,.


    }

}
