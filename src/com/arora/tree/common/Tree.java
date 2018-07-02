package com.arora.tree.common;

import com.arora.tree.node.Node;

public class Tree<T> {

	public int height(Node node) {
		if (null == node) {
			return 0;
		} else {
			return Math.max(height(node.getLeftChild()) + 1, height(node.getRightChild()) + 1);
		}
	}

	public int diameter(Node node) {
		if (null == node) {
			return 0;
		}
		int leftHeight = height(node.getLeftChild());
		int rightHeight = height(node.getRightChild());

		int leftDiameter = diameter(node.getLeftChild());
		int rightDiameter = diameter(node.getRightChild());

		return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
	}
}
