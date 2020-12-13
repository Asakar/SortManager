package com.sort.sorters;

public class InsertionSorter implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {

        int length = arrayToSort.length;

        for(int i = 1; i < length; i++) {
            int currentMovingValue = arrayToSort[i];
            int previuosIndex = i - 1;

            while(previuosIndex >= 0 && arrayToSort[previuosIndex] > currentMovingValue) {
                arrayToSort[previuosIndex + 1] = arrayToSort[previuosIndex];
                previuosIndex = previuosIndex - 1;
            }
            arrayToSort[previuosIndex + 1] = currentMovingValue;
        }

        return arrayToSort;
    }

}
