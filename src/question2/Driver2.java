package question2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Driver2 {

    public static void main(String[] args) {

        Transactions transactions = new Transactions();
        Node node;

        node = new Node(50);
        node.left = new Node(30);
        node.right = new Node(60);
        node.left.left = new Node(10);
        node.right.left = new Node(40);

        Set<Integer> set = new TreeSet<>();
        transactions.getTreeElements(node, set);

        Iterator<Integer> it = set.iterator();
        transactions.getBinarySearchTree(node, it);

        transactions.getSkewTree(node);
    }
}
