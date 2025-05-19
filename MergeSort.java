package algorithms;

public class MergeSort {
    public static int comparisons = 0;
    public static int swaps = 0;

    public static long sort(int[] arr) {
        comparisons = 0;
        swaps = 0;
        long start = System.nanoTime();

        mergeSort(arr, 0, arr.length - 1);

        long end = System.nanoTime();
        return end - start;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
            swaps++;  // count copying as swaps/writes
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
            swaps++;
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            comparisons++;
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
                swaps++;
            } else {
                arr[k++] = R[j++];
                swaps++;
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
            swaps++;
        }

        while (j < n2) {
            arr[k++] = R[j++];
            swaps++;
        }
    }
}



