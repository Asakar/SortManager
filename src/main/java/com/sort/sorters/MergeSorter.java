package com.sort.sorters;

public class MergeSorter implements Sorter {

    void merge(int arr[], int left, int middle, int right) {

        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;

        // leftArray and rightArray are temp arrays holding a portion of arr[]
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < rightArraySize; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int indexOfLeftArray = 0;
        int indexOfRightArray = 0;
        int indexOfArr = left;

        while (indexOfLeftArray < leftArraySize && indexOfRightArray < rightArraySize) {

            if (leftArray[indexOfLeftArray] <= rightArray[indexOfRightArray]) {
                arr[indexOfArr] = leftArray[indexOfLeftArray];
                indexOfLeftArray++;
            } else {
                arr[indexOfArr] = rightArray[indexOfRightArray];
                indexOfRightArray++;
            }

            indexOfArr++;
        }

        while (indexOfLeftArray < leftArraySize) {
            arr[indexOfArr] = leftArray[indexOfLeftArray];
            indexOfLeftArray++;
            indexOfArr++;
        }

        while (indexOfRightArray < rightArraySize) {
            arr[indexOfArr] = rightArray[indexOfRightArray];
            indexOfRightArray++;
            indexOfArr++;
        }
    }


    void sort(int arr[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int left = 0;
        int right = arrayToSort.length-1;
        sort(arrayToSort, left, right);
        return arrayToSort;
    }

}
