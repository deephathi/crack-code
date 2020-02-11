package com.deephathi.crack.code.ch2_linkedlists.em2_0;

public class LinkedListRearrangerNode<T> {

    private T data;
    private LinkedListRearrangerNode<T> next;

    public LinkedListRearrangerNode(T dataParam) {
        data = dataParam;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListRearrangerNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListRearrangerNode<T> next) {
        this.next = next;
    }

    public LinkedListRearrangerNode<T> rearrangeNodes() {
        LinkedListRearrangerNode<T> slow = this;
        LinkedListRearrangerNode<T> fast = this.getNext();
        while(fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        fast = this;
        slow = slow.getNext();

        while(slow != null && fast != null && fast.getNext() != null) {
            LinkedListRearrangerNode<T> temp = fast.getNext();
            fast.setNext(slow);
            slow = slow.getNext();

            if (slow != null) {
                fast.getNext().setNext(temp);
                fast = fast.getNext().getNext();
            }

        }

        return this;
    }

    public String getFullChain() {
        LinkedListRearrangerNode<T> currentNode = this;

        StringBuilder listBuilder = new StringBuilder(currentNode.getData().toString());
        currentNode = currentNode.getNext();
        while (currentNode != null) {
            listBuilder.append(" > ").append(currentNode.getData());
            currentNode = currentNode.getNext();
        }

        return listBuilder.toString();
    }

    @Override
    public String toString() {
        return String.valueOf(this.getData());
    }


}
