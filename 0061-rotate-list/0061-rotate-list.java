class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: find length and tail
        ListNode curr = head;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // curr is now at tail

        // Step 2: make it circular
        curr.next = head;

        // Step 3: reduce k
        k = k % length;

        // Step 4: find new tail
        int stepsToNewTail = length - k;
        ListNode newTail = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 5: break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}