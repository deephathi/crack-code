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

        SinglyLinkedListNode<Integer> firstFourth = new SinglyLinkedListNode<>(9);
        firstThird.setNext(firstFourth);

        SinglyLinkedListNode<Integer> secondFirst = new SinglyLinkedListNode<>(5);

        SinglyLinkedListNode<Integer> secondSecond = new SinglyLinkedListNode<>(9);
        secondFirst.setNext(secondSecond);

        SinglyLinkedListNode<Integer> secondThird = new SinglyLinkedListNode<>(2);
        secondSecond.setNext(secondThird);

        LinkedListSum sum = new NodeByNodeLinkedListSum();
        // when
        SinglyLinkedListNode<Integer> sumFirst = sum.reverseSum(firstFirst, secondFirst);

        // then
        Assert.assertEquals("2 > 1 > 9 > 9", sumFirst.toString());
    }

    @Test
    public void doForwardSumCorrectly() {

        SinglyLinkedListNode<Integer> firstFirst = new SinglyLinkedListNode<>(9);

        SinglyLinkedListNode<Integer> firstSecond = new SinglyLinkedListNode<>(6);
        firstFirst.setNext(firstSecond);

        SinglyLinkedListNode<Integer> firstThird = new SinglyLinkedListNode<>(1);
        firstSecond.setNext(firstThird);

        SinglyLinkedListNode<Integer> firstFourth = new SinglyLinkedListNode<>(7);
        firstThird.setNext(firstFourth);

        SinglyLinkedListNode<Integer> secondFirst = new SinglyLinkedListNode<>(9);

        SinglyLinkedListNode<Integer> secondSecond = new SinglyLinkedListNode<>(2);
        secondFirst.setNext(secondSecond);

        SinglyLinkedListNode<Integer> secondThird = new SinglyLinkedListNode<>(9);
        secondSecond.setNext(secondThird);

        SinglyLinkedListNode<Integer> secondFourth = new SinglyLinkedListNode<>(5);
        secondThird.setNext(secondFourth);

        LinkedListSum sum = new NodeByNodeLinkedListSum();

        SinglyLinkedListNode<Integer> sumFirst = sum.forwardSum(firstFirst, secondFirst);

        Assert.assertEquals("1 > 8 > 9 > 1 > 2", sumFirst.toString());
    }
}
