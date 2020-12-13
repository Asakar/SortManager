package org.sort;

import com.sort.sorters.BinaryTreeSorter;
import com.sort.sorters.BubbleSorter;
import com.sort.sorters.InsertionSorter;
import com.sort.sorters.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class PerformanceTester {

    private static int[] unsortedArray;
    private static int[] arrayToSort;


    // This will run before any of the tests
    @BeforeAll
    public static void testSetup() {
        Random random = new Random();
        arrayToSort = new int[50];
        for(int i=0; i<arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(1000) + 1;
        }
        unsortedArray = arrayToSort.clone();
    }

    @Test
    public void testBubbleSorter() {
        Sorter sorter = new BubbleSorter();
        runTest(sorter);
    }

    @Test
    public void testBinaryTreeSorter() {
        Sorter sorter = new BinaryTreeSorter();
        runTest(sorter);
    }

    @Test
    public void testInsertionSorter() {
        Sorter sorter = new InsertionSorter();
        runTest(sorter);
    }

    @Test
    public void testMergeSorter() {
        Sorter sorter = new InsertionSorter();
        runTest(sorter);
    }

    @Test
    public void testQuickSorter() {
        Sorter sorter = new InsertionSorter();
        runTest(sorter);
    }

    @Test
    public void testSelectionSorter() {
        Sorter sorter = new InsertionSorter();
        runTest(sorter);
    }

    private void runTest(Sorter sorter) {
        Long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Long finish = System.nanoTime();
        Long totalTime = (finish - start);
        printResults(sorter, totalTime, sortedArray);
    }

    public void printResults(Sorter sorter, long time, int[] sortedArray) {
        System.out.println(sorter.getClass().getSimpleName() + " results:");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("time taken: " + time + " nano seconds.");
    }

    public static void main(String[] args) {

    }

}
