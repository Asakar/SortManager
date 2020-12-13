package com.sort.sorters;

public class SelectionSorter implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {

        int length = arrayToSort.length;

        for(int i = 0; i < length-1; i++) {

            int min_idx = i;

            for(int j = i+1; j < length; j++) {
                if(arrayToSort[j] < arrayToSort[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arrayToSort[min_idx];
            arrayToSort[min_idx] = arrayToSort[i];
            arrayToSort[i] = temp;
        }

        return arrayToSort;
    }

}
