package Sanipet;

import java.time.LocalDateTime;
import java.util.Date;

public class Dog extends Patient {
    public Dog( String name, String breed, Owner owner, boolean isVaccinated) {
        super(name, breed, owner, isVaccinated);
    }
}
