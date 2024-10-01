package practice2;

public class SumArray {

    public static int sumPositive(int[] arr)
    {
        int posNum = 0;
        for (int i : arr) {
            if (i >= 0) {
                posNum += i;
            }
        }
        return posNum;
    }

}
