package Sanipet;

import employee.*;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        // Create logic and option menu here
//        Owner karlo = new Owner("128813", "Karlo", "543454", 19);
//
//        Cat cat1 = new Cat("koko", "null", karlo, true);
//
//        System.out.println(cat1.desparasization);

        double optSelected = menu();

        System.out.println("You Selected "+ optSelected);

        if(optSelected == 1.0) {
            // Do register User

        }
    }

    private static double menu(){
        double userInput;

        System.out.println(
              """
                Welcome to the Sanipet Organizer
                Choose an option:
                1. Register patient.
                2. Appointment:
                    2.1 Create appointment:
                    2.2 Update appointment.
                    2.3 Cancel appointment.
                    2.4 Filter by day.
                3. Billing.
                4. Medicine stock.
                5. Exit.
              """
            );

        System.out.println("Choose an option: ");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextDouble();

        return userInput;
    }


//    int userInput = 0;
//        while(userInput != 5) {
//            System.out.println(
//              """
//                Welcome to the Sanipet Organizer
//                Choose an option:
//                1. Register patient
//                2. Appointment
//                3. Billing
//                4. Medicine stock
//                5. Exit
//              """
//            );
//            System.out.println("Choose an option: ");
//            Scanner scanner = new Scanner(System.in);
//            userInput = scanner.nextInt();
//
//            if(userInput == 1) {
//                                System.exit(1);
//            }
//
//            if(userInput == 2 ){
//                System.out.println("""
//                2.1 By day
//                2.2 By Doctor
//                2.3 By stilist""");
//            }
//            if(userInput == 4 ){
//                System.out.println( """
//                4.1 Pills
//                4.2 Syrup
//                4.3 Pet-care """);
//            }
//
//            if(userInput == 5) {
//                System.out.println("Bye bye");
//                System.exit(1);
//            }
//        }
//    * */

}
