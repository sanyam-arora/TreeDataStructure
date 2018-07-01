package com.arora.tree.binaryTree.traversal;

import java.util.ArrayList;

import com.arora.tree.model.BinaryTreeNode;

public class PreorderTraversal<T> {

	public ArrayList<BinaryTreeNode<T>> preorderTraversal(BinaryTreeNode<T> node) {
		ArrayList<BinaryTreeNode<T>> preorderTraversalList = new ArrayList<BinaryTreeNode<T>>();
		preorderTraversal(node, preorderTraversalList);
		return preorderTraversalList;
	}

	public void preorderTraversal(BinaryTreeNode<T> node,
			ArrayList<BinaryTreeNode<T>> preorderTraversalList) {
		
		if(null == node) {
			return;
		} else {
			preorderTraversalList.add(node);
		}
		
		preorderTraversal(node.getLeftChild(), preorderTraversalList);
		preorderTraversal(node.getRightChild(), preorderTraversalList);
		
	}
	
	public String printPreorderTraversal(BinaryTreeNode<T> node) {
		ArrayList<BinaryTreeNode<T>> preorderTraversalList = preorderTraversal(node);
		StringBuffer printList = new StringBuffer("");
		
		for(BinaryTreeNode<T> listNode: preorderTraversalList) {
			printList.append(listNode.getData() + " ");
		}
		
		return printList.toString();
	}
}
