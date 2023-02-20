/*
 * Create function to join the Linked List one after another and return the newLL
 */
package edu.DS_practicals;

public class Pracs6A {
    static void display(Node head){
        Node p=head;
        while(p!=null){
            System.out.print(" -> "+p.getData());
            p=p.getNext();
        }
    }
    static Node join_fun(Node head1,Node head2){
        Node h1=head1;
        Node h2=head2;

        while(h1.getNext()!=null){
            h1=h1.getNext();
        }
        h1.setNext(h2);
        return head1;
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
        //Default code for manual LL
        Node head1=new Node(10);
        Node n1=new Node(11);
        Node n2 =new Node(12);
        //Second LL
        Node head2=new Node(20);
        Node n3=new Node(40);
        Node n4=new Node(60);
        Node n5=new Node(80);

        head1.setNext(n1);
        n1.setNext(n2);
        head2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        System.out.print("Head 1:");
        display(head1);System.out.println();
        System.out.print("Head 2:");
        display(head2);
        System.out.println();
        //-----------end of default-----------

        join_fun(head1,head2);
        System.out.println("Concatenate:");
        display(head1);
        System.out.println("");
        minmax_mul(head1);
        sum(head1);
        
    }   
}