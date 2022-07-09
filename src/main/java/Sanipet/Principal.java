package Sanipet;

import Medicines.Medicine;
import employee.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static List<Owner> owners = new ArrayList<>();
    private static List<Patient> pets = new ArrayList<>();
    private static List<Medicine> medicines = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        // Create logic and option menu here

        boolean seeAgain;
        do {
            int optSelected = Menu.menu(
                """
                Welcome to the Sanipet Organizer
                Choose an option:
                1. Register patient.
                2. Appointment:
                3. Billing.
                4. Medicine stock.
                5. Exit.
                """);
            switch(optSelected) {
                case 1:
                    Owner owner = Creation.newOwner();
                    owners.add(owner);
                    pets.add(Creation.newPatient(owner));
                    break;
                case 2:
                    Menu.appointmentMenu();
                    break;
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
                 case 5:
                 return;
                default:
                    System.out.println("Please select a valid option!!");
            }
            for(Patient pet : pets) {
                System.out.println(
                        String.format("%s's owner is %s",
                                pet.name, pet.owner.getName())
                );
            }
            seeAgain = Menu.askYesNo(
                    "Do you want tu see the menu again?? [Y]/[N]"
            );
            clearConsole();
        } while(seeAgain);
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void defaultStaff() {
        // create doctors, stylists, and medicines;
    }
}
