package com.deephathi.crack.code.ch2_linkedlists.ex2_3;

import org.junit.Assert;
import org.junit.Test;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class DeleteNodeLinkedLIstShould {
	
	@Test
	public void deletesNode() {
				
		SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>();
		node1.setData(1);
		
		
		SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>();
		node2.setData(3);
		node1.setNext(node2);
		
		SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>();
		node3.setData(5);
		node2.setNext(node3);
		
		SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>();
		node4.setData(4);
		node3.setNext(node4);
		
		SinglyLinkedListNode<Integer> node5 = new SinglyLinkedListNode<>();
		node5.setData(2);
		node4.setNext(node5);
		
		DeleteNodeLinkedList<Integer> list = new DeleteNodeLinkedList<>();
		list.deleteNode(node3);
		
		Assert.assertEquals("1 > 3 > 4 > 2", node1.toString());
		
		
	}

}
