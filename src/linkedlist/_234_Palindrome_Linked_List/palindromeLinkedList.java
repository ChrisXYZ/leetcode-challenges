package linkedlist._234_Palindrome_Linked_List;

import java.util.Stack;

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