import java.util.Scanner;

public class BubbleSortAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, n, c, c2, temp;
        System.out.print("Enter Test Cases - ");
        t = sc.nextInt();

        for (int j = 1; j <= t; j++) {
            System.out.print("\nEnter size - ");
            n = sc.nextInt();

            int[] A = new int[n];
            System.out.print("Enter elements - ");
            for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();

            c = 0;
            c2 = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int k = 0; k < n - i - 1; k++) {
                    c++;
                    if (A[k] > A[k + 1]) {
                        temp = A[k];
                        A[k] = A[k + 1];
                        A[k + 1] = temp;
                        c2++;
                    }
                }
            }

            System.out.print("Sorted Array - ");
            for (int i = 0; i < n; i++)
                System.out.print(A[i] + " ");

            System.out.println("\nComparisons - " + c);
            System.out.println("Swaps - " + c2);
        }
    }
}