import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge(array, left, mid);
            merge(array, mid + 1, right);
            mergeHalves(array, left, mid, right);
        }
    }

    private static void mergeHalves(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Original array: ");
        printArray(array);
        
        merge(array, 0, array.length - 1);
        
        System.out.println("Sorted array: ");
        printArray(array);
    }
}
