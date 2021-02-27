package com.stack.stack_and_queue;

import javax.swing.LayoutStyle;

public class Queue{
	private LinkedList queue;
	private LinkedList.Node first;
	private LinkedList.Node last;
	
	/**
	 * Constructor for queue. Assigns memory to the queue.
	 */
	public Queue() {
		queue = new LinkedList();
		first = null;
		last = null;
	}

	/**
	 * @return the queue
	 */
	public LinkedList getQueue() {
		return queue;
	}

	/**
	 * @param queue the queue to set
	 */
	public void setQueue(LinkedList queue) {
		this.queue = queue;
	}

	/**
	 * @return the first
	 */
	public LinkedList.Node getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(LinkedList.Node first) {
		this.first = first;
	}

	/**
	 * @return the last
	 */
	public LinkedList.Node getLast() {
		return last;
	}

	/**
	 * @param last the last to set
	 */
	public void setLast(LinkedList.Node last) {
		this.last = last;
	}

	/**
	 * This method pushes data into queue
	 */
	public<T extends Comparable<T>> void push(T data) {
		last = queue.addNodeAtLast(data);
		first = queue.getHead();
	}
	
	/**
	 * This method prints the queue
	 */
	public void printQueue() {
		System.out.println("The queue is as follows");
		queue.printList();
	}
	
	/**
	 * Removes the first element of the queue
	 */
	public<T> T deque() {
		T data =  queue.pop();
		first = queue.getHead();
		return data;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(70);
		queue.push(30);
		queue.push(56);
		
		queue.printQueue();
		System.out.println("Data in the last node " + queue.last.getData());
		System.out.println("The element being deque'd " + queue.deque());
		queue.printQueue();
	}
}