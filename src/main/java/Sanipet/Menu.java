package Sanipet;

import Medicines.Medicine;
import employee.Resources;

import java.util.Scanner;

public class Menu {

    public static int menu(String message){
        Principal.clearConsole();
        int userInput;
        System.out.println(message);

        System.out.println("Choose an option: ");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();

        return userInput;
    }

    public static void appointmentMenu() {
        int appointOption = menu(
                """
                1. Create appointment:
                2. Update appointment.
                3. Cancel appointment.
                4. Filter by day.
                """);
        Creation.appointmentOptions(appointOption);
    }
    
    public static void showStock() {
        System.out.print(
        """
           Name  ||Stock|| Present.
        ------------------------------
        """);
        for(Medicine med : Resources.getMedicines()) {
            System.out.print(
                String.format(
                    """
                    %s || %d || %s
                    """,
                    med.getName(), med.getStock(), med.getPresentation().toString()
                )
            );
        }
    }
    
//    public static void showEmployee() {
//        System.out.print(
//        """
//           Name  || Surname || Present.
//        ------------------------------
//        """);
//    }
    
    public static boolean askYesNo(String question) {
        Scanner input = new Scanner(System.in);
        String answer;
        boolean askAgain;

        do {
            System.out.print(question);
            answer = input.nextLine().trim().toUpperCase();
            askAgain = !"Y".equals(answer) && !"N".equals(answer);
        } while (askAgain);

        return "Y".equals(answer);
    }

    static PetType askPetType() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        PetType pet;

        do {
            System.out.println(
                    """
                    Is your pet a cat or a dog?
                         1. Cat    2. Dog
                    """
            );
            userInput = scanner.nextInt();

            pet = userInput == 1 ?
                    PetType.CAT : PetType.DOG;

        } while(userInput < 1 || userInput > 2);

        return pet;
    }
}
