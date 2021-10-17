package question2;

import java.util.Iterator;
import java.util.Set;

class Transactions {

    public void getTreeElements(Node node, Set<Integer> set) {
        if (node == null) return;
        getTreeElements(node.left, set);
        set.add(node.data);
        getTreeElements(node.right, set);
    }

    public void getBinarySearchTree(Node node, Iterator<Integer> iterator) {
        if (node == null) return;
        getBinarySearchTree(node.left, iterator);
        node.data = iterator.next();
        getBinarySearchTree(node.right, iterator);
    }

    public void getSkewTree(Node node) {
        if (node == null) return;
        getSkewTree(node.left);
        System.out.print(node.data + " ");
        getSkewTree(node.right);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
