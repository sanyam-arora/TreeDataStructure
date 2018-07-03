package com.arora.tree.binaryTree;

import com.arora.tree.construct.ConstructIntegerBinaryTree;

public class InorderTraversalTest {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryIntegerTree = ConstructIntegerBinaryTree.construct();
		System.out.println(binaryIntegerTree.printInorderTraversal());
	}

}
