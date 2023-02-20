package edu.DS_practicals;

/*
 * Author: Jenis Winsta
 * Date:07/12/2022
 * Description: Using the inbuilt Stack Data Structure, convert the infix expression given by 
 * the user into Postfix expression. A static method ‘static int Prec()’ is used to find the 
 * precedence of the operator. And the output is stored in the ‘result’ variable
 */


import java.util.*;
public class Pracs2 {
    static int Prec(char ch) {
        switch (ch) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
        
    }
        return -1;
    }
    //for postfix expression
    static String infixpostfix(String exp) {
    
        //initializing empty String for result or output
        String result =new String("");
    
        //initializing empty stack
        Stack<Character> stack = new Stack<Character>();
    
        for(int i=0;i<exp.length(); ++i) {
            char c = exp.charAt(i);
        
            //if the scanned character is an operand, add it ti output
            if(Character.isLetterOrDigit(c))
                result +=c;
        
            //if the scanned character is an '(', push it to  stack
            else if(c=='(')
                stack.push(c);
        
            //if the scanned character is an ')', pop and output from the
            //stack until an ( is encountered
            else if(c==')') {
                while(!stack.isEmpty() && stack.peek()!='(') {
                    result += stack.peek();
                    stack.pop();
                }
            stack.pop();
            }
        
            else //an operator is encountered
            {
                //if the incoming opr pre is lower or equation
                while(!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    result += stack.peek();
                    stack.pop();
                }
                //incoming char is always added to stack
                stack.push(c);
            }
        }
    
        //pop all the operators from the stack
        while(!stack.isEmpty()) {
            if(stack.peek() == '(')
                return "Invalid expression";
            result += stack.peek();
            stack.pop();
        }
    
        return result;
    
    }
    //Driver's code
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);    
        //String exp = "(a+b*(c^d-e)^(f+g*h)-i)";
        //String exp ="(((a+b)*(c-d))+e)/(f+g)";
        //user input
        System.out.println();
        System.out.print("Enter the infix equation: ");
        String exp = sc.next();
        //function call
        System.out.println("Postfix: "+infixpostfix(exp)+"\n\n\n"); //infixpostfix
    }
}
