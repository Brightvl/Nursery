package model.register.pet;

import model.register.animal.Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pet extends Animal {


    public Pet(String name, Date birthDate) {
        super(name, birthDate);

    }

}
