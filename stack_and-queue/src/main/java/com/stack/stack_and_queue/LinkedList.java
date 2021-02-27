package com.stack.stack_and_queue;


import java.util.Scanner;


public class LinkedList{
	private int size;
	private Node head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	
	public int getSize() {
		return size;
	}

	
	public void setSize(int size) {
		this.size = size;
	}

	
	public Node getHead() {
		return head;
	}

	
	public void setHead(Node head) {
		this.head = head;
	}

	
	static class Node<T extends Comparable<T>>{
		private T data;
		private Node next;
		
		public T getData() {
			return data;
		}

		
		public void setData(T data) {
			this.data = data;
		}

		
		public Node getNext() {
			return next;
		}

		
		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	
	public <T extends Comparable<T>> void addNodeAtFirst(T data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	
	
	public <T extends Comparable<T>> Node addNodeAtLast(T data) {
		Node n = new Node(data);
		Node t = head;
		if(t == null){
			head = n;
		}
		else {
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
		size++;
		return n;
	}
	
	
	public <T extends Comparable<T>> void addNodeAtIndex(T data,int index) {
		Node n = new Node(data);
		Node t = head;
		if(index == 0) {
			addNodeAtFirst(data);
			return;
		}
		for(int i=0; i < index-1  && t!=null; i++)
			t = t.next;
		if(t == null)
		{
			System.out.println("the list is not that long, value within the specified range not given");
			return;
		}
		n.next = t.next;
		t.next = n;
		size++;
	}
	
	
	public <T> void printList() {
		Node t = head;
		System.out.print("HEAD");
		while(t!=null) {
			System.out.print(" -> " + t.data);
			t = t.next;
		}
		System.out.print(" -> null\n");
	}
	
	
	public <T> T returnFirst() {
		if(head == null) {
			System.out.println("No elements present");
			return null;
		}
		return (T)head.data;
	}
	
	
	public <T> T pop() {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove. Returning null");
			return null;
		}
		else {
			Node n = head;
			head = head.next;
			size--;
			return (T)n.data;
		}
	}
	
	
	public <T> void popLast() {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove");
		}
		else if(size == 1) {
			head = null;
			size--;
		}
		else {
			Node t = head, prev = null;
			while(t.next != null) {
				prev = t;
				t = t.next;
			}
			prev.next = null;
			size--;
		}
	}
	
	
	public <T> void popSpecific(T val) {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove");
		}
		else if(head.data.compareTo(val)==0) {
			head = head.next;
			size--;
		}
		else {
			Node t = head.next, prev = head;
			while(t != null && t.data != val) {
				prev = t;
				t = t.next;
			}
			if(t.data.compareTo(val) == 0) {
				prev.next = t.next;
				size--;
			}
			else
				System.out.println("The data is not present inside list");
		}
	}
	
	
	public <T> boolean search(T data) {
		Node n = head;
		while( n != null) {
			if(n.data.compareTo(data) == 0)
				return true;
			n = n.next;
		}
		return false;
	}
	
	
	public <T  extends Comparable<T>> void addNodeAfter(T toPut,T present) {
		Node t = head;
		while( t != null) {
			if(t.data.compareTo(present) == 0) {
				Node n = new Node(toPut);
				n.next = t.next;
				t.next = n;
				size++;
				return;
			}
			t = t.next;
		}
		System.out.println("No node with data: " + present + " exists.");
	}
}