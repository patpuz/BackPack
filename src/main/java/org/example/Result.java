package org.example;

import java.util.List;

public class Result {
    private List<Item> items;
    private int totalValue;
    private int totalWeight;

    public Result(List<Item> items, int totalValue, int totalWeight) {
        this.items = items;
        this.totalValue = totalValue;
        this.totalWeight = totalWeight;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total Value: ").append(totalValue).append("\n");
        sb.append("Total Weight: ").append(totalWeight).append("\n");
        return sb.toString();
    }
}
