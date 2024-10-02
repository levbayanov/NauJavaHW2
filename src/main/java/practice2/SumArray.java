package practice2;

public class SumArray {

    public static int sumPositive(int[] arr)
    {
        int posNum = 0;
        for (int e : arr) {
            if (e >= 0) {
                posNum += e;
            }
        }
        return posNum;
    }

}
