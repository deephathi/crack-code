package com.deephathi.crack.code.ch2_linkedlists.ex2_4;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;
import org.junit.Test;

public class PartitionLinkedListShould {

	@Test
	public void partitionsList() {
		SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(3);
		
		SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(5);
		node1.setNext(node2);
		
		SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(8);
		node2.setNext(node3);
		
		SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(5);
		node3.setNext(node4);
		
		SinglyLinkedListNode<Integer> node5 = new SinglyLinkedListNode<>(10);
		node4.setNext(node5);
		
		SinglyLinkedListNode<Integer> node6 = new SinglyLinkedListNode<>(2);
		node5.setNext(node6);
		
		SinglyLinkedListNode<Integer> node7 = new SinglyLinkedListNode<>(1);
		node6.setNext(node7);
		
		PartitionLinkedList<Integer> partitionList = new PartitionLinkedList<>();
		partitionList.partitionAt(node1, 5);
		
		
	}
}
