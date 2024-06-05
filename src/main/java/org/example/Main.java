package org.example;

public class Main {
    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack(1000, 55);
        System.out.println("Generated items");
        System.out.println(knapsack);

        Result result = knapsack.solve(100);
        System.out.println("Knapsack result:");
        System.out.println(result);
    }
}
