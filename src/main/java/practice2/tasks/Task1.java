package practice2.tasks;

import practice2.SumArray;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void ran()
    {
        System.out.println("task1");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Исходный массив");
        for(int i = 0; i < n; i++)
        {
            arr[i] = random.nextInt(-100, 100);
            System.out.println(arr[i]);
        }
        int posNum = SumArray.sumPositive(arr);

        System.out.println(" ");
        System.out.println("Сумма положительных чисел массива: " + posNum);
    }
}
