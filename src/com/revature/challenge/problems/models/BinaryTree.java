package com.revature.challenge.problems.models;

public class BinaryTree {
    Node root;

    public BinaryTree(){};

    public Node getRoot() {
        return root;
    }

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

    public void printInOrderTraversal(Node root){
        if(root!=null){
            printInOrderTraversal(root.left);
            System.out.println(root.toString() + " ");
            printInOrderTraversal(root.right);
        }
    }
}
