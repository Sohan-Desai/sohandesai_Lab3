/**
 * 
 */
package com.greatlearning.treesum.logic;

/**
 * @author sohandesai
 *
 */
public class Node {
	
	int nodeData;
	Node leftNode, rightNode;
	
	/*
	 * constructs a node by assigning the key value provided
	 * left and right nodes are set to null
	 */
	Node(int key){
		nodeData=key;
		leftNode=rightNode=null;
	}
	
}
