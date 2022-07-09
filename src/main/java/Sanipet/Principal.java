package Sanipet;

import employee.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static List<Owner> owners = new ArrayList<>();
    private static List<Patient> pets = new ArrayList<>();

    public static void main(String[] args) {
        // Create logic and option menu here

        int optSelected;

        do {
//          System.out.println("You Selected "+ optSelected);
            optSelected = Menu.principal();
            switch(optSelected) {
                case 1:
                    Owner owner = Menu.newOwner();
                    owners.add(owner);
                    Scanner scanner = new Scanner(System.in);

                    PetType pet = getPetType();

                    System.out.println("Enter your pet's name: " );
                    String name = scanner.nextLine();
                    System.out.println("Enter your pet's breed: ");
                    String breed = scanner.nextLine();
                    System.out.println("Is your pet vaccinated? ");
                    boolean isVaccinated = scanner.nextBoolean();
                    Patient newPatient = new Patient(pet, name, breed, owner, isVaccinated);
                break;
//                 case 2:
//                 break;
//                 case 21:
//                 break;
//                 case 22:
//                 break;
//                 case 23:
//                 break;
//                 case 24:
//                 break;
//                 case 3:
//                 break;
//                 case 4:
//                 break;
//                 case 5:
//                 break;
                default:
                    System.out.println("Please select a valid option!!");
            }
        } while(optSelected != 5);

        for(Patient pet : pets) {
          System.out.println("Pet name :" + pet.name);
          System.out.println("Pet's Owner" + pet.owner.getName());
        }
    }
    
    
    private static PetType getPetType() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        PetType pet;

        do {
            System.out.println(
                """
                    Is your pet a cat or a dog?
                    1. Cat        2. Dog
                """
            );
            userInput = scanner.nextInt();

            pet = userInput == 1 ?
                   PetType.CAT : PetType.DOG;
                   
        } while(userInput < 1 || userInput > 2);
        
        return pet;
    }
}
