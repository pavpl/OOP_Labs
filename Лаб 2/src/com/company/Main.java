package com.company;

public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart(10);

        Item[] items = {
                new Item("Молоко", 25.00f),
                new Item("Бананы", 30.00f),
                new Item("Кофе", 121.00f),
                new Item("Чай", 10.00f),
                new Item("Хлеб", 7.00f)
        };

        for (Item item : items)
            cart.pushItem(item);

        System.out.println("\nОбщая сумма товаров = " + cart.totalPrice());
        System.out.println("\nПодорожание на 15%");
        System.out.println();

        cart.raisePriceAll(0.15f);

        while (!cart.isEmpty())
        {
            Item item = cart.popItem();
            System.out.println(item.name + ": " + item.price);
        }

        System.out.println();
        System.out.println("Снижение на 30%");
        System.out.println();

        for (Item item : items)
            cart.pushItem(item);

        cart.decreasePriceAll(0.3f);

        while (!cart.isEmpty())
        {
            Item item = cart.popItem();
            System.out.println(item.name + ": " + item.price);
        }
    }
}
