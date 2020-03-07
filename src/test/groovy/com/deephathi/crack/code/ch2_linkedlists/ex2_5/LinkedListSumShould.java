package com.deephathi.crack.code.ch2_linkedlists.ex2_5;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;
import org.junit.Assert;
import org.junit.Test;


public class LinkedListSumShould {

    @Test
    public void doReverseSumCorrectly() {
        // setup
        SinglyLinkedListNode<Integer> firstFirst = new SinglyLinkedListNode<>(7);

        SinglyLinkedListNode<Integer> firstSecond = new SinglyLinkedListNode<>(1);
        firstFirst.setNext(firstSecond);

        SinglyLinkedListNode<Integer> firstThird = new SinglyLinkedListNode<>(6);
        firstSecond.setNext(firstThird);

        SinglyLinkedListNode<Integer> secondFirst = new SinglyLinkedListNode<>(5);

        SinglyLinkedListNode<Integer> secondSecond = new SinglyLinkedListNode<>(9);
        secondFirst.setNext(secondSecond);

        SinglyLinkedListNode<Integer> secondThird = new SinglyLinkedListNode<>(2);
        secondSecond.setNext(secondThird);

        LinkedListSum sum = new LinkedListSum();
        // when
        SinglyLinkedListNode<Integer> sumFirst = sum.reverseSum(firstFirst, secondFirst);

        // then
        Assert.assertEquals("2 > 1 > 9", sumFirst.toString());
    }
}
