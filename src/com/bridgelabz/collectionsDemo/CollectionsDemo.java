package com.bridgelabz.collectionsDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class CollectionsDemo {
	
	public static void doListDemo() {
		
		System.out.println("List demo:");
		List<String> list = new LinkedList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}

	}
	

	public static void doStackDemo() {

		Stack<String> stack = new Stack<>();

		System.out.println("Stack Demo");
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amrit");
		stack.push("Ashish");
		stack.push("Garima");
		String popped = stack.pop();

		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void doQueueDemo() {

		PriorityQueue<String> queue = new PriorityQueue<>();

		System.out.println("Queue Demo");
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("Jai Shankar");
		queue.add("Raj");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("Iterating the queue elements:");

		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements:");
		iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void doSetDemo( ) {

		Set<String> set = new LinkedHashSet<>();

		System.out.println("\nInside Set Demo\n");
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		for(String element: set) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		
	}

	


}