package com.arora.tree.construct;

import com.arora.tree.binarySearchTree.BinarySearchTree;

public class ConstructIntegerBST {
	public static BinarySearchTree<Integer> construct(){
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(10);
		bst.insert(2);
		bst.insert(9);
		bst.insert(15);
		bst.insert(12);
		bst.insert(16);
		return bst;
	}
}
