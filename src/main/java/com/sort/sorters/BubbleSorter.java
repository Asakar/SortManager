package com.sort.sorters;

public class BubbleSorter implements Sorter {

    @Override
    public int[] sortArray(int[] input) {
        int[] sort = input;
        if(checkIfSorted(input)) {
            return input;
        }
        while(!checkIfSorted(input)) {
            for(int i=0; i<(sort.length-1); i++) {
                swap(sort, i);
            }
        }
        return sort;
    }

    public static boolean checkIfSorted(int[] input) {
        boolean answer = true;
        for(int i=0; i<(input.length -1); i++) {
            if(input[i]>input[i+1]) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static int[] swap(int[] array, int index) {
        int temp;
        if (array[index] > array[index+1]) {
            temp = array[index];
            array[index] = array[index+1];
            array[index+1] = temp;
        }
        return array;
    }
}
