package com.greatlearning.treesum.logic;

import java.util.HashSet;

public class FindSumPair {

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

	public void findPairForGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		System.out.println("Sum = " +sum);
		if(!findPairUntil(root, sum, set))
			System.out.println("Nodes not found. Pair cannot be made");
	}

	private boolean findPairUntil(Node root, int sum, HashSet<Integer> set) {

		if(root==null)
			return false;

		if(findPairUntil(root.leftNode, sum, set))
			return true;

		if(set.contains(sum-root.nodeData)) {
			System.out.println("Pair is (" +root.nodeData +"," +(sum-root.nodeData) +")");
			return true;
		}
		else
			set.add(root.nodeData);

		return findPairUntil(root.rightNode, sum, set);
	}
}
