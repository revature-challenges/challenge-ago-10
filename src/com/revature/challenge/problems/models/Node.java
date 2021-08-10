package com.revature.challenge.problems.models;

public class Node {
    int num;
    Node left;
    Node right;


    public Node(int num) {
        this.num = num;
        this.left = null;
        this.right = null;

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
