package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Knapsack {
    private int n;
    private int seed;
    List<Item> items;
    private Random random;

    public Knapsack(int n, int seed) {
        this.n = n;
        this.seed = seed;
        this.random = new Random(seed);
        this.items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = random.nextInt(10) +1;
            int weight = random.nextInt(10) +1;
            Item item = new Item(weight, value);
            items.add(item);
        }
    }

    public Result solve(int capacity) {
        List<Item> sortedItems = new ArrayList<>(items);
        sortedItems.sort((a, b) -> Double.compare((double)b.getValue() / b.getWeight(), (double)a.getValue() / a.getWeight()));

        int totalValue = 0;
        int totalWeight = 0;
        List<Item> packedItems = new ArrayList<>();

        for (Item item : sortedItems) {
            while (totalWeight + item.getWeight() <= capacity) {
                packedItems.add(item);
                totalWeight += item.getWeight();
                totalValue += item.getValue();
            }
        }

        return new Result(packedItems, totalValue, totalWeight);
    }

    @Override
    public String toString() {
        return "Knapsack{" +
                "items=" + items +
                '}';
    }
}
