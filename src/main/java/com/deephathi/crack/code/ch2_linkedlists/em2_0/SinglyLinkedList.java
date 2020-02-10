package com.deephathi.crack.code.ch2_linkedlists.em2_0;

public class SinglyLinkedList<T> {

    public Node<T> head;

    public SinglyLinkedList() {}

    public SinglyLinkedList(Node<T> headPart) {
        head = headPart;
    }

    public void addAfterInList(Node<T> newNode, Node<T> prevNode) {
        if (newNode == null || prevNode == null) {
            throw new IllegalArgumentException("new node or previous node cannot be null");
        }

        if (head != null) {
            Node<T> currentNode = head;
            while (currentNode != null) {
                if (currentNode.data.equals(prevNode.data)) {
                    Node<T> temp = currentNode.next;
                    currentNode.next = newNode;
                    newNode.next = temp;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void addBeforeInList(Node<T> newNode, Node<T> nextNode) {
        if (newNode == null || nextNode == null) {
            throw new IllegalArgumentException("new node or next node can not be null");
        }
        if (head != null) {
            Node<T> currentNode = head;
            if (currentNode.data.equals(nextNode.data)) {
                newNode.next = currentNode;
                head = newNode;
            } else {
                while(currentNode != null) {
                    if (currentNode.next != null &&currentNode.next.data.equals(nextNode.data)) {
                        currentNode.next = newNode;
                        newNode.next = nextNode;
                        currentNode = currentNode.next;
                    }
                    currentNode = currentNode.next;
                }
            }
        }
    }

    public void makeNodeHead(Node<T> newNode) {
        if (newNode == null) {
            throw new IllegalArgumentException("incoming node cannot be null");
        }
        newNode.next = head;
        head = newNode;
    }

    public void appendToList(Node<T> newNode) {
        if (newNode == null) {
            throw new IllegalArgumentException("incoming node can not be null");
        }
        if (head != null) {
            Node<T> currentNode = head;
            while(currentNode != null) {
                if (currentNode.next == null) {
                    currentNode.next = newNode;
                    currentNode = currentNode.next;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public static final class Node<U> {
        public Node(U dataPart) {
            if (dataPart == null) {
                throw new IllegalArgumentException("data can not be null");
            }
            data = dataPart;
        }
        public Node<U> next;
        public U data;

        @Override
        public String toString() {
            return "data: " + data.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder linkedList = null;
        if (head != null) {
            linkedList = new StringBuilder();
            Node<T> currentNode = head;
            while (currentNode != null) {
                if (currentNode != head) {
                    linkedList.append(" > ");
                }
                linkedList.append(currentNode.data);
                currentNode = currentNode.next;
            }
        }
        return linkedList != null ? linkedList.toString() : "";
    }
}
