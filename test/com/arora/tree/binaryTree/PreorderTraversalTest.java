package com.arora.tree.binaryTree;

import com.arora.tree.construct.ConstructIntegerBinaryTree;


public class PreorderTraversalTest {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryIntegerTree = ConstructIntegerBinaryTree.construct();
		System.out.println(binaryIntegerTree.printPreorderTraversal());
	}

}
