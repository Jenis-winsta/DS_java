/*
 * Reversing a string using stack

 * Author: Jenis Winsta
 * Date:14/12/2022
 * Description: A.Getting an infix expression from the users and 
displaying the reversed expression.
		B.The infix expression is converted to prefix expression
		using 2 Stack(oprstk- for operator, opnstk- for operand).
		The opnstk is the String stack. Through the method 
        infixprefix() and returns the string that is pop for
        the opnstack.
 */

package edu.DS_practicals;
import java.util.Stack;


public class Pracs3A {
    public static void main(String[] args) {
        char c;
        String str="((a+b)*c)";
        String str1="";
        //initializing empty stack
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++) {
            c=str.charAt(i);
            stack.push(c);
        }
        for(int i=0;i<str.length();i++) {
            c=stack.pop();
            str1 +=c; 
  }
        System.out.println("\nString: "+str);
        System.out.println("Reversed string: "+str1+"\n\n");
    }
}



