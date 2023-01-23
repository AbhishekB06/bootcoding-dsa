package com.bootcoding.dsa.LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node node = n3;
        printLinkedList(head);
        Node A = deleteNode(node);
        printLinkedList(head);
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
        return node;
    }
}
