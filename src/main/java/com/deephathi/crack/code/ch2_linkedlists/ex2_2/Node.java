package com.deephathi.crack.code.ch2_linkedlists.ex2_2;

public class Node<U> {
    private U data;
    private Node<U> next;

    public Node(U incomingData) {
        this.data = incomingData;
    }

    public U getData() {
        return data;
    }

    public void setData(U data) {
        this.data = data;
    }

    public Node<U> getNext() {
        return next;
    }

    public void setNext(Node<U> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}