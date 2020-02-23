package com.deephathi.crack.code.ch2_linkedlists;

import java.util.StringJoiner;

public class SinglyLinkedListNode<T> {

	private T data;
	
	private SinglyLinkedListNode<T> next;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public SinglyLinkedListNode<T> getNext() {
		return next;
	}
	public void setNext(SinglyLinkedListNode<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(" > ");
		SinglyLinkedListNode<T> currentNode = this;
		while (currentNode != null) {
			joiner.add(currentNode.getData().toString());
			currentNode = currentNode.getNext();
		}
		return joiner.toString();
	}
	
	
}
