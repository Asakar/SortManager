package com.sort.sorters;

public class InsertionSorter implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {

        int length = arrayToSort.length;

        for(int i = 1; i < length; i++) {
            int currentMovingValue = arrayToSort[i];
            int previousIndex = i - 1;

            while(previousIndex >= 0 && arrayToSort[previousIndex] > currentMovingValue) {
                arrayToSort[previousIndex + 1] = arrayToSort[previousIndex];
                previousIndex = previousIndex - 1;
            }
            arrayToSort[previousIndex + 1] = currentMovingValue;
        }

        return arrayToSort;
    }

}
