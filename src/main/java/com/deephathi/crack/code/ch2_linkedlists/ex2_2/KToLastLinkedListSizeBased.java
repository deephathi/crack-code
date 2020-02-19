package com.deephathi.crack.code.ch2_linkedlists.ex2_2;

public class KToLastLinkedListSizeBased<T> implements KToLastLinkedList<T> {

    private Node<T> head;

    public KToLastLinkedListSizeBased(Node<T> incomingHead) {
        this.head = incomingHead;
    }

    private static class SumNode {
        public static int sum;
    }

    private Node<T> getKtoLastSumNode(Node<T> currentNode, int kthNum) {
        if (currentNode == null) {
            return null;
        } else {
            Node<T> returnedNode = getKtoLastSumNode(currentNode.getNext(), kthNum);
            SumNode.sum++;
            if (SumNode.sum == kthNum) {
                return currentNode;
            }
            return returnedNode;
        }
    }



    @Override
    public Node<T> getKToLastNode(int kthNo) {

        Node<T> currentNode = this.head;
        int length = 0;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }

        int nodeNo = length - kthNo;
        if (nodeNo < 0) {
            throw new IllegalArgumentException("kth No is more than length of linked list");
        }
        int nodeCount  = 0;
        currentNode = this.head;

        while (currentNode != null) {
            if (nodeCount == nodeNo) {
                return currentNode;
            }
            nodeCount++;
            currentNode = currentNode.getNext();
        }
        throw new RuntimeException("something went wrong");
    }
}
