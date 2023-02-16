/*
 * tower of hanoi
 */
package edu.DS_practicals;
public class Pracs4A {
    static public void toh(int n,char from, char to, char aux) {
		//possibilities
		if(n<=0) 
			return;	//comes out of function
		toh(n-1,from,aux,to);
		System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
		toh(n-1,aux,to,from);
	}
	
	public static void main(String[] args) {
		int n=3;
		toh(n,'A','C','B');		
		
	}
}
