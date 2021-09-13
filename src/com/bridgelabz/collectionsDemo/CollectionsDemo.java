package com.bridgelabz.collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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


	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		
	}

	


}