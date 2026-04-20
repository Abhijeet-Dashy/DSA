/*
// Definition for a Node.
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
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return root;
        Node leftmost = root;

        while (leftmost.left != null) {
            Node curr = leftmost;
            while (curr != null) {
                // Connect left child to right child
                curr.left.next = curr.right;
                // Connect right child to the left child of the next node
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next; // Move right across the current level
            }
            leftmost = leftmost.left; // Move down to the next level
        }
        return root;
    }
}