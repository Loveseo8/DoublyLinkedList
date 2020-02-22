package com.company;

public class Main {

    public static void main(String[] args) {
	DoublyLinkedList list = new DoublyLinkedList();
	list.push(9);
	list.push(2);
	list.push(1);
	list.push(9);
	list.push(7);
	list.push(5);
	list.push(3);
	list.push(2);
	list.push(1);

	list.partition(list.head, 5);

	System.out.println();

	list.printList(list.head);
    }
}
