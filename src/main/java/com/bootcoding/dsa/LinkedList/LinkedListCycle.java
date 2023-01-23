package com.bootcoding.dsa.LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(-4);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(Node head) {
        Node sp = head;
        Node fp = head;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp){
                return true;
            }
        }
        return false;
    }
}
