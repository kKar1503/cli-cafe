package cafe;

import cafe.controllers.MainMenuController;

public class Main {
    public static void main(String[] args) {
        MainMenuController controller = new MainMenuController();
        boolean shouldExit = false;
        while (!shouldExit) {
            controller.showMainMenu();
            shouldExit = controller.handleUserInput();
        }
    }
}