import java.util.Scanner;

public class InsertionSortAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Test Cases - ");
        int t = sc.nextInt();

        for (int tl = 1; tl <= t; tl++) {
            System.out.print("\nEnter size - ");
            int n = sc.nextInt();

            int[] A = new int[n];
            System.out.print("Enter elements - ");
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            int comparisons = 0;
            int swaps = 0;

            for (int i = 1; i < n; i++) {
                int k = A[i];
                int j = i - 1;

                while (j >= 0 && A[j] > k) {
                    A[j + 1] = A[j];
                    j--;
                    swaps++;
                    comparisons++;
                }

                A[j + 1] = k;
                comparisons++;
            }

            System.out.print("Sorted Array - ");
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }

            System.out.println("\nComparisons - " + comparisons);
            System.out.println("Swaps- " + swaps);
        }
    }
}