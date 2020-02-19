package com.deephathi.crack.code.ch2_linkedlists.ex2_2

import spock.lang.Specification

class KToLastLinkedListSizeBasedShould extends Specification {

    def "return k to last node from the linked list"() {
        setup:
            Node<Integer> firstNode = new Node(1);
            KToLastLinkedList<Integer> list = new IterativeKToLastLinkedList<>(firstNode);

            Node<Integer> secondNode = new Node(2);
            firstNode.setNext(secondNode);

            Node<Integer> thirdNode = new Node(3);
            secondNode.setNext(thirdNode);

            Node<Integer> fourthNode = new Node(4);
            thirdNode.setNext(fourthNode);

            Node<Integer> fifthNode = new Node(5);
            fourthNode.setNext(fifthNode);

        when:
            Node<Integer> kthNode = list.getKToLastNode(4);

        then:
            "2" == kthNode.toString();

    }
}
