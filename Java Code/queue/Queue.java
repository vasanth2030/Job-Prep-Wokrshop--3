package com.vasanth.queue;

public class Queue {
	int arr[];
	int capacity;
	int front,rear;
	
	Queue(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		front=rear=0;
	}
	
	public void enqueue(int num)
	{
		if(rear==capacity)
		{
			System.out.println("Queue is full");
			return;
		}
		
		arr[rear]=num;
		rear++;
	}
	
	public int dequeue()
	{
		if(front==rear)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		
		int n=arr[front];
		
		for(int i=front;i<rear-1;i++)
		{
			arr[i]=arr[i+1];
		}
		rear--;
		
		return n;
	}
	

	
	public void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+"<--");
		}
		System.out.println();
	}

}
