package com.arora.tree.binaryTree.traversal;

import java.util.ArrayList;

import com.arora.tree.model.BinaryTreeNode;

public class InorderTraversal<T> {

	public void inorderTraversal(BinaryTreeNode<T> node, ArrayList<BinaryTreeNode<T>> inorderTraversalList) {

		if (null == node) {
			return;
		}

		inorderTraversal(node.getLeftChild(), inorderTraversalList);

		inorderTraversalList.add(node);

		inorderTraversal(node.getRightChild(), inorderTraversalList);

	}

	public String printInorderTraversal(BinaryTreeNode<T> node) {
		ArrayList<BinaryTreeNode<T>> inorderTraversalList = new ArrayList<BinaryTreeNode<T>>();
		inorderTraversal(node, inorderTraversalList);
		StringBuffer printList = new StringBuffer("");

		for (BinaryTreeNode<T> listNode : inorderTraversalList) {
			printList.append(listNode.getData() + " ");
		}

		return printList.toString();
	}
}
