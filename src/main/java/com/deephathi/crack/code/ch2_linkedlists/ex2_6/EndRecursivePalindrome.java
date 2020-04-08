package com.deephathi.crack.code.ch2_linkedlists.ex2_6;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class EndRecursivePalindrome<T> implements PalindromeLinkedList<T> {

    private SinglyLinkedListNode<T> head;

    @Override
    public boolean isPalindrome(SinglyLinkedListNode<T> head) {
        this.head = head;
        return checkPalindrome(head);
    }

    private boolean checkPalindrome(SinglyLinkedListNode<T> right) {

        if (right == null) {
            return true;
        }

        boolean isPalindrome = checkPalindrome(right.getNext());

        if (!isPalindrome) {
            return false;
        }

        if (head.getData().equals(right.getData())) {
            head = head.getNext();
            return true;
        } else {
            return false;
        }
    }
}
