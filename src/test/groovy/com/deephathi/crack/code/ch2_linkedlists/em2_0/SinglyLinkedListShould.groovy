package com.deephathi.crack.code.ch2_linkedlists.em2_0

import spock.lang.Specification

class SinglyLinkedListShould extends Specification {

    def "create linked list successfully"() {
        // 5 > 1 > 3 > 2
        setup:
            SinglyLinkedList.Node<Integer> head = new SinglyLinkedList.Node<Integer>(5);

            SinglyLinkedList.Node<Integer> second = new SinglyLinkedList.Node<Integer>(1);
            head.next = second

            SinglyLinkedList.Node<Integer> third = new SinglyLinkedList.Node<Integer>(3);
            second.next = third

            SinglyLinkedList.Node<Integer> fourth = new SinglyLinkedList.Node<Integer>(2);
            third.next = fourth
        when:
            SinglyLinkedList<Integer> list = new SinglyLinkedList<>(head);
            System.out.println(list)
        then:
            list
    }

    def "be able to add in between of the list"() {
        // 5 > 1 > 3 > 2
        // 5 > 1 > 3 > 4 > 2
        setup:
            def head = new SinglyLinkedList.Node<Integer>(5)

            def second = new SinglyLinkedList.Node<Integer>(1)
            head.next = second

            def third = new SinglyLinkedList.Node<Integer>(3)
            second.next = third

            def fourth = new SinglyLinkedList.Node<Integer>(2)
            third.next = fourth

        when:
            def list = new SinglyLinkedList<Integer>(head)

            def newNode = new SinglyLinkedList.Node<Integer>(4)
            def beforeNode = third

            list.addAfterInList(newNode, beforeNode)

            System.out.println(list)

        then:
            "5 > 1 > 3 > 4 > 2" == list.toString()
    }

    def "be able to insert an element before a node"() {
        // 5 1 3 2
        // 5 1 3 4 2
        setup:
            def first = new SinglyLinkedList.Node<Integer>(5)
            def list = new SinglyLinkedList<Integer>(first)

            def second = new SinglyLinkedList.Node<Integer>(1)
            first.next = second

            def third = new SinglyLinkedList.Node<Integer>(3)
            second.next = third

            def fourth = new SinglyLinkedList.Node<Integer>(2)
            third.next = fourth

        when:
            def betweenNode = new SinglyLinkedList.Node<Integer>(4)
            list.addBeforeInList(betweenNode, fourth)

        then:
            "5 > 1 > 3 > 4 > 2" == list.toString()
    }

    def "be able to append an element in the list"() {
        setup:
            def first = new SinglyLinkedList.Node<Integer>(5);

            def sec = new SinglyLinkedList.Node<Integer>(1);
            first.next = sec;

            def third = new SinglyLinkedList.Node<Integer>(3);
            sec.next = third

            def fourth = new SinglyLinkedList.Node<Integer>(2)
            third.next = fourth;

            def list = new SinglyLinkedList<Integer>(first);

        when:
            def fifth = new SinglyLinkedList.Node<Integer>(4)
            list.appendToList(fifth)

        then:
            "5 > 1 > 3 > 2 > 4" == list.toString()
    }

    def "be able to create a new head"() {
        setup:
            def first = new SinglyLinkedList.Node<Integer>(5);

            def second = new SinglyLinkedList.Node<Integer>(1);
            first.next = second

            def third = new SinglyLinkedList.Node<Integer>(3);
            second.next = third

            def fourth = new SinglyLinkedList.Node<Integer>(2)
            third.next = fourth

            def beforeFirst = new SinglyLinkedList.Node<Integer>(4);

            def list = new SinglyLinkedList<Integer>(first)

        when:
            list.makeNodeHead(beforeFirst)

        then:
            "4 > 5 > 1 > 3 > 2"  == list.toString()
    }
}
