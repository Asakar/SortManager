package org.sort;

import com.sort.sorters.Sorter;
import com.sort.start.SortLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class SortTester {

    private static Sorter sorter;
    private static int[] unsortedArray;
    @BeforeAll
    public static void setTestSetup() {
        sorter = SortLoader.getSorter("SelectionSorter");
        unsortedArray = new int[10];
        Random random = new Random();
        for(int i=0; i<unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(1000) + 1;
        }
    }

    @Test
    public void isSorted() {
        int[] sorterArray = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorterArray.length-1; i++) {
            Assertions.assertTrue(sorterArray[i]<sorterArray[i+1]);
        }
    }

    @Test
    public void isSortedAllEvanArray() {
        unsortedArray = new int[]{2, 4, 20, 8, 10, 30};
        int[] sorterArray = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorterArray.length-1; i++) {
            Assertions.assertTrue(sorterArray[i]<sorterArray[i+1]);
        }
    }

    @Test
    public void isEmptyArray() {
        unsortedArray = new int[0];
        int[] sorterArray = sorter.sortArray(unsortedArray);
        Assertions.assertTrue(sorterArray.length == 0);
    }

    @Test
    public void isSortedAllOddArray() {
        unsortedArray = new int[]{1, 3, 19, 9, 11, 31};
        int[] sorterArray = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorterArray.length-1; i++) {
            Assertions.assertTrue(sorterArray[i]<sorterArray[i+1]);
        }
    }

    @Test
    public void isSortedSingleElementArray() {
        unsortedArray = new int[]{1};
        int[] sorterArray = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorterArray.length-1; i++) {
            Assertions.assertTrue(sorterArray[i]<sorterArray[i+1]);
        }
    }

    @Test
    public void isSortedOddSizeArray() {
        unsortedArray = new int[]{1,3,2};
        int[] sorterArray = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorterArray.length-1; i++) {
            Assertions.assertTrue(sorterArray[i]<sorterArray[i+1]);
        }
    }

    @Test
    public void isSortedEvenSizeArray() {
        unsortedArray = new int[]{1,3,2,0};
        int[] sorterArray = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorterArray.length-1; i++) {
            Assertions.assertTrue(sorterArray[i]<sorterArray[i+1]);
        }
    }

    @Test
    public void isSortedEmptySizeArray() {
        unsortedArray = new int[]{};
        int[] sorterArray = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorterArray.length-1; i++) {
            Assertions.assertTrue(sorterArray[i]<sorterArray[i+1]);
        }
    }



}
