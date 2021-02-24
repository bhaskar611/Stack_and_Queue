package com.stack.stack_and_queue;

public class Stack{
	private LinkedList stack;
	
	public LinkedList.Node getTop() {
		return top;
	}

	
	public void setTop(LinkedList.Node top) {
		this.top = top;
	}

	
	public LinkedList getStack() {
		return stack;
	}

	
	public void setStack(LinkedList stack) {
		this.stack = stack;
	}

	LinkedList.Node top;
	
	
	public Stack() {
		stack = new LinkedList();
		top = null;
	}

	public<T extends Comparable<T>> void push(T data) {
		stack.addNodeAtFirst(data);
		top = stack.getHead();
	}
	
	public void printStack() {
		System.out.println("The stack is as follows");
		stack.printList();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
	}
}