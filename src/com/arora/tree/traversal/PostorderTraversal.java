package com.arora.tree.traversal;

import java.util.ArrayList;

import com.arora.tree.node.Node;

public class PostorderTraversal<T> {

	public void postorderTraversal(Node<T> node, ArrayList<Node<T>> postorderTraversalList) {

		if (null == node) {
			return;
		}

		postorderTraversal(node.getLeftChild(), postorderTraversalList);

		postorderTraversal(node.getRightChild(), postorderTraversalList);
		
		postorderTraversalList.add(node);

	}

	public String printPostorderTraversal(Node<T> node) {
		ArrayList<Node<T>> postorderTraversalList = new ArrayList<Node<T>>();
		postorderTraversal(node, postorderTraversalList);
		StringBuffer printList = new StringBuffer("");

		for (Node<T> listNode : postorderTraversalList) {
			printList.append(listNode.getData() + " ");
		}

		return printList.toString();
	}
}
