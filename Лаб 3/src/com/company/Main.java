package com.company;

import static com.company.hairbrush.hairbrush;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	/*
            Задание 1
      */
        String line = "We played";
        boolean b1 = line.endsWith("ed");
        System.out.println("Строка " + line + " заканчивается на 'ed'?  " + b1);

      /*
            Задание 2
      */
        int sum=0;
        String s = "В команде было 9 игроков, 3 тренера, 2 врача и 1 помощник.";
        for(int i=0; i<s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isDigit(temp)) {
                int b = Integer.parseInt(String.valueOf(temp));
                sum=sum+b;
            }
        }
        System.out.println("Общая сумма равна " + sum);
      /*
            Задание 3
      */
        System.out.println("Введите строку");
        String sysstr = new Scanner(System.in).nextLine();
        char symbol[] = sysstr.toCharArray();
        int max = 0, j = 0;
        for (int i = 0; i < symbol.length - 1; i++) {
            if (symbol[i] == symbol[i + 1]) {
                j++;
            } else {
                j++;
                if (max < j) {
                    max = j;
                }
                j = 0;
            }

        }
        if (max < j)
            max = j;
        System.out.println("Длинна самой длинной последовательности символов = " + max);

      /*
            Задание 4
      */
        System.out.print("Введите строку: ");
        String d = new Scanner(System.in).nextLine();
        StringTokenizer sTok = new StringTokenizer(d," ");
        System.out.print("Слова:\n");
        while (sTok.hasMoreTokens())
        {
            System.out.print((sTok.nextToken())+"\n");
        }
       /*
            Задание 5
       */
        String str1 = "Одесса";
        String str2 = "123456789";
        System.out.println("\nИсходная строка №1: " + str1);
        System.out.println("Исходная строка №2: " + str2);
        System.out.println("Полученная строка: " + hairbrush(str1, str2));
    }
}



