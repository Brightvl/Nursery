package model.register;

import model.register.animal.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalRegistry implements Iterable<Animal>{

    private List<Animal> animalList;

    private List<String> permissibleTypeOfAnimalsList = new ArrayList<>() {
        {
            {
                add("Cat");
                add("Hamster");
                add("Dog");
                add("Horse");
                add("Donkey");
                add("Camel");
            }
        }
    };

    public AnimalRegistry() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animalList.add(animal);
    }


    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<String> getPermissibleTypeOfAnimalsList() {
        return permissibleTypeOfAnimalsList;
    }

    @Override
    public String toString() {
        return "AnimalRegistry{" +
                "animalList=" + animalList +
                '}';
    }

    @Override
    public Iterator<Animal> iterator() {
        return animalList.iterator();
    }


}
