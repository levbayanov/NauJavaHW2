package practice2;

import java.util.ArrayList;

public class InsertionSort {
    public static void sort(ArrayList<Double> arrayList)
    {
        for (int i = 1; i < arrayList.size(); i++) {
            for (int j = i; j>0 && arrayList.get(j-1) > arrayList.get(j); j--)
            {
                swap(arrayList, j-1, j);
            }
        }
    }

    public static void sortInverse(ArrayList<Double> arrayList)
    {
        for (int i = 1; i < arrayList.size(); i++) {
            for (int j = i; j>0 && arrayList.get(j -1)<arrayList.get(j); j--)
            {
                swap(arrayList, j-1, j);
            }
        }
    }

    private static void swap(ArrayList<Double> arrayList,int first, int second)
    {
        Double fElement = arrayList.get(first);
        arrayList.set(first, arrayList.get(second));
        arrayList.set(second, fElement);
    }
}
