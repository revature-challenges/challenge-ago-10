package com.revature.challenge.problems.models;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Optional;

public class BinaryTree {
    Node root;
    ArrayDeque<Node> queue = new ArrayDeque<Node>();

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

//    public void printInOrderTraversal(Node root){
//        if(root!=null){
//            printInOrderTraversal(root.left);
//            System.out.println(root.toString() + " ");
//            printInOrderTraversal(root.right);
//        }
//    }

    public void printBreathFirstTraversal(){
        queue.add(root);
        printBFS();
    }

    private void printBFS(){
        Node tempNode = queue.pollFirst();
        if(tempNode!=null){
            printAndAddChildrenToQueue(tempNode);
            printBFS();
        }
    }

    private void printAndAddChildrenToQueue(Node node){
        System.out.println(node.toString());
        if(node.left!=null){
            queue.add(node.left);
        }
        if(node.right!=null){
            queue.add(node.right);
        }
    }

    public void printTreeLevel(int level){
        printTreeLevel(root, level);
    }

    private void printTreeLevel(Node node, int level){
        if(node!=null){
         if(level == 1){
             System.out.println(node.toString());
         }else if(level > 1){
             printTreeLevel(node.left, level -1);
             printTreeLevel(node.right, level -1);
         }
        }
    }

}
