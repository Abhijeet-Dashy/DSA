class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0;
        ListNode temp = head;
        // 1) Count nodes
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        // 2) If removing the head
        if (n == c) {
            return head.next;
        }
        // 3) Go to (c - n - 1)th node
        temp = head;
        for (int i = 0; i < c - n - 1; i++) {
            temp = temp.next;
        }
        // 4) Remove node
        temp.next = temp.next.next;

        return head;
    }
}
