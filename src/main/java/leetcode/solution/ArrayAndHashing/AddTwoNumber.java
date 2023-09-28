// https://leetcode.com/problems/add-two-numbers/
package leetcode.solution.ArrayAndHashing;

public class AddTwoNumber {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    static class Solution {
        /**
         * Adds two numbers represented by linked lists.
         *
         * @param l1 The first linked list.
         * @param l2 The second linked list.
         * @return The resulting linked list after adding the two numbers.
         */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // Create a dummy head node to hold the result
            ListNode dummyHead = new ListNode(0);
            // Create a pointer to track the current node
            ListNode curr = dummyHead;
            // Initialize the carry variable to 0
            int carry = 0;

            // Iterate through the linked lists until both are exhausted
            while (l1 != null || l2 != null) {
                // Initialize the sum with the carry value
                int sum = carry;

                // Add the value of the current node in the first linked list, if available
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                // Add the value of the current node in the second linked list, if available
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                // Update the carry value
                carry = sum / 10;
                // Create a new node with the sum modulo 10 and set
                // it as the next node in the result linked list
                curr.next = new ListNode(sum % 10);
                // Move the current pointer to the next node
                curr = curr.next;
            }

            // If there is a remaining carry, create a new node with the carry value and
            // set it as the next node in the result linked list
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }

            // Return the result linked list starting from the next node of the dummy head
            return dummyHead.next;
        }
    }

    public static void main(String[] args) {
        // Demo using addTwoNumbers
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result!= null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
