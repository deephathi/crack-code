package com.deephathi.crack.code.ch2_linkedlists.ex2_4;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public interface PartitionLinkedList<T extends Comparable<T>> {
    SinglyLinkedListNode<T> partitionAt(SinglyLinkedListNode<T> head, T partitionAt);
}
