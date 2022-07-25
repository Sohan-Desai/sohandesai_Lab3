/**
 * 
 */
package com.greatlearning.balancedbrackets.logic;

import java.util.Stack;
/**
 * @author sohandesai
 *
 */
public class BalancedBracketsLogic {
	
	Stack<Character> stack = new Stack<>();
	/*
	 * prints out "String has balanced Brackets if returned true
	 * else prints out "String does not contain balanced brackets
	 */
	public void isBalanced(String brackets) {
		if(checkBalancedBrackets(brackets))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String does not contain Balanced Brackets");
	}

	private boolean checkBalancedBrackets(String brackets) {
		
		for(int i=0; i<brackets.length(); i++) {
			char ch1=brackets.charAt(i);
			/*
			 * return false if stack is empty except at the beginning
			 * this means there is at least one extra bracket at the end of given String
			 */
			if(stack.isEmpty()&&i>0)
				return false;
			
			char ch2;
			switch(ch1) {
			case '(':							//push '(' onto the stack
			case '[':							//push '[' onto the stack
			case '{':							//push '{' onto the stack
				stack.push(ch1);
				break;
			case ')':
				ch2=stack.pop();		//if ch1==')' then check whether character on top of stack is '('
				if(ch2!='(')
					return false;		//return false if not
				break;
			case ']':
				ch2=stack.pop();		//if ch1==']' then check whether character on top of stack is '['
				if(ch2!='[')
					return false;		//return false if not
				break;
			case '}':
				ch2=stack.pop();		//if ch1=='}' then check whether character on top of stack is '{'
				if(ch2!='{')
					return false;		//return false if not
				break;
			default:					//return false if any character except brackets is present in the string
				System.out.print("String should contain only Brackets! ");
				return false;
			}
		}
		/*
		 * if there are any extra brackets at the beginning of given String
		 * then they will be present in the stack.
		 * Brackets are balanced only if stack is empty
		 */
		return stack.isEmpty();			//
	}
	
}
