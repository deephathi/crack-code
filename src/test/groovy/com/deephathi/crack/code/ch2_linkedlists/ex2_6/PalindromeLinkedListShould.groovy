package com.deephathi.crack.code.ch2_linkedlists.ex2_6

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode
import spock.lang.Specification

class PalindromeLinkedListShould extends Specification {


    void testPalindromeLinkedListCorrectly() {
        setup:
            SinglyLinkedListNode<Character> firstFirst = new SinglyLinkedListNode<>('a');

            SinglyLinkedListNode<Character> firstSecond = new SinglyLinkedListNode<>('b');
            firstFirst.setNext(firstSecond);

            SinglyLinkedListNode<Character> firstThird = new SinglyLinkedListNode<>('c');
            firstSecond.setNext(firstThird);

            SinglyLinkedListNode<Character> firstFourth = new SinglyLinkedListNode<>('b');
            firstThird.setNext(firstFourth);

            SinglyLinkedListNode<Character> firstFifth = new SinglyLinkedListNode<>('a');
            firstFourth.setNext(firstFifth);

            SinglyLinkedListNode<Integer> secondFirst = new SinglyLinkedListNode<>(1);

            SinglyLinkedListNode<Integer> secondSecond = new SinglyLinkedListNode<>(2);
            secondFirst.setNext(secondSecond);

            SinglyLinkedListNode<Integer> secondThird = new SinglyLinkedListNode<>(3);
            secondSecond.setNext(secondThird);

            SinglyLinkedListNode<Integer> secondFourth = new SinglyLinkedListNode<>(4);
            secondThird.setNext(secondFourth);

            SinglyLinkedListNode<Integer> secondFifth = new SinglyLinkedListNode<>(5);
            secondFourth.setNext(secondFifth);

        when:
            boolean isPalindrome = new EndRecursivePalindrome<>().isPalindrome(firstFirst);
            boolean isNotPalindrome = new EndRecursivePalindrome<>().isPalindrome(secondFirst);
        then:
            isPalindrome
            !isNotPalindrome
    }

}
