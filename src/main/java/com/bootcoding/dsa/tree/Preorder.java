package com.bootcoding.dsa.tree;

public class Preorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        preorder(root);
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
