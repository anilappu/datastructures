package com.anil.datastructures;

import java.util.NoSuchElementException;

public class arrayQueue {
	
	protected int[] Queue;
	protected int front,rear,size,length;
	
	public arrayQueue(int n){
		size = n;
		length =0;
		Queue = new int[size];
		front = -1;
		rear = 0;
	}

	public boolean isEmpty(){
		return front == rear;
	}
	
	public boolean isFull(){
		return length == size-1;
	}
	
	public int getLength(){
		return (size-front+rear)%size;
	}
	
	public int peek(){
		if(isEmpty())
			throw new NoSuchElementException("Queue is Empty");
		return Queue[front];
	}
	
	public void insert(int toInsert){
		if(isFull())
			throw new ArrayIndexOutOfBoundsException("Queue is full");
		else{
			Queue[rear] = toInsert;
			rear = (rear+1)%size; 
		}
	}
	
	public int remove(){
		if(isEmpty())
			throw new NoSuchElementException("Queue is Empty");
		else{
			int valueToRemove = Queue[front];
			Queue[front] = -2;// setting to -2
			front = (front+1)%size; 
			return valueToRemove;
			
		}
	}
	
	
	public void display(){
		System.out.print("\nQueue = ");
		if(getLength()==0){
			System.out.print("Empty\n");
            return ;
		}else{
			
		}
			
	}
}
