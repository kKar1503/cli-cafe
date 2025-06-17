package cafe.controllers;

import cafe.models.Food;

import java.util.Map;

public class CartController {
    private boolean isCartEmpty = false;

    public void showCart(Map<Food, Integer> cart) {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            isCartEmpty = true;
            return;
        }

        System.out.println("Your Cart:");
        int count = 0;
        double totalPrice = 0.0;
        for (Map.Entry<Food, Integer> entry : cart.entrySet()) {
            Food food = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%d. %s | $%2f x %d = %2f%n", ++count, food.getName(), food.getPrice(), quantity, food.getPrice() * quantity);
            totalPrice += food.getPrice() * quantity;
        }
        System.out.printf("Total Price: $%2f%n", totalPrice);
    }

    public boolean handleUserInput(Map<Food, Integer> cart) {
        if (isCartEmpty) {
            return true; // Return true to stop further actions
        }

        System.out.println("1. Proceed to Checkout");
        System.out.println("2. Remove Item from Cart");
        System.out.println("3. Go Back to Main Menu");

        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.print("Please enter your choice: ");
            choice = new java.util.Scanner(System.in).nextInt();
        }

        switch (choice) {
            case 1:
                System.out.println("Proceeding to checkout...");
                // TODO: Implement checkout logic
                cart.clear(); // Clear the cart after checkout
                break;
            case 2:
                System.out.println("Removing item from cart...");
                // TODO: Implement logic to remove an item from the cart
                break;
            case 3:
                return true; // Return true to indicate going back
        }
        return false; // Return false to continue in the current context
    }
}
