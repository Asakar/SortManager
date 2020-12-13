package com.sort.binarytree;

public class Node {
    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChildEmpty() {
        return leftChild == null; // if statement shorthand checking if leftchild is null if null then it true
    }

    public boolean isRightChildEmpty() {
        return rightChild == null; // if statement shorthand checking if leftchild is null
    }

    public static void main(String[] args) {
        Node node = new Node(4);
        node.setLeftChild(new Node(3));
        System.out.println(node.isLeftChildEmpty());
    }

}
