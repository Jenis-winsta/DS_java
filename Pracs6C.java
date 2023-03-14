package edu.DS_practicals;

public class Pracs6C {
    static void display(Node h) {
		//to display only the start pointer is required i.e head
		Node p=h;
		
		while(p!=null) {
			System.out.print(" --> "+p.getData());
			p=p.getNext();
		}
	}
    static void sum(Node h){
        int sum=0;
        Node p=h;
        while(p!=null){
            sum+=p.getData();
            p=p.getNext();
        }
        
        System.out.println("\nSum of data: "+sum);
    }
    public static void main(String[] args) {
        
		Node head = new Node(70);//first node
		
		Node n2 = new Node(80);
		Node n3 = new Node(90);
		Node n4= new Node(100);
		Node n5 = new Node(110);
		Node n6 = new Node(120);
		Node n7= new Node(130);
		//attach two node
		head.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		//Display 2 node
		display(head);
        sum(head);
    }
}
