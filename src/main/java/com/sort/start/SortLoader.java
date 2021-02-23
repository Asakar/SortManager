package com.sort.start;

import com.sort.sorters.*;
import com.sort.sorters.*;

public class SortLoader {

    public static Sorter getSorter(String sorter) {
        switch (sorter) {
            case "BubbleSorter":
                return new BubbleSorter();
            case "InsertionSorter":
                return new InsertionSorter();
            case "SelectionSorter":
                return new SelectionSorter();
            case "QuickSorter":
                return new QuickSorter();
            case "MergeSorter":
                return new MergeSorter();
            case "BinaryTreeSorter":
                return new BinaryTreeSorter();
            default:
                return null;
        }
    }

}
