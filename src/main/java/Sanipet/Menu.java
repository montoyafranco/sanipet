package Sanipet;

import java.util.Scanner;

public class Menu {

    public static int principal(){
        int userInput;
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
        userInput = scanner.nextInt();


        return userInput;
    }

    public static Owner newUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your DNI: ");
        String dni = scanner.nextLine();
        System.out.println("Enter your name: " );
        String name = scanner.nextLine();
        System.out.println("Enter cellphone: ");
        String cellphone = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        Owner newOwner = new Owner(dni,name, cellphone, age);
        scanner.close();
        System.out.println(            String.format(
                """
                Owner name is  %s
                Owner dni is %s
                Owner cellphone is %s
                Owner age is %d
                """,
                name, dni, cellphone, age
            )
       );
        return newOwner;
    }

}
