package com.deephathi.crack.code.ch2_linkedlists.ex2_2;

public class IterativeKToLastLinkedList<T> implements KToLastLinkedList {

    private Node<T> head;

    public IterativeKToLastLinkedList(Node<T> head) {
        this.head = head;
    }


    @Override
    public Node<T> getKToLastNode(int kthNo) {
        Node<T> forwardPointer = head;
        Node<T> kPointer = null;
        int count= 0;
        while (forwardPointer != null) {
            count++;
            if (kPointer != null) {
                kPointer = kPointer.getNext();
            }
            if (count == kthNo) {
                kPointer = head;
            }
            forwardPointer = forwardPointer.getNext();
        }
        return kPointer;
    }
}
