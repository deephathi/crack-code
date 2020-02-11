package com.deephathi.crack.code.ch2_linkedlists.em2_0

import spock.lang.Specification

class LinkedListRearrangerNodeShould extends Specification {

    def "be able to rearrange the linked list"() {
        setup:
            def first = new LinkedListRearrangerNode<Integer>(1);

            def second =  new LinkedListRearrangerNode<Integer>(2);
            first.setNext(second);

            def third =  new LinkedListRearrangerNode<Integer>(3);
            second.setNext(third)

            def fourth =  new LinkedListRearrangerNode<Integer>(4);
            third.setNext(fourth)

            def fifth = new LinkedListRearrangerNode<Integer>(10);
            fourth.setNext(fifth)

            def sixth =  new LinkedListRearrangerNode<Integer>(20);
            fifth.setNext(sixth)

            def seventh =  new LinkedListRearrangerNode<Integer>(30);
            sixth.setNext(seventh)

            def eighth = new LinkedListRearrangerNode<Integer>(40);
            seventh.setNext(eighth)

        when:
            LinkedListRearrangerNode<Integer> head = first.rearrangeNodes();
            System.out.println(head)
        then:
            "1 > 10 > 2 > 20 > 3 > 30 > 4 > 40" == head.getFullChain()
    }
}

