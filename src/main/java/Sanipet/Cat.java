package Sanipet;

import java.time.LocalDateTime;
import java.util.Date;

public class Cat extends Patient {
    public Cat(String name, String breed, Owner owner, boolean isVaccinated) {
        super(name, breed, owner, isVaccinated);
    }
}
