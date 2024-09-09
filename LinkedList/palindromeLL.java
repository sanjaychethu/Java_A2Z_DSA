  /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

     Stack<Integer> stack = new Stack<>();

        // Step 2: Traverse the linked list and push all elements to the stack
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Step 3: Traverse the linked list again and compare elements from the stack
        current = head;
        while (current != null) {
            int topValue = stack.pop(); // Pop the top value from the stack

            // Step 4: Compare the stack's value with the current node's value
            if (current.val != topValue) {
                return false; // If values don't match, it's not a palindrome
            }

            current = current.next; // Move to the next node
        }

        // Step 5: If all values matched, it's a palindrome
        return true;
    }
}
    
