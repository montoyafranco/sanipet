package Sanipet;

import java.time.LocalDateTime;
import java.util.Random;

public class Patient {

    //attributes
    private Random rnd = new Random();

    protected String clinicNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected boolean isVaccinated;
    protected LocalDateTime desparasization;
    protected PetType pet;

    protected Patient(PetType pet, String name, String breed, Owner owner, boolean isVaccinated) {
        this.clinicNumber = generateNumber();
        this.name = name;
        this.pet = pet;
        this.breed = breed;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
        this.desparasization = LocalDateTime.now();
    }

    protected String generateNumber(){
        int id = rnd.nextInt(999999);
        return String.format("%06d", id);
    }
}
