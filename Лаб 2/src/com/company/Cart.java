package com.company;

import java.sql.Struct;

public class Cart {
    private int currentSize;
    private final Item[] items;
    private boolean empty;

    public Cart(int size) {

        if (size <= 0)
            throw new IllegalArgumentException("Размер стэка должен быть позитивный");

        currentSize = 0;
        empty = true;
        items = new Item[size];
    }

    public void pushItem(Item item) {
        if (currentSize == items.length)
            throw new IllegalStateException("Stack переполнен");

        items[currentSize] = item;
        currentSize++;
        empty = false;
    }

    public Item popItem() {
        if (currentSize == 0)
            throw new IllegalStateException("Stack пустой");

        Item returnItem = items[currentSize - 1];
        items[currentSize - 1] = null;
        currentSize--;
        empty = currentSize == 0;

        return returnItem;
    }

    public double totalPrice() {

        double total = 0;

        for (int i = 0; i < currentSize; i++)
            total += items[i].price;

        return total;
    }

    public void raisePriceAll(float percent) {

        for (int i = 0; i < currentSize; i++)
            items[i].raisePrice(percent);
    }

    public void decreasePriceAll(float percent) {

        for (int i = 0; i < currentSize; i++)
            items[i].decreasePrice(percent);
    }

    public boolean isEmpty() {
        return empty;
    }
}
