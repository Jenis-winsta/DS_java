//Creating a linked list using a function(not manual)
package edu.DS_practicals;

import java.util.Scanner;

public class Pracs4B_f {
    static void createLL(Node head, int data){
        Node p=head;
        Node q=new Node(data);
        //brings pointer p to the end
        while(p.getNext()!=null){
            p=p.getNext();
        }
        p.setNext(q);   
    }
    static void display(Node head){
        Node p=head;
        while(p!=null){
            System.out.print(" -->"+p.getData());
            p=p.getNext();
        }
    }
    public static void main(String[] args) {
        Node head=null;
        Scanner sc = new Scanner(System.in);
        int num=0;
        for(int i=0;i<5;i++){
            System.out.print("Number "+(i+1)+":");
            num=sc.nextInt();
            if(i==0)
                head=new Node(num);
            else
                createLL(head,num);                
        }
        display(head);
    }
}
