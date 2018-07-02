package com.arora.tree.traversal;

import java.util.ArrayList;

import com.arora.tree.node.Node;

public class InorderTraversal<T> {

	public void inorderTraversal(Node<T> node, ArrayList<Node<T>> inorderTraversalList) {

		if (null == node) {
			return;
		}

		inorderTraversal(node.getLeftChild(), inorderTraversalList);

		inorderTraversalList.add(node);

		inorderTraversal(node.getRightChild(), inorderTraversalList);

	}

	public String printInorderTraversal(Node<T> node) {
		ArrayList<Node<T>> inorderTraversalList = new ArrayList<Node<T>>();
		inorderTraversal(node, inorderTraversalList);
		StringBuffer printList = new StringBuffer("");

		for (Node<T> listNode : inorderTraversalList) {
			printList.append(listNode.getData() + " ");
		}

		return printList.toString();
	}
}
