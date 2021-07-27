package com.linkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeTest {

    private ListNode head;

    @Before
    public void setUp() throws Exception {
        head = new ListNode();
    }

    @Test
    public void testCreationLinkedList() {
        Integer[] array = {10, 20, 30, 40 };
        int i = 0;
        ListNode temp = this.head.createLinkeList(array);

        while(temp != null) {
            assertEquals(array[i++], temp.value);
            temp = temp.next;
        }
    }

    @Test
    public void testEmptyCreationList() {
        Integer[] array = {};
        int i = 0;
        ListNode temp = this.head.createLinkeList(array);

        assertEquals(null, temp);
    }

    @Test
    public void testReverseLinkedList() {
        Integer[] array = {10, 20, 30, 40 };
        Integer[] revArray = {40, 30, 20, 10 };
        ListNode temp = this.head.createLinkeList(array);
        ListNode reverseList = head.reverseLinkedList(temp);

        int i = 0;
        while(reverseList != null) {
            assertEquals(revArray[i++], reverseList.value);
            reverseList = reverseList.next;
        }
    }

    @Test
    public void testReverseEveryKElementsLinkedList() {
        Integer[] array = {10, 20, 30, 40 };
        Integer[] revArray = {20, 10, 40, 30 };
        ListNode temp = this.head.createLinkeList(array);
        int K = 2;
        ListNode reverseList = head.reverseKElementsLinkedList(temp, K);

        int i = 0;
        while(reverseList != null) {
            assertEquals(revArray[i++], reverseList.value);
            reverseList = reverseList.next;
        }
    }

}