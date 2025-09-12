package com.ruby.java.ch08_work;

class LinkedList2 {

	private Node head = null;

	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	public void add(String data) {

	}

	public void print() {

	}
	
	public void delete(String data) {

	}
}
public class Work_InnerClass_LinkedList_Practice {
	public static void main(String[] args) {
		LinkedList2 myList = new LinkedList2();
		myList.print();

		myList.add("11");
		myList.add("55");
		myList.add("77");
		myList.add("177");
		myList.add("33");
		myList.print();
		myList.delete("177");
		System.out.println("삭제후 출력: ");
		myList.print();
		//Node ndx = new Node("kim");
		//MyLinkedList.Node nd = myList.new Node("Hong");//not visible
		//nd.data = "hello";
	}
}
