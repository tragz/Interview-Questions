package com.linkedList;

public class ListNode {
    public Integer value;
    public ListNode next;

    ListNode() {
        value = -1;
        next = null;
    }

    ListNode(Integer value) {
        this.value = value;
        next = null;
    }

    public ListNode createLinkeList(Integer[] array) {

        ListNode Head = new ListNode();
        ListNode curr = Head;
        for(Integer item : array)
        {
            ListNode next = new ListNode(item);  /// Create a new Item
            curr.next = next;                    /// Update the chain to link to the newly created Item
            curr = curr.next;                    /// move the curr to point to newly created Item

        }
        return Head.next;                        /// Return the sentinal.next which is the Head of the Linked List
    }

    public ListNode reverseLinkedList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode next = curr.next;           /// next points to the next element in the linked list
            curr.next = prev;                    /// update the curr.next to point to the prev ( which is the previous node before curr node )
            prev = curr;                         /// update the prev to point to curr node as this will be new head
            curr = next;                         /// move the curr to next to move forward in linked list chain
        }

        return prev;                             /// prev now points to the head of the reversed linked list
    }

    public ListNode reverseKElementsLinkedList(ListNode head, int K) {

            if(head == null) return head;

            ListNode curr = head;
            int count = K;

            while(curr!=null && --count>0) curr=curr.next;
            if(curr==null) return head;            //// where the number of nodes in the list are less than K

            ListNode noChangeList=curr.next;       //// Pointer to the next node after K elements
            curr.next=null;

            ListNode reversedOne = reverseLinkedList(head);      //// reverse the K nodes starting from head and return the head of the reversed list
            head.next=noChangeList;                //// the head now points to tail of reverse K list , point k.next to list of nodes after K nodes

            curr=noChangeList;                     //// update the curr to next lister after the revesesal of K nodes
            count=K;                               //// Reset the Count to K

            while(curr!=null && --count>0) curr=curr.next; //// move forward K nodes

            if(curr == null) return reversedOne;   //// if curr is poiting to null then there are less than K elements to rotate
            curr.next = reverseKElementsLinkedList(curr.next, K); //// reverse the next list k elments each point the curr.next to head of the reversed list

            return reversedOne;
        }
}
