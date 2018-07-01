package com.arora.tree.binaryTree.traversal;

import java.util.ArrayList;

import com.arora.tree.model.BinaryTreeNode;

public class PostorderTraversal<T> {

	public void postorderTraversal(BinaryTreeNode<T> node, ArrayList<BinaryTreeNode<T>> postorderTraversalList) {

		if (null == node) {
			return;
		}

		postorderTraversal(node.getLeftChild(), postorderTraversalList);

		postorderTraversal(node.getRightChild(), postorderTraversalList);
		
		postorderTraversalList.add(node);

	}

	public String printPostorderTraversal(BinaryTreeNode<T> node) {
		ArrayList<BinaryTreeNode<T>> postorderTraversalList = new ArrayList<BinaryTreeNode<T>>();
		postorderTraversal(node, postorderTraversalList);
		StringBuffer printList = new StringBuffer("");

		for (BinaryTreeNode<T> listNode : postorderTraversalList) {
			printList.append(listNode.getData() + " ");
		}

		return printList.toString();
	}
}
