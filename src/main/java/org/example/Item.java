package org.example;

public class Item {
    private int weight;
    private int value;
    private static int index;
    private int el;

    public Item(int weight, int value){
        this.value = value;
        this.weight = weight;
        this.el = index++;
    }

    public int getValue() {
        return value;
    }

    public int getWeight(){
        return weight;
    }

    public int getIndex(){
        return el;
    }

    @Override
    public String toString() {
        return "Item{" +
                "index=" + el +
                ", value=" + value +
                ", weight=" + weight +
                '}';
    }
}
