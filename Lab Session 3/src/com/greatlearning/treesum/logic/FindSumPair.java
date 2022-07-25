package com.greatlearning.treesum.logic;

import java.util.HashSet;

public class FindSumPair {
	
	/*
	 * constructs a Binary Search Tree
	 * If root is null, then create a new node and make it root
	 * If key is smaller than root.nodeData then traverse to root.leftNode
	 * If key is larger than root.nodeData then traverse to root.rightNode
	 * return root
	 */
	public Node insert(Node root, int key) {

		if(root==null) {
			return new Node(key);
		}
		
		if(key<root.nodeData)
			root.leftNode=insert(root.leftNode, key);
		else if(key>root.nodeData)
			root.rightNode=insert(root.rightNode, key);

		return root;
	}
	
	/*
	 *creates a HashSet
	 *calls findPairUntil and passes it root, sum and HashSet
	 *prints "Nodes not found. Pair cannot be made" if returned false
	 */
	public void findPairForGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		System.out.println("Sum = " +sum);
		if(!findPairUntil(root, sum, set))
			System.out.println("Nodes not found. Pair cannot be made");
	}
	
	/*
	 * Traverses the BST in Inorder fashion.
	 * searches for a pair that adds up to make the sum value
	 */
	private boolean findPairUntil(Node root, int sum, HashSet<Integer> set) {

		if(root==null)
			return false;

		if(findPairUntil(root.leftNode, sum, set))		//pass on the true value returned by callee function
			return true;
		
		//pair is found. Print out the pair
		if(set.contains(sum-root.nodeData)) {
			System.out.println("Pair is (" +root.nodeData +"," +(sum-root.nodeData) +")");
			return true;
		}
		else
			set.add(root.nodeData);						//pair not found. Simply add root.nodeData to the HashSet

		return findPairUntil(root.rightNode, sum, set);	//if pair not found proceed onto the right subtree
	}
}
