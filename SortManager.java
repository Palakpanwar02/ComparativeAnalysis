package core;

import algorithms.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortManager {

    // Generate random array of given size with values 0-9999
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }

    // Run all sorts on a fresh copy of the array and collect results
    public static List<SortResult> runAllSorts(int[] originalArray) {
        List<SortResult> results = new ArrayList<>();

        results.add(runBubbleSort(originalArray));
        results.add(runSelectionSort(originalArray));
        results.add(runMergeSort(originalArray));
        results.add(runQuickSort(originalArray));
        // Add more algorithms here when ready

        return results;
    }

    private static SortResult runBubbleSort(int[] arr) {
        int[] arrayCopy = arr.clone();
        long time = BubbleSort.sort(arrayCopy);

        return new SortResult(
                "Bubble Sort",
                time,
                BubbleSort.comparisons,
                BubbleSort.swaps,
                "O(n²)",
                "O(1)",
                true,
                true
        );
    }

    private static SortResult runSelectionSort(int[] arr) {
        int[] arrayCopy = arr.clone();
        long time = SelectionSort.sort(arrayCopy);

        return new SortResult(
                "Selection Sort",
                time,
                SelectionSort.comparisons,
                SelectionSort.swaps,
                "O(n²)",
                "O(1)",
                false,
                true
        );
    }

    private static SortResult runMergeSort(int[] arr) {
        int[] arrayCopy = arr.clone();
        long time = MergeSort.sort(arrayCopy);

        return new SortResult(
                "Merge Sort",
                time,
                MergeSort.comparisons,
                MergeSort.swaps,
                "O(n log n)",
                "O(n)",
                true,
                false
        );
    }

    private static SortResult runQuickSort(int[] arr) {
        int[] arrayCopy = arr.clone();
        long time = QuickSort.sort(arrayCopy);

        return new SortResult(
                "Quick Sort",
                time,
                QuickSort.comparisons,
                QuickSort.swaps,
                "O(n log n) average",
                "O(log n) average",
                false,
                true
        );
    }
}

