
import model.register.AnimalRegistry;
import model.register.animal.Animal;
import model.register.animal.Educable;
import model.register.pet.Cat;
import model.register.pet.Dog;
import view.consoleUi.ConsoleUI;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI();
//        consoleUI.getPresenter().getServiceAnimalRegistry().addAnimal(new Cat("Барсик", new Date(9, 9, 2020)));
        consoleUI.runProgram();


//        AnimalRegistry animalRegistry = new AnimalRegistry();
//        animalRegistry.addAnimal(new Cat("Барсик", new Date(9, 9, 2020)));
//        animalRegistry.addAnimal(new Dog("Шарик", new Date(9, 9, 2020)));
//

//
//        for (Animal animal : animalRegistry) {
//            if (animal.getName().equals("Шарик")) {
//                animal.addCommand("Лежать");
//            }
//        }
//
//
//        for (Animal animal : animalRegistry) {
//            for (String com : animal.getCommands()) {
//                if (com.equals("Сидеть")) {
//                    System.out.println(animal.getName());
//                }
//            }
//        }
//
//        for (Animal animal : animalRegistry) {
//            if (animal instanceof Cat) {
//                ((Cat) animal).showCommand();
//            }
//            if (animal instanceof Dog) {
//                ((Dog) animal).showCommand();
//            }
//
//        }
//
//    }
    }
}
