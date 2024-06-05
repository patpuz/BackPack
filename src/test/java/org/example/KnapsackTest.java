package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class KnapsackTest {





    @Test
    public void testAtLeastOneItemReturnedIfFits() {
        Knapsack knapsack = new Knapsack(10, 1);
        Result result = knapsack.solve(50);
        assertFalse(result.getItems().isEmpty());
    }

    @Test
    public void testNoItemsReturnedIfNoneFit() {
        Knapsack Knapsack = new Knapsack(10, 1);


        Result result = Knapsack.solve(0);
        assertTrue(result.getItems().isEmpty());
    }

    @Test
    public void testItemWeightsAndValuesWithinBounds() {
        Knapsack knapsack = new Knapsack(10, 1);
        for (Item item : knapsack.items) {
            assertTrue(item.getWeight() >= 1 && item.getWeight() <= 10);
            assertTrue(item.getValue() >= 1 && item.getValue() <= 10);
        }
    }

    @Test
    public void testCorrectnessOfKnapsackSolution() {
        Knapsack fixedKnapsack = new Knapsack(3, 1);
        Result result = fixedKnapsack.solve(10);
        int expectedTotalValue = 16;
        int expectedTotalWeight = 8;
        assertEquals(expectedTotalValue, result.getTotalValue());
        assertEquals(expectedTotalWeight, result.getTotalWeight());
    }
}
