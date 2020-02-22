package com.company;

public class DoublyLinkedList {
    Node head;

    public void push(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;
        newNode.prev = null;

        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int newData) {

        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        Node newnode = new Node(newData);

        newnode.next = prevNode.next;
        prevNode.next = newnode;
        newnode.prev = prevNode;

        if (newnode.next != null)
            newnode.next.prev = newnode;
    }

    void addToTheEnd(int newData) {
        Node newnode = new Node(newData);
        Node last = head;
        newnode.next = null;

        if (head == null) {
            newnode.prev = null;
            head = newnode;
            return;
        }

        while (last.next != null) last = last.next;

        last.next = newnode;
        newnode.prev = last;
    }

    public void partition(Node node, int x) {
        Node last = null;
        Node node1 = node;
        Node last1 = null;

        while (node != null) {
            if (node.data < x) {
                System.out.print(node.data + " ");
                last = node;
                node = node.next;

            }
            else if (node.data >= x) {
                last = node;
                node = node.next;

            }
        }
        while (node1 != null) {
            if (node1.data >= x) {
                System.out.print(node1.data + " ");
                last1 = node1;
                node1 = node1.next;

            }
            else if (node1.data < x) {
                last1 = node1;
                node1 = node1.next;
            }
        }
    }
    public void printList(Node node) {
        Node last = null;

        System.out.println("In forward direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }

        System.out.println();

        System.out.println("In reverse direction");

        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    void deleteNode(Node headref, Node del) {

        if (head == null || del == null) {
            return;
        }

        if (head == del) {
            head = del.next;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }

        if (del.prev != null) {
            del.prev.next = del.next;
        }

        return;
    }
}
