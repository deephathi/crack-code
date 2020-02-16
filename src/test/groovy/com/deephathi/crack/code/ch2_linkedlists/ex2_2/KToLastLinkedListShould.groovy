package com.deephathi.crack.code.ch2_linkedlists.ex2_2

import spock.lang.Specification

class KToLastLinkedListShould extends Specification {

    def "return k to last node from the linked list"() {
        setup:
            KToLastLinkedList.Node<Integer> firstNode = new KToLastLinkedList.Node(1);
            KToLastLinkedList<Integer> list = new KToLastLinkedList<>(firstNode);

            KToLastLinkedList.Node<Integer> secondNode = new KToLastLinkedList.Node(2);
            firstNode.setNext(secondNode);

            KToLastLinkedList.Node<Integer> thirdNode = new KToLastLinkedList.Node(3);
            secondNode.setNext(thirdNode);

            KToLastLinkedList.Node<Integer> fourthNode = new KToLastLinkedList.Node(4);
            thirdNode.setNext(fourthNode);

            KToLastLinkedList.Node<Integer> fifthNode = new KToLastLinkedList.Node(5);
            fourthNode.setNext(fifthNode);

        when:
            KToLastLinkedList.Node<Integer> kthNode = list.getKtoLastNodeRecursively(4);

        then:
            "2" == kthNode.toString();

    }
}
