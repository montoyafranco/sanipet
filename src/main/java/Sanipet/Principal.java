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

        boolean seeAgain;
        do {
            int optSelected = Menu.principal();
            switch(optSelected) {
                case 1:
                    Owner owner = Menu.newOwner();
                    owners.add(owner);
                    pets.add(Menu.newPatient(owner));
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
                 case 5:
                 break;
                default:
                    System.out.println("Please select a valid option!!");
            }

            for(Patient pet : pets) {
                System.out.println(
                        String.format("%s's owner is %s",
                                pet.name, pet.owner.getName())
                );
            }
            if(optSelected == 5) break;
            seeAgain = Menu.askYesNo(
                    "Do you want tu see the menu again?? [Y]/[N]"
            );
        } while(seeAgain);
    }
}
