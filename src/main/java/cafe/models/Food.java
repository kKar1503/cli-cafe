package cafe.models;

import java.util.Objects;

public class Food implements Comparable<Food> {
    private final int id;
    private final String name;
    private final String description;
    private final double price;
    private final Category category;

    public Food(int id, String name, String description, double price, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Food food)) return false;
        return id == food.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Food o) {
        return id - o.id;
    }
}
