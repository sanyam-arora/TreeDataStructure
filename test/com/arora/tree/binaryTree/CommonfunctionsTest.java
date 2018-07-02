package com.arora.tree.binaryTree;

import com.arora.tree.binaryTree.constructDemo.ConstructIntegerBinaryTree;

public class CommonfunctionsTest {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryIntegerTree = ConstructIntegerBinaryTree.construct();
		System.out.println("Diameter of Tree is: " + binaryIntegerTree.diameter(binaryIntegerTree.getRoot()));
		System.out.println("Height of Tree is: " + binaryIntegerTree.height(binaryIntegerTree.getRoot()));
	}

}
