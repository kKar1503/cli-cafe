package cafe.models;

import java.util.*;

public class Receipt {
    private final int id;
    private final String date;
    private final double totalAmount;
    private final Map<Food, Integer> foodItems;

    public Receipt(int id, String date, double totalAmount, Map<Food, Integer> foodItems) {
        this.id = id;
        this.date = date;
        this.totalAmount = totalAmount;
        this.foodItems = foodItems;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Map<Food, Integer> getFoodItems() {
        return foodItems;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Receipt receipt)) return false;
        return id == receipt.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
