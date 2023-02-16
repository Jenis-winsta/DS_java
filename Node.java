package edu.DS_practicals;

public class Node{
	private int data;
	private Node next;//creating pointer in java
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node(int data){
		this.data=data;
		this.next=null;//while creation data it does no have a next which it points
	}
    
}
