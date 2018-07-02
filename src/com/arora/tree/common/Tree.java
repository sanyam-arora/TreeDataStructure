package com.arora.tree.common;

import com.arora.tree.node.Node;

public class Tree<T> {
	
	public int height(Node node) {
		if(null == node) {
			return 0;
		} else {
			return Math.max( height(node.getLeftChild()) + 1, height(node.getRightChild()) + 1 );
		}
	}
	
}
