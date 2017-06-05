package com.anil.datastructures;

import java.util.NoSuchElementException;

public class IntArrayStack {
	
	private int[] array;
	private int top,size, length;
	private int DEFAULT_STACK_SIZE=10;
	
	
	public IntArrayStack(int n){
		
		array =(n ==0? new int[DEFAULT_STACK_SIZE]:new int[n]);
		top = -1;
		size = DEFAULT_STACK_SIZE;
		length =0;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == size -1;
	}
	
	public int getSize(){
		return length;
	}
	
	public int peek(){
		if(isEmpty())
			throw new NoSuchElementException("Stack is Empty");
		return array[top];
		
	}
	
	public int pop(){
		if(isEmpty())
			throw new NoSuchElementException("Stack is Empty");
		length--;
		return array[top--];
		
	}
	
	public void push(int intToPush){
		if(isFull())
			throw new IndexOutOfBoundsException("Stack is Full");
		array[++top] = intToPush;
		length++;
		
	}
	
	/*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (length == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(array[i]+" ");
        System.out.println();
    }  

}
