import java.util.Scanner;

public class Selection{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Test Cases - ");
        int t = S.nextInt();

        for (int test = 1; test <= t; test++) {
            System.out.print("\nEnter size - ");
            int n = S.nextInt();

            int[] A = new int[n];
            System.out.print("Enter elements - ");
            for (int i = 0; i < n; i++) {
                A[i] = S.nextInt();
            }
            int comparisons = 0;
            int swaps = 0;
            int temp;
            for (int i = 0; i < n - 1; i++)
            {
                int b = i;
                for (int j = i + 1; j < n; j++) {
                    if (A[j] < A[b]) {
                        b = j;
                    }
                    comparisons++;
                }
                if (b != i) {
                    temp = A[i];
                    A[i] = A[b];
                    A[b] = temp;
                    swaps++;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println("\nComparisons " + comparisons);
            System.out.println("Swaps - " + swaps);
        }
    }
}