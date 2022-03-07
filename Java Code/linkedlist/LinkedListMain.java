package com.vasanth.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		Node head=new Node(10);
		Node.insertNodeAtEnd(head, 20);
		Node.insertNodeAtEnd(head, 30);
		Node.insertNodeAtEnd(head, 40);
		Node.insertNodeAtEnd(head, 50);
		Node.insertNodeAtEnd(head, 60);
		Node.insertNodeAtEnd(head, 70);
		
		Node.printLinkedlist(head);
		System.out.println();
		
		head=Node.insertAtPos(head, 5, 120);
		Node.printLinkedlist(head);
		
		System.out.println();
		
		head=Node.insertAtPos(head, 1, 150);
		Node.printLinkedlist(head);
		System.out.println();
		
		head=Node.deleteNode(head, 50);
		Node.printLinkedlist(head);
		
		System.out.println();
		
		head=Node.deleteNode(head, 150);
		Node.printLinkedlist(head);
	}

}
