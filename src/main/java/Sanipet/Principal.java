package Sanipet;

import employee.*;

public class Principal {
    public static void main(String[] args) {
        Employee doctor1 = new Doctor("Karlo", "Vanegas");

        doctor1.schedule.forEach(System.out::println);

        // Create logic and option menu here
    }
}
