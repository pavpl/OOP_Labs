package com.company;

import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        float firstNumber;
        float secondNumber;

        System.out.print("Введите первое число x: ");
        firstNumber = scanner.nextFloat();

        System.out.print("Введите второе число y: ");
        secondNumber = scanner.nextFloat();

        Production pr = new Production(firstNumber , secondNumber);
        Division dv = new Division(firstNumber , secondNumber);

        System.out.println("Результат умножения : " + pr.calc());
        if (secondNumber != 0)
        {
            System.out.println("Результат деления : " + dv.calc());
        }
        else
        {
            System.out.println("Делитель равен нулю");
        }
    }
}