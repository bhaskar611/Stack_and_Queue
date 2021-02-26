package com.stack.stack_and_queue;

import javax.swing.LayoutStyle;

public class Queue{
	private LinkedList queue;
	private LinkedList.Node first;
	private LinkedList.Node last;
	
	
	public Queue() {
		queue = new LinkedList();
		first = null;
		last = null;
	}

	
	public LinkedList getQueue() {
		return queue;
	}

	
	public void setQueue(LinkedList queue) {
		this.queue = queue;
	}

	
	public LinkedList.Node getFirst() {
		return first;
	}

	
	public void setFirst(LinkedList.Node first) {
		this.first = first;
	}

	 
	public LinkedList.Node getLast() {
		return last;
	}

	
	public void setLast(LinkedList.Node last) {
		this.last = last;
	}

	
	public<T extends Comparable<T>> void push(T data) {
		last = queue.addNodeAtLast(data);
		first = queue.getHead();
	}
	
	
	public void printQueue() {
		System.out.println("The queue is as follows");
		queue.printList();
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(56);
		queue.push(30);
		queue.push(70);	
		queue.printQueue();
		System.out.println("Data in the last node " + queue.last.getData());
	}
}
