import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size - ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.print("Enter Elements - ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int m = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > m) {
                m = A[i];
            }
        }

        int[] B = new int[m + 1];
        for (int i = 0; i < n; i++) {
            B[A[i]]++;
        }

        int[] C = new int[n];
        int j = 0;
        for (int i = 0; i <= m; i++) {
            while (B[i] > 0) {
                C[j++] = i;
                B[i]--;
            }
        }

        System.out.print("Sorted Array - ");
        for (int i = 0; i < n; i++) {
            System.out.print(C[i] + " ");
        }
    }
}