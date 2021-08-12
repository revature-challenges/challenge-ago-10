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
        System.out.println("    Print A Tree Level   " );
        System.out.println("*************************");
        binaryTree.printTreeLevel(3);

        System.out.println("*************************");
        System.out.println(" Breath First Traversal " );
        System.out.println("*************************");
        binaryTree.printBreathFirstTraversal();

    }

}
