package Sanipet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Medicines.Medicine;
import employee.*;

public class Principal {
    private static List<Owner> owners = new ArrayList<>();
    private static List<Patient> pets = new ArrayList<>();

    public static void main(String[] args) {
        // Create logic and option menu here
        Resources.setDefaults();

         boolean seeAgain;
         do {
             int optSelected = Menu.menu(
                 """
                 Welcome to the Sanipet Organizer
                 Choose an option:
                 
                 1. Register patient.
                 2. Appointment...
                 3. Billing.
                 4. Medicine stock.
                 5. Exit.
                 """);
             switch(optSelected) {
                 case 1:
                     Owner owner = Creation.newOwner();
                     owners.add(owner);
                     if(owner  == null) break;
                     pets.add(Creation.newPatient(owner));
                     break;
                 case 2:
                     Menu.appointmentMenu();
                     break;
                 case 3:
                    Patient pet = selectPatient();
                    Medicine med = selectMedicine(pet);
                    pet.payMedicine(med);
                    break;
                    case 4:
                      Menu.showStock();
                    break;
                  case 5:
                  return;
                 default:
                     System.out.println("Please select a valid option!!");
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

    public static Medicine selectMedicine(Patient pet) {
        var medicines = pet.getMedicinesToPay();
        if(medicines.size() == 0) {
            System.out.println("You are up to date with your bills!!");
            return null;
        }
        System.out.println("Choose what bill you want to pay: ");
        int i = 1;
        for(Medicine med : medicines) {
            System.out.println(
                String.format(
                    """
                  %d. %s || %s || %d
                """, i, med.getQuantity(), med.getName(), med.getPrice()
                )
            );
        }
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        return medicines.get(userInput-1);
    }

    public static Patient selectPatient() {
        System.out.println("Please select the your pet: ");
                            int i = 1;
        System.out.println(
          """
              Idx ||   name   ||   owner   ||   type
          """);
        for(Patient pet : pets) {
          System.out.println(
                String.format(
          """
          %d. %s  || %s || %s
              """,
                          i,
              pet.name,
              pet.owner.getName(),
              pet.pet
            )
  );
          i++;
        }

Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        return pets.get(userInput-1);
    }

    public static void showPatients() {
        for(Patient pet : pets) {
            System.out.println(
                String.format("%s's owner is %s",
                        pet.name, pet.owner.getName())
            );
        }
    }
}
