package algorithms;

public class QuickSort {
    public static int comparisons = 0;
    public static int swaps = 0;

    public static long sort(int[] arr) {
        comparisons = 0;
        swaps = 0;
        long start = System.nanoTime();

        quickSort(arr, 0, arr.length - 1);

        long end = System.nanoTime();
        return end - start;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            comparisons++;
            if (arr[j] < pivot) {
                i++;
                swaps++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        swaps++;
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
