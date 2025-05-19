package algorithms;

public class BubbleSort {
    public static int comparisons = 0;
    public static int swaps = 0;

    public static long sort(int[] arr) {
        comparisons = 0;
        swaps = 0;
        long start = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        long end = System.nanoTime();
        return end - start;
    }
}
