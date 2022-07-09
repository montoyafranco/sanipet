package Sanipet;

import employee.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static List<Owner> owners = new ArrayList<>();

    public static void main(String[] args) {
        // Create logic and option menu here
        double optSelected = Menu.principal();

        System.out.println("You Selected "+ optSelected);

        if(optSelected == 1.0) {
            owners.add(Menu.newUser());
        }

        System.out.println(owners.get(0).toString());
    }
}
