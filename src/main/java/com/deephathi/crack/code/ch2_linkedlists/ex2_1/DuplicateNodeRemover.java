package com.deephathi.crack.code.ch2_linkedlists.ex2_1;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from Unsorted linked list. How would you solve the problem
 * if temporary buffer is not allowed.
 *
 */
public class DuplicateNodeRemover<T> {

    private Node<T> head;

    public DuplicateNodeRemover(Node<T> incomingHead) {
        this.head = incomingHead;
    }

    public Node<T> removeDuplicateNodes() {

        Set<T> seenData = new HashSet<>();

        Node<T> currentNode = this.head;
        Node<T> finalNode = null;

        while(currentNode != null) {
            if (!seenData.contains(currentNode.getData())) {
                seenData.add(currentNode.getData());
                if (finalNode == null) {
                    finalNode = currentNode;
                } else {
                    finalNode.setNext(currentNode);
                    finalNode = finalNode.getNext();
                }
            }
            currentNode = currentNode.getNext();
        }

        finalNode.setNext(null);

        return head;
    }

    public Node<T> removeDupsBookish() {

        Set<T> seenData = new HashSet<>();
        Node<T> currentNode = this.head;
        Node<T> prev = null;

        while(currentNode != null) {
            if (seenData.contains(currentNode.getData())) {
                prev.setNext(currentNode.getNext());
            } else {
                seenData.add(currentNode.getData());
                prev = currentNode;
            }

            currentNode = currentNode.getNext();

        }

        return head;

    }

    public Node<T> removeDubsWithoutBuffer() {

        Node<T> currentNode = this.head;
        Node<T> prevNode = null;
        while (currentNode != null) {
            if (isCurrentNodeDuplicate(currentNode)) {
                prevNode.setNext(currentNode.getNext());
            } else {
                prevNode = currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return this.head;
    }

    private boolean isCurrentNodeDuplicate(Node<T> targetNode) {
        boolean isCurrentNodeDuplicate = false;
        Node<T> checkerNode = this.head;
        while(checkerNode != targetNode) {
            if (checkerNode.getData().equals(targetNode.getData())) {
                isCurrentNodeDuplicate = true;
                break;
            }
            checkerNode = checkerNode.getNext();
        }

        return isCurrentNodeDuplicate;
    }


    @Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder(head.getData().toString());
        Node<T> currentNode = head.getNext();
        while(currentNode != null) {
            listBuilder.append(" > ").append(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        return listBuilder.toString();
    }

    public static class Node<U> {
        private U data;
        private Node<U> next;

        public Node(U incomingData) {
            this.data = incomingData;
        }

        @Override
        public String toString() {
            return data.toString();
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
    }
}
