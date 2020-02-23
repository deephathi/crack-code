package com.deephathi.crack.code.ch2_linkedlists.ex2_4;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class PartitionLinkedList<T extends Comparable<T>> {

	public void partitionAt(SinglyLinkedListNode<T> head, T partitionAt) {

		SinglyLinkedListNode<T> finder = head;
		SinglyLinkedListNode<T> switcher = new SinglyLinkedListNode<>(null);
		SinglyLinkedListNode<T> previous = new SinglyLinkedListNode<>(null);
		switcher.setNext(head);
		previous.setNext(head);
		while(switcher != null && switcher.getNext() != null) {
			if (switcher.getNext().getData().compareTo(partitionAt) >= 0) {
				break;
			} else {
				switcher = switcher.getNext();
			}
		}
		while (finder != null) {
			if (finder.getData().compareTo(partitionAt) < 0 && switcher != finder) {
				previous.setNext(previous.getNext().getNext());
				SinglyLinkedListNode<T> temp = switcher.getNext();
				switcher.setNext(finder);
				finder = finder.getNext();
				switcher.getNext().setNext(temp);
				switcher = switcher.getNext();
			} else {
				previous = previous.getNext();
				finder = finder.getNext();
			}
		}
		
	}

}
