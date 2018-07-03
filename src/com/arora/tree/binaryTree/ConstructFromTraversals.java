//package com.arora.tree.binaryTree;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.Stack;
//
//import com.arora.tree.node.Node;
//
//public class ConstructFromTraversals<T> {
//
//	//Inorder and Preorder Traversal are given.
//	public BinaryTree<T> constructFromInAndPre(ArrayList<T> inorder, ArrayList<T> preorder){
//		Set<Node> set = new HashSet<Node>();
//		Stack<Node> stack = new Stack<Node>();
//		BinaryTree<T> binaryTree = new BinaryTree();
//		int preorderIndex = 0, inorderIndex = 0, max = inorder.size();
//		
//		for(inorderIndex = 0, preorderIndex = 0; preorderIndex <max;) {
//			while( preorderIndex < max && inorder[inorderIndex] != preorder[preorderIndex]) {
//				if(stack.isEmpty()) {
//					stack.push(new Node(preorder[preorderIndex]));
//				} else {
//					stack.p
//				}
//			}
//		}
//		
//		return null;
//	}
//	
//}
