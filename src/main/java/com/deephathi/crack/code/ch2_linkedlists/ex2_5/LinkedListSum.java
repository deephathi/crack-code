package com.deephathi.crack.code.ch2_linkedlists.ex2_5;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class LinkedListSum {

    public SinglyLinkedListNode<Integer> reverseSum(SinglyLinkedListNode<Integer> firstHead, SinglyLinkedListNode<Integer> secondHead) {

        int firstNo = getReverseDigit(firstHead);
        int secondNo = getReverseDigit(secondHead);
        int sum = firstNo + secondNo;

        return getReverseHead(sum);

    }

    private SinglyLinkedListNode<Integer> getReverseHead(int sum) {
        int divider = 10;
        int remainingNo = sum;
        SinglyLinkedListNode<Integer> fakeNode = new SinglyLinkedListNode<>(-1);
        SinglyLinkedListNode<Integer> currentNode = fakeNode;
        while (remainingNo > 0) {
            int data = remainingNo % divider;
            remainingNo /= divider;
            SinglyLinkedListNode<Integer> dataNode = new SinglyLinkedListNode<>(data);
            currentNode.setNext(dataNode);
            currentNode = dataNode;
        }
        return fakeNode.getNext();
    }

    private int getReverseDigit(SinglyLinkedListNode<Integer> head) {
        int sum = 0;
        int multiplier = 1;
        SinglyLinkedListNode<Integer> currentNode = head;

        while(currentNode != null) {
            int num = currentNode.getData();
            sum += (num * multiplier);
            multiplier *= 10;
            currentNode = currentNode.getNext();
        }

        return sum;
    }
}
