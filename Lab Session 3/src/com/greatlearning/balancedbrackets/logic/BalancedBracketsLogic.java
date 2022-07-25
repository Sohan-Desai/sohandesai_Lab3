/**
 * 
 */
package com.greatlearning.balancedbrackets.logic;

import java.util.Stack;
/**
 * @author sohan
 *
 */
public class BalancedBracketsLogic {
	
	Stack<Character> stack = new Stack<>();
	
	public void isBalanced(String brackets) {
		if(checkBalancedBrackets(brackets))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String does not contain Balanced Brackets");
	}

	private boolean checkBalancedBrackets(String brackets) {
		
		for(int i=0; i<brackets.length(); i++) {
			char ch1=brackets.charAt(i);
			
			if(stack.isEmpty()&&i>0)
				return false;
			
			char ch2;
			switch(ch1) {
			case '(':
			case '[':
			case '{':
				stack.push(ch1);
				break;
			case ')':
				ch2=stack.pop();
				if(ch2!='(')
					return false;
				break;
			case ']':
				ch2=stack.pop();
				if(ch2!='[')
					return false;
				break;
			case '}':
				ch2=stack.pop();
				if(ch2!='{')
					return false;
				break;
			default:
				System.out.print("String should contain only Brackets! ");
				return false;
			}
		}
		return stack.isEmpty();
	}
	
}
