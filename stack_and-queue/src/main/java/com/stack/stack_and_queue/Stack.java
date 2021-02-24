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
	
	
	public<T extends Comparable<T>> T peek() {
		if(top != null)
			return (T)top.getData();
		System.out.println("The stack is empty. Returning null");
		return null;
	}
	
	
	public<T extends Comparable<T>> T pop() {
		if(top != null) {
			LinkedList.Node topBeforePop = top;
			stack.pop();
			top = stack.getHead();
			return (T)topBeforePop.getData();
		}
		System.out.println("The stack is empty. Returning null");
		return null;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
		System.out.println("The element at top is " + stack.peek());
		stack.pop();
		System.out.println("The top element after pop is " + stack.peek());
		stack.printStack();
		stack.pop();
		System.out.println("The top element after pop is " + stack.peek());
		stack.printStack();
		stack.pop();
		System.out.println("The top element after pop is " + stack.peek());
		stack.printStack();
		
	}
}