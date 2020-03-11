package com.deephathi.crack.code.ch2_linkedlists.ex2_6;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class StackPalindromeLinkedList<T> implements PalindromeLinkedList<T> {
    @Override
    public boolean isPalindrome(SinglyLinkedListNode<T> head) {
        boolean isPalindrome = false;

        Stack<T> stack = fillStack(head);

        SinglyLinkedListNode<T> currentNode = head;
        while (currentNode != null) {
            T data = currentNode.getData();
            T poppedData = stack.pop();
            if (data.equals(poppedData)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            currentNode = currentNode.getNext();
        }

        return isPalindrome;
    }

    private Stack<T> fillStack(SinglyLinkedListNode<T> head) {
        SinglyLinkedListNode<T> currentNode = head;
        Stack<T> stack = new Stack<>();
        while (currentNode != null) {
            stack.push(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        return stack;
    }

    private static class Stack<U> {

        private static class Node<V> {
            V data;
            private Node<V> next;

            private Node(V data) {
                this.data = data;
            }

            public V getData() {
                return data;
            }

            public void setData(V data) {
                this.data = data;
            }

            public Node<V> getNext() {
                return next;
            }

            public void setNext(Node<V> next) {
                this.next = next;
            }

        }

        private Node<U> head;

        public void push(U data) {
            Node<U> newHead = new Node<>(data);
            newHead.setNext(head);
            head = newHead;
        }

        public U pop() {
            U data = head.getData();
            head = head.getNext();
            return data;
        }

    }
}
