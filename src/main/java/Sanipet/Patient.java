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
}
