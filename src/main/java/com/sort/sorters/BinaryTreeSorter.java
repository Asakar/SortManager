package com.sort.sorters;

import com.sort.binarytree.BinaryTree;

public class BinaryTreeSorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElements(arrayToSort);
        arrayToSort = binaryTree.getSortedTreeAsc();
        return arrayToSort;
    }

}
