package edu.DS_practicals;

public class Pracs6B {
    static void display(Node h) {
		//to display only the start pointer is required i.e head
		Node p=h;
		
		while(p!=null) {
			System.out.print(" --> "+p.getData());
			p=p.getNext();
			
		}
	}
    static void minmax_mul(Node h) {
		Node p=h;
        int max=0;
        int min=Integer.MAX_VALUE;
		while(p!=null) {
			if(p.getData()<min){
                min=p.getData();
            }
            if(p.getData()>max){
                max=p.getData();
            }
            p=p.getNext();
		}
        System.out.println("\nMax: "+max+"\nMin: "+min);
        System.out.println("Product of Max and Min: "+(min*max));
	}
    public static void main(String[] args) {
        Node head = new Node(70);//first node
		
		Node n2 = new Node(80);
		Node n3 = new Node(90);
		Node n4= new Node(100);
		// Node n5 = new Node(110);
		Node n6 = new Node(120);
		Node n7= new Node(130);
		//attach two node
		head.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		// n4.setNext(n5);
		n4.setNext(n6);
		n6.setNext(n7);
		//Display 2 node
		display(head);
        minmax_mul(head);
    }
}
