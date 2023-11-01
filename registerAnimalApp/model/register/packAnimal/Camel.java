package model.register.packAnimal;

import java.util.Date;

public class Camel extends PackAnimal{
    public Camel(String name, Date birthDate) {
        super(name, birthDate);
        super.setType("Camel");
    }
}
