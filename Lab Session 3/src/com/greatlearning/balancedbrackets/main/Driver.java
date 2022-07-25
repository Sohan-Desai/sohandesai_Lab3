/**
 * 
 */
package com.greatlearning.balancedbrackets.main;

import com.greatlearning.balancedbrackets.logic.BalancedBracketsLogic;

/**
 * @author sohan
 *
 */
public class Driver {

	/**
	 * @param args
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
