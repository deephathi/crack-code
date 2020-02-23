package com.deephathi.crack.code.ch2_linkedlists.ex2_3;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class DeleteNodeLinkedList<T> {

	public boolean deleteNode(SinglyLinkedListNode<T> incomingNode) {
		
		boolean isNodeDeleted = true;
		
		if (incomingNode == null || incomingNode.getNext() == null) {
			isNodeDeleted = false;
		}
		
		incomingNode.setData(incomingNode.getNext().getData());
		incomingNode.setNext(incomingNode.getNext().getNext());
		
		return isNodeDeleted;
	}

}
