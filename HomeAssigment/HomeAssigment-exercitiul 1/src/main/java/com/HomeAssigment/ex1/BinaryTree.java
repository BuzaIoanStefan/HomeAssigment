package com.HomeAssigment.ex1;public class BinaryTree {    private Node root;    private static class Node {        int value;        Node left;        Node right;        Node(int value) {            this.value = value;            this.left = null;            this.right = null;        }    }    public BinaryTree() {        this.root = null;    }    // Method to insert a value into the tree    public void insert(int value) {        root = insertRec(root, value);    }    private Node insertRec(Node root, int value) {        if (root == null) {            root = new Node(value);            return root;        }        if (value < root.value) {            root.left = insertRec(root.left, value);        } else if (value > root.value) {            root.right = insertRec(root.right, value);        }        return root;    }    // Method to find the maximum value in the tree    public int findMax() {        if (root == null) {            throw new IllegalStateException("Tree is empty");        }        return findMaxRec(root);    }    private int findMaxRec(Node root) {        if (root.right == null) {            return root.value;        }        return findMaxRec(root.right);    }    // Method to calculate the depth of the tree    public int calculateDepth() {        return calculateDepthRec(root);    }    private int calculateDepthRec(Node root) {        if (root == null) {            return 0;        }        int leftDepth = calculateDepthRec(root.left);        int rightDepth = calculateDepthRec(root.right);        return Math.max(leftDepth, rightDepth) + 1;    }}