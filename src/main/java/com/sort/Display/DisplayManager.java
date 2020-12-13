package com.sort.Display;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {

    public static void printTimeTaken(Long totalTime) {
        System.out.println("time taken: " + totalTime + " nano seconds");
    }

    public static void printArray(int[] arrayToSort, String s) {
        System.out.println(s);
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static int validateSorterSelection(Scanner scanner, int sorter, boolean b, String s) {
        if (b) {
            System.out.println(s);
            sorter = scanner.nextInt();
        }
        return sorter;
    }

    public static void printAllSorters() {
        System.out.println("Choose a sorting algorithm from the following (enter 1-6): " +
                "\n1. Binary tree Sort" + "\n2. Bubble sort" + "\n3. Insertion Sort" + "\n4. Merge Sort" +
                "\n5. Quick Sort" + "\n6. Selection sort");
    }
}
