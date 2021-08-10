package com.revature.challenge.problems.models;

public class Node {
    Node left;
    Node right;
    int num;

    public Node(int num) {
        this.left = null;
        this.right = null;
        this.num = num;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
