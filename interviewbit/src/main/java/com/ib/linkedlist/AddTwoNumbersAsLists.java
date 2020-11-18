package com.ib.linkedlist;

public class AddTwoNumbersAsLists {

    public static void main(String... args) {
        ListNode A = LinkedListUtils.generateLinkedList(7 , 7 , 9 , 7 , 4 , 1 , 1 , 4 , 8 , 7 , 8 , 2 , 3 , 5 , 9 , 2 , 8 , 2 , 5 , 8 , 8 , 1 , 9 , 8 , 3 , 4 , 3 , 9 , 6 , 5 , 3 , 4 , 2 , 9 , 9 , 4 , 4 , 3 , 9 , 3 , 1 , 3 , 8 , 1 , 7 , 2 , 5 , 5 , 1 , 3 , 8 , 5 , 6 , 8 , 3 , 2 , 7 , 4 , 2 , 6 , 2 , 3 , 1 , 3 , 7 , 8 , 5 , 9 , 3 , 4 , 8 , 3 , 6 , 5 , 7 , 9 , 4 , 5 , 2 , 6 , 3 , 6 , 2 , 6 , 3 , 5 , 5 , 4 , 5 , 2 , 1 , 5 , 3 , 4 , 5 , 7 , 5 , 9 , 7 , 7 , 7 , 7 , 2 , 2 , 4 , 4 , 7 , 3 , 2 , 4 , 9 , 1 , 7 , 9 , 3 , 4 , 6 , 5 , 7 , 9 , 8 , 7 , 4 , 1 , 7 , 3 , 4 , 7 , 1 , 3 , 6 , 4 , 2 , 7 , 5 , 4 , 7 , 2 , 7 , 6 , 5 , 8 , 5 , 3 , 4 , 7 , 8 , 6 , 4 , 7 , 7 , 9 , 5 , 7 , 4 , 1 , 8 , 8 , 3 , 9 , 3 , 6 , 9 , 8 , 7 , 4 , 9 , 9 , 1 , 4 , 7 , 4 , 6 , 5 , 3 , 2 , 5 , 4 , 4 , 1 , 8 , 3 , 7 , 2 , 7 , 8 , 8 , 6 , 1 , 6 , 3 , 7 , 5 , 4 , 2 , 1 , 8 , 9 , 1 , 9 , 8 , 1 , 7 , 5 , 4 , 7 , 6 , 2 , 6 , 6 , 1 , 7 , 7 , 1 , 2 , 4 , 3 , 8 , 9 , 8 , 2 , 6 , 7 , 8 , 6 , 1 , 6 , 8 , 9 , 6 , 7 , 7 , 2 , 3 , 2 , 6 , 9 , 9 , 9 , 9 , 6 , 2 , 6 , 2 , 1 , 9 , 4 , 9 , 9 , 3 , 3 , 7 , 1 , 4 , 4 , 1 , 8 , 7 , 5 , 7 , 5 , 3 , 6 , 8 , 1 , 3 , 6 , 4 , 1 , 3 , 9 , 7 , 5 , 4 , 1 , 8 , 5 , 4 , 1 , 1 , 7 , 4 , 8 , 9 , 5 , 1 , 4 , 8 , 6 , 1 , 8 , 7 , 3 , 1 , 3 , 4 , 7 , 2 , 3 , 1 , 7 , 9 , 6 , 8 , 2 , 4 , 4 , 5 , 3 , 5 , 4 , 6 , 1 , 2 , 6 , 4 , 9 , 1 , 9 , 3 , 7 , 5 , 8 , 6 , 5 , 7 , 7 , 3 , 2 , 9 , 2 , 4 , 1 , 1 , 4 , 1 , 2 , 4 , 1 , 9 , 7 , 9 , 4 , 4 , 7 , 2 , 4 , 9 , 1 , 3 , 2 , 3 , 1 , 7 , 8 , 3 , 6 , 7 , 5 , 2 , 4 , 4 , 8 , 6 , 5 , 4 , 8 , 6 , 7 , 1 , 2 , 5 , 4 , 6 , 5 , 5 , 2 , 5 , 6 , 6 , 2 , 2 , 1 , 8 , 7 , 7 , 7 , 1 , 3 , 3 , 1 , 5 , 6 , 9 , 8 , 8 , 6 , 7 , 8 , 1 , 7 , 6 , 8 , 7 , 7 , 2 , 1 , 8 , 6 , 2 , 9 , 9 , 3 , 1 , 9 , 2 , 6 , 3 , 5 , 2 , 4 , 6 , 8 , 8 , 2 , 2 , 2 , 2 , 4 , 5 , 1 , 5 , 4 , 8 , 1 , 9 , 9 , 8 , 7 , 6 , 7 , 7 , 5 , 2 , 8 , 9 , 2 , 1 , 3 , 7 , 4 , 7 , 5 , 3 , 5 , 7 , 3 , 4 , 9 , 8 , 3 , 6 , 5 , 1 , 1 , 9 , 7 , 8 , 5 , 6 , 6 , 1 , 6 , 7 , 1 , 5 );
        ListNode B = LinkedListUtils.generateLinkedList( 8 , 4 , 8 , 7 , 6 , 6 , 7 , 9 , 7 , 5 , 2 , 4 , 8 , 4 , 2 , 1 , 3 , 8 , 6 , 7 , 8 , 4 , 1 , 8 , 1 , 1 , 8 , 9 , 2 , 3 , 5 , 3 , 5 , 1 , 7 , 9 , 5 , 7 , 7 , 7 , 9 , 8 , 1 , 3 , 6 , 3 , 3 , 3 , 9 , 9 , 6 , 3 , 1 , 9 , 8 , 5 , 3 , 2 , 6 , 6 , 4 , 8 , 3 , 6 , 8 , 9 , 8 , 5 , 1 , 7 , 5 , 4 , 3 , 6 , 7 , 1 , 2 , 6 , 2 , 8 , 7 , 6 , 7 , 4 , 3 , 3 , 4 , 5 , 5 , 5 , 4 , 6 , 7 , 9 , 6 , 3 , 2 , 3 , 4 , 3 , 4 , 1 , 7 , 9 , 5 , 2 , 7 , 4 , 9 , 8 , 5 , 2 , 9 , 8 , 8 , 5 , 2 , 3 , 3 , 2 , 7 , 2 , 1 , 8 , 1 , 8 , 1 , 7 , 3 , 7 , 9 , 4 , 3 , 7 , 5 , 1 , 2 , 1 , 6 , 1 , 6 , 7 , 8 , 1 , 3 , 5 , 6 , 2 , 9 , 8 , 2 , 6 , 5 , 4 , 4 , 2 , 8 , 6 , 8 , 3 , 1 , 5 , 6 , 7 , 5 , 6 , 1 , 5 , 4 , 8 , 4 , 8 , 1 , 1 , 1 , 7 , 7 , 9 , 2 , 6 , 3 , 8 , 1 , 8 , 9 , 9 , 5 , 6 , 9 , 2 , 2 , 8 , 9 , 8 , 7 , 1 , 3 , 6 , 5 , 7 , 4 , 1 , 9 , 8 , 3 , 4 , 7 , 4 , 1 , 5 , 7 , 9 , 4 , 4 , 3 , 1 , 8 , 4 , 8 , 1 , 1 , 8 , 6 , 3 , 8 , 6 , 2 , 7 , 4 , 6 , 7 , 8 , 8 , 9 , 7 , 9 , 1 , 3 , 3 , 7 , 9 , 8 , 6 , 4 , 2 , 4 , 4 , 8 , 4 , 3 , 7 , 2 , 2 , 8 , 8 , 9 , 9 , 7 , 8 , 2 , 6 , 2 , 9 , 8 , 6 , 8 , 2 , 5 , 6 , 5 , 8 , 6 , 8 , 7 , 7 , 1 , 7 , 7 , 4 , 6 , 6 , 8 , 9 , 8 , 6 , 1 , 3 , 4 , 7 , 9 , 8 , 2 , 3 , 7 , 7 , 7 , 1 , 9 , 7 , 7 , 1 , 1 , 6 , 7 , 9 , 2 , 6 , 7 , 1 , 3 , 7 , 6 , 6 , 8 , 2 , 1 , 2 , 7 , 6 , 8 , 1 , 3 , 3 , 9 , 4 , 7 , 5 , 7 , 8 , 3 , 6 , 9 , 7 , 9 , 7 , 5 , 2 , 7 , 7 , 8 , 3 , 1 , 9 , 8 , 2 , 6 , 7 , 6 , 4 , 4 , 1 , 7 , 2 , 2 , 7 , 3 , 9 , 4 , 1 );
        AddTwoNumbersAsLists addTwoNumbersAsLists = new AddTwoNumbersAsLists();
        ListNode result = addTwoNumbersAsLists.addTwoNumbers(A, B);
        LinkedListUtils.printLinkedList(result);
    }

    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        int carry = 0;
        ListNode currentA = A;
        ListNode currentB = B;
        ListNode start = new ListNode(-1);
        ListNode curr = start;
        while (currentA != null && currentB != null) {
            int val = currentA.val + currentB.val + carry;
            if (val > 9) {
                String valStr = String.valueOf(val);
                carry = Integer.parseInt(valStr.substring(0,valStr.length()-1));
                val = Integer.parseInt(String.valueOf(val).substring(valStr.length()-1));
            }
            curr.next = new ListNode(val);
            curr = curr.next;

            currentA = currentA.next;
            currentB = currentB.next;
        }
        while (currentA != null) {
            int val = currentA.val + carry;
            if (val > 9) {
                String valStr = String.valueOf(val);
                carry = Integer.parseInt(valStr.substring(0,valStr.length()-1));
                val = Integer.parseInt(String.valueOf(val).substring(valStr.length()-1));
            }
            curr.next = new ListNode(val);
            curr = curr.next;
            currentA = currentA.next;
        }
        while (currentB != null) {
            int val = currentB.val + carry;
            if (val > 9) {
                String valStr = String.valueOf(val);
                carry = Integer.parseInt(valStr.substring(0,valStr.length()-1));
                val = Integer.parseInt(String.valueOf(val).substring(valStr.length()-1));
            }
            curr.next = new ListNode(val);
            curr = curr.next;
            currentB = currentB.next;
        }
        return start.next;
    }
}
