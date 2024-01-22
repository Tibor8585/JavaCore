package Task06extended;

import Task06.Booking;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        int bookingID = 10000;
        int numberOfUsers = Integer.parseInt(args[0]);
        int arrayCounter = 0;

        List<Booking> users = new ArrayList<>();
        Set<Booking> usersSet = new HashSet<>();
        HashMap<Integer, Booking> usersMap = new HashMap<>();
        Booking[] usersArray = new Booking[numberOfUsers];


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
            usersSet.add(user);
            usersMap.put(bookingID, user);
            bookingID++;
            usersArray[arrayCounter]= user;

            System.out.println(users);
        }
        for (Map.Entry mapElement: usersMap.entrySet()){
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
        for(int i = 0; i < usersArray.length; i++) {
            System.out.println(usersArray[i]);
        }
    }
}
//Célszerű az összes beolvasást beletenni egy trycatch ágba, úgy mint a telefonszámot