package cafe.views;

import cafe.models.Food;
import cafe.models.Receipt;

import java.util.*;

public class PastReceiptsView {
    private final int page;
    private final List<Receipt> receipts;

    public PastReceiptsView(int page) {
        this.page = page;
        // Use the page number to fetch the corresponding receipts from the database
        // Sorted by date, with the most recent first
        this.receipts = Collections.emptyList(); // TODO: Initialize with actual receipts from the database
    }

    public void show() {
        if (receipts.isEmpty()) {
            System.out.println("No past receipts found.");
            return;
        }
        System.out.printf("Past Receipts (Page %d):%n", page);
        for (Receipt receipt : receipts) {
            System.out.println("Receipt ID: " + receipt.getId());
            System.out.println("Date: " + receipt.getDate());
            System.out.println();
            System.out.println("Items:");
            for (Map.Entry<Food, Integer> entry : receipt.getFoodItems().entrySet()) {
                System.out.println("- " + entry.getKey().getName() + " x " + entry.getValue());
            }
            System.out.println("Total Amount: " + receipt.getTotalAmount());
            System.out.println("-----------------------------");
        }
    }
}
