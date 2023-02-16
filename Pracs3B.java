package edu.DS_practicals;
/*
 * Converting from infix to prefix using 2 stack
 * 
 * The infix expression is converted to prefix expression using 2 Stack(oprstk- for operator, opnstk- for operand).
 * The opnstk is the String stack. Through the method infixprefix() and returns the string that is pop for the opnstack.
 */




import java.util.*;
public class Pracs3B {
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


    //for prefix expression
    static String infixprefix(String exp) {
       
        String result =new String("");
       
        //initializing empty operator stack
        Stack<Character> oprstk = new Stack<Character>();


        //initializing empty operand stack(String)
        Stack<String> opnstk=new Stack<String>();


        char opr;
        String a,b;
        for(int i=0;i<exp.length(); ++i) {
            char c = exp.charAt(i);
          //if the scanned character is an operand, add it to output
            if(Character.isLetterOrDigit(c))
                opnstk.push(Character.toString(c));


            //if the scanned character is an '(', push it to stack
            else if(c=='(')
                oprstk.push(c);
           
            //if the scanned character is an ')', pop and output from the stack until an ( is encountered
            else if(c==')') {
                while(!oprstk.isEmpty() && oprstk.peek()!='('
                 && !oprstk.isEmpty()) {
                   
                    opr=oprstk.pop();
                    a=opnstk.pop();
                    b=opnstk.pop();
                    result+=opr+b+a;
                    opnstk.push(result);
                }
            oprstk.pop();//to discard '('
            result="";
            }
           
            else //an operator is encountered
            {
                //if the incoming opr pre is lower or equation
                while(!oprstk.isEmpty() && Prec(c) <= Prec(oprstk.peek())) {
                    opr= oprstk.pop();
                    a=opnstk.pop();
                    b=opnstk.pop();
                    result+=opr+b+a;
                    opnstk.push(result);
                }
                //incoming char is always added to stack
                oprstk.push(c);
                result="";
            }
        }
       
        //pop all the operators from the oprstk
        while(!oprstk.isEmpty()) {
           
            if(oprstk.peek() == '(')
                return "Invalid expression";
            opr= oprstk.pop();
            a=opnstk.pop();
            b=opnstk.pop();
            result+=opr+b+a;
            opnstk.push(result);
        }
        return opnstk.pop();
       
    }
    public static void main(String[] args) {
        //String Str="((a+b)*c)";
        String str=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Given exp: ");
        str=sc.next();
        System.out.println("Prefix exp: "+infixprefix(str));
    }
}

