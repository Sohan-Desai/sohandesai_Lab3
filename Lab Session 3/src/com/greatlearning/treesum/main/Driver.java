package com.greatlearning.treesum.main;

import com.greatlearning.treesum.logic.FindSumPair;
import com.greatlearning.treesum.logic.Node;

public class Driver {

	public static void main(String[] args) {
		FindSumPair findSP = new FindSumPair();
		Node root = null;
		
		//inserting nodes to build a BST
		root=findSP.insert(root, 40);		//add 40, root=null
		root=findSP.insert(root, 20);		//add 20, root=40
		root=findSP.insert(root, 60);		//add 60, root=40
		root=findSP.insert(root, 10);		//add 10, root=40
		root=findSP.insert(root, 30);		//add 30, root=40
		root=findSP.insert(root, 50);		//add 50, root=40
		root=findSP.insert(root, 70);		//add 70, root=40
		
		int sum=80;
		findSP.findPairForGivenSum(root, sum);			//check if a pair of nodes exist that add up to make the sum=80	
		sum=130;
		findSP.findPairForGivenSum(root, sum);			//check if a pair of nodes exist that add up to make the sum=130	
		sum=200;
		findSP.findPairForGivenSum(root, sum);			//check if a pair of nodes exist that add up to make the sum=200	

	}
}
