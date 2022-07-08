package Sanipet;

import employee.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

       int userInput = 0;
        while(userInput != 5) {
            System.out.println(
            "\nWelcome to the Sanipet Organizer\n" +
            "Choose an option: \n" +
            "1. Register patient \n"+
            "2. Appointment \n" +
            "3. Billing \n "+
            "4. Medicine stock\n" +
            "5. Exit\n"
            );
            System.out.println("Choose an option: ");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();

            if(userInput == 1) {
                                System.exit(1);
            }

            if(userInput == 2 ){
                System.out.println(
                "\t2.1 By day \n"+
                        "\t2.2 By Doctor \n " +
                        "\t2.3 By stilist \n ");
            }
            if(userInput == 4 ){
                System.out.println( "\t4.1 Pills \n "+
                              "\t4.2 Syrup \n "+
                              "\t4.3 Pet-care \n ");
            }

            if(userInput == 5) {
                System.out.println("Bye bye");
                System.exit(1);
            }

        }




        // Create logic and option menu here
    }
}
