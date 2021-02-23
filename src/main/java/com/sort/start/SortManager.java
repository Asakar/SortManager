package com.sort.start;

import com.sort.sorters.Sorter;
import com.sort.display.DisplayManager;

import java.util.Random;
import java.util.Scanner;

public class SortManager {

    public static void beginProgram() {

        Scanner scanner = new Scanner(System.in);
        DisplayManager.printAllSorters();
        int sorter =  scanner.nextInt();

        sorter = DisplayManager.validateSorterSelection(scanner, sorter, sorter > 6, "please enter a valid number:");

        Sorter requestedSorter = getSorter(sorter);

        System.out.println("What is the size of the array you want to be sorted?");
        int size = scanner.nextInt();

        size = DisplayManager.validateSorterSelection(scanner, size, size <= 0, "Please enter a valid size");

        int[] arrayToSort = createArray(size);
        DisplayManager.printArray(arrayToSort, "unsorted array:");

        Long start = System.nanoTime();
        int[] sortedArray = requestedSorter.sortArray(arrayToSort);
        Long finish = System.nanoTime();
        Long totalTime = (finish - start);

        DisplayManager.printArray(sortedArray, "Sorted array: ");
        DisplayManager.printTimeTaken(totalTime);
    }

    private static int[] createArray(int size) {
        Random random = new Random();
        int[] result = new int[size];
        for(int i=0; i<result.length; i++) {
            result[i] = random.nextInt(1000) + 1;
        }
        return result;
    }

    private static Sorter getSorter(int sorter) {

        switch(sorter) {
            case 1: return SortLoader.getSorter("BinaryTreeSorter");
            case 2: return SortLoader.getSorter("BubbleSorter");
            case 3: return SortLoader.getSorter("InsertionSorter");
            case 4: return SortLoader.getSorter("MergeSorter");
            case 5: return SortLoader.getSorter("QuickSorter");
            case 6: return SortLoader.getSorter("SelectionSorter");
        }

        return null;
    }

    public static void main(String[] args) {
        beginProgram();
    }

}
