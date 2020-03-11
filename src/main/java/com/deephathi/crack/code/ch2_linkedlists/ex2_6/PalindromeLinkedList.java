package com.deephathi.crack.code.ch2_linkedlists.ex2_6;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;
import com.deephathi.crack.code.ch2_linkedlists.em2_0.SinglyLinkedList;

public class PalindromeLinkedList<T> {

    public boolean isPalindrome(SinglyLinkedListNode<T> head) {
        SinglyLinkedListNode<T> reverseHead = reverseList(head);
        return areTwoListSame(head, reverseHead);
    }

    private SinglyLinkedListNode<T> reverseList(SinglyLinkedListNode<T> head) {

        SinglyLinkedListNode<T> currentNode = head;

        SinglyLinkedListNode<T> reverseHead = null;

        while (currentNode != null) {

           SinglyLinkedListNode<T> tempNode = reverseHead;
           reverseHead = new SinglyLinkedListNode<>(currentNode.getData());
           reverseHead.setNext(tempNode);

            currentNode = currentNode.getNext();

        }

        return reverseHead;
    }


    private boolean areTwoListSame(SinglyLinkedListNode<T> head, SinglyLinkedListNode<T> reverseHead) {
        boolean result = false;
        SinglyLinkedListNode<T> currentNode = head;
        SinglyLinkedListNode<T> reverseCurrentNode = reverseHead;

        while (currentNode != null && reverseCurrentNode != null) {
            if (currentNode.getData().equals(reverseCurrentNode.getData())) {
                result = true;
            } else {
                result = false;
                break;
            }
            currentNode = currentNode.getNext();
            reverseCurrentNode = reverseCurrentNode.getNext();
        }

        return result;
    }
}
