package com.arora.tree.binaryTree;

import com.arora.tree.binaryTree.constructDemo.ConstructIntegerBinaryTree;

public class PostorderTraversalTest {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryIntegerTree = ConstructIntegerBinaryTree.construct();
		System.out.println(binaryIntegerTree.printPostorderTraversal());
	}

}