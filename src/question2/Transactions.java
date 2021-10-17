package question2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Transactions {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static void getTreeElements(Node node, Set<Integer> set) {
        if (node == null) return;
        getTreeElements(node.left, set);
        set.add(node.data);
        getTreeElements(node.right, set);
    }

    static void getBinarySearchTree(Node node, Iterator<Integer> iterator) {
        if (node == null) return;
        getBinarySearchTree(node.left, iterator);
        node.data = iterator.next();
        getBinarySearchTree(node.right, iterator);
    }

    static void getSkewTree(Node node) {
        if (node == null) return;
        getSkewTree(node.left);
        System.out.print(node.data + " ");
        getSkewTree(node.right);
    }

    public static void main(String[] args) {
        Node node;
        node = new Node(50);
        node.left = new Node(30);
        node.right = new Node(60);
        node.left.left = new Node(10);
        node.right.left = new Node(40);

        Set<Integer> set = new TreeSet<>();
        getTreeElements(node, set);

        Iterator<Integer> it = set.iterator();
        getBinarySearchTree(node, it);

        getSkewTree(node);
    }
}
