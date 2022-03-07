package com.vasanth.linkedlist;

public class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public static void insertNodeAtEnd(Node head,int data)
	{
		Node currNode=head;
		
		
		while(currNode.next!=null)
		{
			currNode=currNode.next;
		}
		
		Node newNode=new Node(data);
		currNode.next=newNode;
	}
	
	
	public static Node insertAtPos(Node head,int pos,int data)
	{
		Node newNode=new Node(data);
		
		if(pos<=1)
		{
			newNode.next=head;
			return newNode;
		}
		
		Node curr=head;
		for(int i=1;i<pos-1;i++)
		{
			curr=curr.next;
		}
		
		Node nextNode=curr.next;
		curr.next=newNode;
		newNode.next=nextNode;
		
		return head;
	}
	
	public static Node deleteNode(Node head,int val)
	{
		if(head.data==val)
			return head.next;
		
		Node curr=head;
		while(curr.next!=null)
		{
			if(curr.next.data==val)
			{
				curr.next=curr.next.next;
				return head;
			}
			else
				curr=curr.next;
		}
		return head;
	}
	
	
	
	public static void printLinkedlist(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
	}

}
