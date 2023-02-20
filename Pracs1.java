package edu.DS_practicals;

/*
 * Author: Jenis Winsta
 * Date:30/11/2022
 * Description: class stackds is a user-defined stack through which 			
 * 2 stacks 'capital' and 'small' are created to store the 			
 * respective letters. The word entered by the user is 			
 * segregated into small and capital letters and displayed         		
 * according to the user's need.
 */
//package Data_Structures;
import java.util.Scanner;
class stackds{
    int size;
    int top =-1;
    char arr[];
    stackds(int size){
        this.size =size;
        arr=new char [size];
    }
    boolean isEmpty() {
        return (top==-1);
    }
    boolean isFull() {
        return (top==size-1);
    }
    void push(char data) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        else {
            arr[++top]=data;
        }
    }
    char pop() {
        if(isEmpty()) {
            System.out.println("Stack empty");
        }
        else {
            return arr[top--];        }
        return 0;
    }
    void display() {
        if(top>-1) {
            for(int i=top; i>=0;i--) {
                System.out.println("The value is: "+arr[i]);
            }
        }
    }
    char peek() {
        return arr[top];
    }
    void delete() {
        top=-1;
    } 
}


public class Pracs1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.next();
	  //Creating objects of class stackds
        stackds small =new stackds(str.length()+2);
        stackds capital =new stackds(str.length()+2);
        for(int i=0;i<str.length();i++) {
            char temp= str.charAt(i);
		//If small push the character into ‘small’ stack else into ‘capital’ stack
            if(Character.isLowerCase(temp)) {
                small.push(temp);
            }
            else {
                capital.push(temp);
            }          
        }
      while(true){
          System.out.println("[0]Small stack or [1]Capital Stack:");
            int stack=sc.nextInt();
            if(stack==0){
                System.out.println("Small stack");
                small.display();
            }
            else if(stack==1){
                System.out.println("Capital stack");
                capital.display();
            }
            else{
                System.out.println("Invalid!!");
                break;
            }
        }    
    }
}

