package com.company;

public class Main {

    public static void main(String[] args) {
	DoublyLinkedList list = new DoublyLinkedList();
	list.append(6);
	list.push(7);
	list.push(1);
	list.append(4);
	list.insertAfter(list.head.next, 8);

	list.printList(list.head);
    }
}
