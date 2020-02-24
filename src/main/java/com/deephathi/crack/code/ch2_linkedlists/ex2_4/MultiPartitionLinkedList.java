package com.deephathi.crack.code.ch2_linkedlists.ex2_4;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;


public class MultiPartitionLinkedList<T extends Comparable<T>> implements PartitionLinkedList<T> {
    @Override
    public SinglyLinkedListNode<T> partitionAt(SinglyLinkedListNode<T> head, T partitionAt) {
        SinglyLinkedListNode<T> beforeHead = null, beforeTail = null, afterHead = null, afterTail = null;
        SinglyLinkedListNode<T> currentNode = head;

        SinglyLinkedListNode<T> resultHeadNode = null;

        while (currentNode != null) {
            SinglyLinkedListNode<T> nextNode = currentNode.getNext();
            currentNode.setNext(null);
            if (currentNode.getData().compareTo(partitionAt) < 0) {
                if (beforeHead == null) {
                    beforeHead = beforeTail = currentNode;
                } else {
                    beforeTail.setNext(currentNode);
                    beforeTail = currentNode;
                }
            } else {
                if (afterHead == null) {
                    afterHead = afterTail = currentNode;
                } else {
                    afterTail.setNext(currentNode);
                    afterTail = currentNode;
                }
            }
            currentNode = nextNode;
        }

        if (beforeHead == null) {
            resultHeadNode = afterHead;
        } else {
            beforeTail.setNext(afterHead);
            resultHeadNode = beforeHead;
        }
        return resultHeadNode;
    }
}
