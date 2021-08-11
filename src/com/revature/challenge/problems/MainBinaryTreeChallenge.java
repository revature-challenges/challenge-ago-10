package com.revature.challenge.problems;

import com.revature.challenge.problems.models.BinaryTree;

public class MainBinaryTreeChallenge {

    public static void main(String[] args){
        int N = 20;
        int max = 10;
        int min = 1;

        BinaryTree binaryTree = new BinaryTree();

        for (int i = 0; i < N; i++) {
            binaryTree.add((int) (Math.random() * (max)) + min);
        }
        System.out.println("*************************");
        System.out.println("     InOrderTraversal    " );
        System.out.println("*************************");
        //binaryTree.printInOrderTraversal(binaryTree.getRoot());
        System.out.println("*************************");
        System.out.println(" Breath First Traversal " );
        System.out.println("*************************");
        binaryTree.printBreathFirstTraversal();

    }

}
