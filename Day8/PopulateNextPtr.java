package Day8;
// You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

import java.util.LinkedList;
import java.util.Queue;

// struct Node {
//   int val;
//   Node *left;
//   Node *right;
//   Node *next;
// }
// Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

// Initially, all next pointers are set to NULL.


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class PopulateNextPtr {
    public Node connect(Node root) {

        if(root ==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.poll();

            if(temp.left!=null){
                temp.left.next = temp.right;
                q.add(temp.left);
            }

            if(temp.right!=null){
                temp.right.next = temp.right;
                q.add(temp.right);
            }

        }
        return root;
    }
}
