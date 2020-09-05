package ru.gerch.first;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Задание номер 3
        int[] arr = {2, 228, 420};
        int temp = 0;
        int q = 0;
        for (int i = 0; i  < 3; i++)
        {
            temp += arr[i];
        }
        System.out.println("Сумма посчитанная циклом for: " + temp);
        temp = 0;
        while(q < 3)
        {
            temp += arr[q];
            q++;
        }
        System.out.println("Сумма посчитанная циклом while: " + temp);
        temp = 0;
        q = 0;
        do {
            temp += arr[q];
            q++;
        }while(q < 3);
        System.out.println("Сумма посчитанная циклом do while: " + temp);
        System.out.println("=====================================");
        //Задание номер 4
        int len = args.length;
        for (int i = 0; i < len; i++)
        {
            System.out.println(args[i]);
        }
        System.out.println("=====================================");
        //Задание номер 5
        for (int i = 1; i < 11; i++)
        {
            System.out.printf("%.2f\t", (float)1/i);
        }
        System.out.println();
        System.out.println("=====================================");
        //Задание номер 6
        int[] mas = new int[10];
        for(int i = 0; i < 10; i++)
        {
            mas[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.print(mas[i] + " ");
        }
        Arrays.sort(mas);
        System.out.println();
        for(int i = 0; i < 10; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        Random random = new Random();
        for(int i = 0; i < 10; i++)
        {
            mas[i] = random.nextInt();
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.print(mas[i] + " ");
        }
        Arrays.sort(mas);
        System.out.println();
        for(int i = 0; i < 10; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println("================================");
        // Задание номер 7
        System.out.println("Факториал числа 7 = " + fact(7));

    }
    public static int fact(int a)
    {
        int i = 1;
        for (int w = 1; w < a; w++)
        {
            i = i * w;
        }
        return i;
    }
}
