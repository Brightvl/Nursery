package view.consoleUi.menu.commands;

import view.consoleUi.menu.commands.interfaces.Command;
import view.consoleUi.menu.commands.interfaces.MenuCloser;

public class BackMenu implements Command {
    private MenuCloser menuToClose;

    public BackMenu(MenuCloser menuToClose) {
        this.menuToClose = menuToClose;
    }

    @Override
    public String getDescription() {
        return "Вернуться назад";
    }

    @Override
    public void execute() {
        menuToClose.closeMenu();
    }
}
