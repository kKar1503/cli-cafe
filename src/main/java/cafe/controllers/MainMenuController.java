package cafe.controllers;

import cafe.models.Food;
import cafe.views.PastReceiptsView;

import java.util.*;

public class MainMenuController {
    private Map<Food, Integer> cart = new TreeMap<Food, Integer>();

    public void showMainMenu() {
        // Logic to display the main menu options to the user
        System.out.println("Welcome to CLI Cafe");
        System.out.println("1. View Menu");
        System.out.println("2. View Cart");
        System.out.println("3. View Past Receipts");
        System.out.println("4. Exit");
    }

    public boolean handleUserInput() {
        // Logic to handle user input based on the choice made in the main menu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.print("Invalid choice. Please enter a number between 1 and 4: ");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                boolean shouldStopViewMenu = false;
                FoodMenuController foodMenuController = new FoodMenuController();
                while (!shouldStopViewMenu) {
                    foodMenuController.showFoodMenu();
                    shouldStopViewMenu = foodMenuController.handleUserInput();
                }
                break;
            case 2:
                boolean shouldStopCart = false;
                CartController cartController = new CartController();
                while (!shouldStopCart) {
                    cartController.showCart(cart);
                    shouldStopCart = cartController.handleUserInput(cart);
                }
                break;
            case 3:
                boolean shouldStopReceipts = false;
                PastReceiptsController pastReceiptsController = new PastReceiptsController();
                while (!shouldStopReceipts) {
                    pastReceiptsController.showPastReceipts();
                    shouldStopReceipts = pastReceiptsController.handleUserInput();
                }
                break;
            case 4:
                // Logic to exit the application
                System.out.println("Exiting the application. Goodbye!");
        }
        return choice == 4; // Return true if the user chose to exit
    }
}
