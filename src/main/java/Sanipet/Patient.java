package Sanipet;

import java.util.Date;

public abstract class Patient {

    //attributes

    protected String clinicNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected boolean isVaccinated;
    protected Date desparasization;

    protected String generateNumber(){
        return null;
    }

    public Patient(String clinicNumber,String name,String breed,Owner owner,boolean isVaccinated ,Date desparasization) {
        this.clinicNumber = clinicNumber;
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
        this.desparasization = desparasization
    }
}
