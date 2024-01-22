package Task05regisztracioslap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Add meg az e-mail címet: ");
        String email = scan.nextLine();
        System.out.println("Add meg a neved: ");
        String name = scan.nextLine();
        System.out.println("Add meg a születési dátumot: ");
        int birthDate = scan2.nextInt();
        System.out.println("Add meg a telefonszámot");
        int phone = scan2.nextInt();
        System.out.println("Add meg a munkahelyet");
        String workplace = scan.nextLine();

        if (email.isEmpty() || name.isEmpty()){
            System.out.println("Az emailt, vagy a neved nem adtad meg.");
            System.exit(1);
        }

        RegistrationPage user = new RegistrationPage(email, name, birthDate);



        if (0< phone){
            user.setPhone(phone);
        }

        if (!workplace.isEmpty()){
            user.setWorkplace(workplace);
        }
        System.out.println(user);


    }
}
