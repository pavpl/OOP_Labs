package com.company;

public class Item {

    public String name;
    public float price;

    public Item(String name, float price) {
        if (name == null)
            throw new NullPointerException("Имя не может быть null");

        if (name.isEmpty())
            throw new IllegalArgumentException("Имя не может быть пустым");

        this.name = name;
        this.price = price >= 0 ? price : 0;
    }

    public void raisePrice(float percent) {

        if (percent < 0)
            throw new IllegalArgumentException("Проценты не могут быть отрицательными");

        this.price += this.price * percent;
    }

    public void decreasePrice(float percent) {

        if (percent < 0)
            throw new IllegalArgumentException("Проценты не могут быть отрицательными");

        if (percent > 1)
            this.price = 0;
        else
            this.price -= this.price * percent;
    }
}
