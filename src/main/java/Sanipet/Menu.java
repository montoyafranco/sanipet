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

    public static Owner newOwner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your DNI: ");
        String dni = scanner.nextLine();
        System.out.println("Enter your name: " );
        String name = scanner.nextLine();
        System.out.println("Enter cellphone: ");
        String cellphone = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        Owner newOwner = new Owner(dni,name, cellphone, age);
        return newOwner;
    }

    public static Patient newPatient(Owner owner) {
        PetType pet = askPetType();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your pet's name: " );
        String name = scanner.nextLine();
        System.out.println("Enter your pet's breed: ");
        String breed = scanner.nextLine();
        boolean isVaccinated = askYesNo("Is your pet vaccinated? [Y]/[N]");

        return new Patient(pet, name, breed, owner, isVaccinated);
    }

    public static boolean askYesNo(String question) {
        Scanner input = new Scanner(System.in);
        String answer;
        boolean askAgain;

        do {
            System.out.print(question);
            answer = input.next().trim().toUpperCase();
            askAgain = !"Y".equals(answer) && !"N".equals(answer);
        } while (askAgain);

        return "Y".equals(answer);
    }

    private static PetType askPetType() {
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
