package com.greatlearning.treesum.main;

import com.greatlearning.treesum.logic.FindSumPair;
import com.greatlearning.treesum.logic.Node;

public class Driver {

	public static void main(String[] args) {
		FindSumPair findSP = new FindSumPair();
		Node root = null;
		
		//inserting nodes to build a BST
		root=findSP.insert(root, 40);
		root=findSP.insert(root, 20);
		root=findSP.insert(root, 60);
		root=findSP.insert(root, 10);
		root=findSP.insert(root, 30);
		root=findSP.insert(root, 50);
		root=findSP.insert(root, 70);
		
		int sum=80;
		findSP.findPairForGivenSum(root, sum);			//check if a pair of nodes exist that add up to make the sum
		sum=130;
		findSP.findPairForGivenSum(root, sum);			//check if a pair of nodes exist that add up to make the sum
		sum=200;
		findSP.findPairForGivenSum(root, sum);			//check if a pair of nodes exist that add up to make the sum

	}
}
