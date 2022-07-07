package Sanipet;

import java.util.Date;

public class Dog extends Patient {
    public Dog(String clinicNumber, String name, String breed, Owner owner, boolean isVaccinated, Date desparasization) {
        super(clinicNumber, name, breed, owner, isVaccinated, desparasization);
    }
}
