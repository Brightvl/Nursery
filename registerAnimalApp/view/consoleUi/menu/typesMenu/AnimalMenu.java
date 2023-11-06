package view.consoleUi.menu.typesMenu;

import model.register.animal.Animal;
import view.consoleUi.ConsoleUI;
import view.consoleUi.interactionConsole.ConsoleReader;
import view.consoleUi.menu.Menu;
import view.consoleUi.menu.commands.BackMenu;
import view.consoleUi.menu.commands.LearnCommand;
import view.consoleUi.menu.commands.ShowAnimalCommand;
import view.consoleUi.menu.commands.interfaces.Command;
import view.consoleUi.menu.commands.interfaces.MenuCloser;

import java.util.ArrayList;


public class AnimalMenu extends Menu implements MenuCloser {
    ConsoleUI consoleUI;
    private boolean isRunning;
    ConsoleReader consoleReader;
    String typeAnimal;
    String nameAnimal;

    public AnimalMenu(ConsoleUI consoleUI, String typeAnimal, String nameAnimal) {
        super(new ArrayList());
        this.consoleUI = consoleUI;
        this.isRunning = true;
        consoleReader = new ConsoleReader();
        initCommands();
        this.typeAnimal = typeAnimal;
        this.nameAnimal = nameAnimal;
    }

    private void initCommands() {
        addCommand(new ShowAnimalCommand(consoleUI));
        addCommand(new LearnCommand(consoleUI));
        addCommand(new BackMenu(this));
    }



    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void closeMenu() {
        setRunning(false);
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }


}
