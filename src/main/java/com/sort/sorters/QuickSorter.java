package com.sort.sorters;

public class QuickSorter implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int[] arr = sort(arrayToSort, 0, (arrayToSort.length-1));
        return arr;
    }

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    public int[] sort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        return arr;
    }

}
