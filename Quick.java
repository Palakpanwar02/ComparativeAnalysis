import java.util.Scanner;

public class QuickSort {

    static int partition(int[] arr, int lb, int ub) {
        int s = lb, e = ub, temp;
        int key = arr[lb];
        while (s < e) {
            while (s <= ub && arr[s] <= key)
                s++;
            while (arr[e] > key)
                e--;
            if (s < e) {
                temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }
        temp = arr[lb];
        arr[lb] = arr[e];
        arr[e] = temp;
        return e;
    }

    static void quicksort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quicksort(arr, lb, loc - 1);
            quicksort(arr, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);

        System.out.print("Elements after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}