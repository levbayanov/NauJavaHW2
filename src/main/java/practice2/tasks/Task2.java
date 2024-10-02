package practice2.tasks;

import practice2.InsertionSort;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void ran()
    {
        System.out.println("task2");
        System.out.println("Введите длину массива:");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Double> arrayList = new ArrayList<>(n);

        System.out.println("Исходный список:");
        for(int i = 0; i < n; i++){
            arrayList.add(random.nextDouble(-100, 100));
            System.out.println(i +") "+arrayList.get(i));
        }
        System.out.println(" ");

        InsertionSort.sort(arrayList);
        //InsertionSort.sortInverse(arrayList);

        System.out.println("Отсортированный список:");
        for(int i = 0; i < n; i++){
            System.out.println(i + ") " + arrayList.get(i));
        }
    }

}
