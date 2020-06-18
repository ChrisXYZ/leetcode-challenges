package linkedlist.palindromeLinkedList;

import java.util.Stack;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Example 1:
 * Input: 1->2
 * Output: false
 * <p>
 * Example 2:
 * Input: 1->2->2->1
 * Output: true
 * <p>
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = head;

        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }

        while (!stack.isEmpty()) {
            ListNode value = stack.pop();
            if (value.val != head.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}