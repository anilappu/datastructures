package com.anil.datastructures;

import java.util.NoSuchElementException;

public class StackUsingLinkedList {

	protected Node top;
	protected int size;
	
	public StackUsingLinkedList(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public void push(int data){
		Node newNode = new Node(data, null);
		if(top == null)
			top = newNode;
		else{
			newNode.setLink(top);
			top = newNode;
		}
		size++;
	}
	
	public int pop(){
		if(isEmpty())
			throw new NoSuchElementException("Stack is Empty");
		Node valueToPop = top;
		top  = top.link;
		size --;
		return valueToPop.getData();
	}
	
	public int peek(){
		if(isEmpty())
			throw new NoSuchElementException("Stack is Empty");
		return top.getData();
	}
	
	public void display(){
		 System.out.print("\nStack = ");
	        if (size == 0) 
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        System.out.println("stack has " + size +"elements");
	        
	        Node ptr = top;
	        while(null != ptr){
	        	System.out.println(ptr.getData() + " ");
	        	ptr = ptr.getLink();
	        }
	        System.out.println();
	        
	}
	
}




class Node{
	protected int data;
	protected Node link;
	
	
	public Node(){
		link = null;
		data =0 ;
	}
	
	public Node(int dataValue, Node linkNode){
		link = linkNode;
		data = dataValue ;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
}
