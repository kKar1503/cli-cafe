package cafe.controllers;

import cafe.views.PastReceiptsView;

import java.util.Scanner;

public class PastReceiptsController {
    private int page = 1;

    public void showPastReceipts() {
        new PastReceiptsView(page).show();
    }

    public boolean handleUserInput() {
        // TODO: Implement logic to check if there are next and previous page
        boolean hasPreviousPage = false;
        boolean hasNextPage = false;

        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        if (hasPreviousPage) {
            System.out.printf("%d. Previous Page%n", choice++);
        }
        if (hasNextPage) {
            System.out.printf("%d. Next Page%n", choice++);
        }
        System.out.printf("%d. Back to Main Menu%n", choice);
        System.out.print("Please enter your choice: ");
        int selection = scanner.nextInt();
        while (selection < 1 || selection > choice) {
            System.out.printf("Invalid choice. Please enter a number between 1 and %d: ", choice);
            selection = scanner.nextInt();
        }
        switch (selection) {
            case 1:
                if (hasPreviousPage) {
                    page--;
                    break;
                }
            case 2:
                if (hasNextPage) {
                    page++;
                    break;
                }
            case 3:
                return true; // Back to main menu
        }
        return false; // Continue showing past receipts
    }
}
