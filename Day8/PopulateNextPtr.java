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
         Node temp =null;
         while(!q.isEmpty()){
             int n = q.size();
             for(int i=0;i<n;i++){
                 Node prev = temp;
                 temp = q.poll();
 
                 if(i>0){
                     prev.next = temp;
                 }
 
                 if(temp.left!=null){
                     q.add(temp.left);
                 }
 
                 if(temp.right!=null){
                     q.add(temp.right);
                 }
             }
             temp.next = null;
 
         }
         return root;
     }
}
