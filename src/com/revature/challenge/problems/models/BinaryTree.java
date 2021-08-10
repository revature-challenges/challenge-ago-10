package com.revature.challenge.problems.models;

public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int num){
        if(current==null){
            return new Node(num);
        }

        if (num < current.num){
            current.left = addRecursive(current.left, num);
        }else if(num > current.num){
            current.right = addRecursive(current.right, num);
        }else{
            return current;
        }
        return current;
    }

    public void add(int num){
     root = addRecursive(root, num);
    }

    public void printAllNodesInLevel(int level){

    }

    public void printInOrderTraversal(){

    }
}