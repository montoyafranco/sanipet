package Sanipet;

import employee.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static List<Owner> owners = new ArrayList<>();

    public static void main(String[] args) {
        // Create logic and option menu here
        int optSelected;

        do {
//          System.out.println("You Selected "+ optSelected);
            optSelected = Menu.principal();
            switch(optSelected) {
                case 1:
                    owners.add(Menu.newUser());
                break;
                case 2:
                break;
                case 21:
                break;
                case 22:
                break;
                case 23:
                break;
                case 24:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                default:
                    System.out.println("Please select a valid option!!");
            }
        } while(optSelected != 5);

        for(Owner ow : owners) {
          System.out.println(ow.getName());
        }
    }
}
