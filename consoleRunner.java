import core.SortManager;
import core.SortResult;

import java.util.List;
import java.util.Scanner;

public class consoleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array to sort: ");
        int size = scanner.nextInt();

        int[] randomArray = SortManager.generateRandomArray(size);
        List<SortResult> results = SortManager.runAllSorts(randomArray);

        System.out.printf("\n%-15s %-12s %-12s %-10s %-15s %-15s %-10s %-10s\n",
                "Algorithm", "Time(ns)", "Comparisons", "Swaps",
                "TimeComplexity", "SpaceComplexity", "Stable", "InPlace");
        System.out.println("---------------------------------------------------------------------------------------------");

        for (SortResult r : results) {
            System.out.printf("%-15s %-12d %-12d %-10d %-15s %-15s %-10s %-10s\n",
                    r.algorithmName,
                    r.timeTakenNs,
                    r.comparisons,
                    r.swaps,
                    r.timeComplexity,
                    r.spaceComplexity,
                    r.stable ? "Yes" : "No",
                    r.inPlace ? "Yes" : "No");
        }
    }
}

//sorting project