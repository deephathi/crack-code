package com.deephathi.crack.code.ch2_linkedlists.ex2_1

import spock.lang.Specification

class DuplicateNodeRemoverShould extends Specification {

    def "be able to remove duplicated nodes" () {
        setup:
            def first = new DuplicateNodeRemover.Node<Integer>(2);
            DuplicateNodeRemover<Integer> remover = new DuplicateNodeRemover<>(first);

            def sec = new DuplicateNodeRemover.Node<Integer>(5);
            first.setNext(sec);

            def third = new DuplicateNodeRemover.Node<Integer>(3);
            sec.setNext(third);

            def fourth = new DuplicateNodeRemover.Node<Integer>(5);
            third.setNext(fourth);

            def fifth = new DuplicateNodeRemover.Node<Integer>(2);
            fourth.setNext(fifth);

        when:
            remover.removeDubsWithoutBuffer();

        then:
            "2 > 5 > 3" == remover.toString()
    }
}
