/**
 * 
 */
package com.greatlearning.balancedbrackets.main;

import com.greatlearning.balancedbrackets.logic.BalancedBracketsLogic;

/**
 * @author sohandesai
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	
	/*
	 * If a string contains only brackets symmetrically enclosed within another
	 * then the string is said to be balanced.
	 * 
	 * Eg: 	([]) -> Balanced
	 * 		()[] -> Not balanced
	 * 		({[)]{ -> Not balanced
	 * 
	 * Following program checks whether the input string contains Balanced Brackets
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedBracketsLogic bbLogic = new BalancedBracketsLogic();
		
		String brackets = "([[{}]])";
		bbLogic.isBalanced(brackets);
		
		brackets = "([[{}]]))";
		bbLogic.isBalanced(brackets);
		
		brackets = "([a[{}]c])";
		bbLogic.isBalanced(brackets);
		
	}

}
