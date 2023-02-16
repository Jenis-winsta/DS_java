/*
 * Author: Jenis Winsta
 * Date:19/01/2022
 * Description: Class delete is a user defined function through which the data in the given position is deleted.
 */
package edu.DS_practicals;

public class Pracs5 {
    static Node Delete_node(Node head, int position) {
        Node p = head;
        Node q = head;
        int i = 2;
        if (position == 1) {
            p = p.getNext();
            head = p;
            return head;
        }
        while (p.getNext() != null) {
            p = p.getNext();
            if (i == position) {
                q.setNext(p.getNext());
                p = null;
                break;
            } else
                q = p;
            i++;
        }

        return head;
    }

    static void display(Node h) {
        // to display only the start pointer is required i.e head
        Node p = h;
        while (p != null) {
            System.out.print(" --> " + p.getData());
            p = p.getNext();
        }
    }

    public static void main(String[] args) {
        // display();
        Node head = new Node(70);// first node

        Node n2 = new Node(80);
        Node n3 = new Node(90);
        Node n4 = new Node(100);
        // Node n5 = new Node(110);
        // Node n6 = new Node(120);
        // Node n7 = new Node(130);
        // attach two node
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        // n4.setNext(n5);
        // n5.setNext(n6);
        // n6.setNext(n7);
        // Display 2 node
        display(head);
        head = Delete_node(head, 3);
        System.out.println();
        System.out.println("After deletion");
        display(head);
    }
}