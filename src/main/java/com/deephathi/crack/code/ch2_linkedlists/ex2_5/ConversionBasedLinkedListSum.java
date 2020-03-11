package com.deephathi.crack.code.ch2_linkedlists.ex2_5;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class ConversionBasedLinkedListSum implements LinkedListSum {

    @Override
    public SinglyLinkedListNode<Integer> reverseSum(SinglyLinkedListNode<Integer> firstHead, SinglyLinkedListNode<Integer> secondHead) {

        int firstNo = getReverseDigit(firstHead);
        int secondNo = getReverseDigit(secondHead);
        int sum = firstNo + secondNo;

        return getReverseHead(sum);

    }

    private SinglyLinkedListNode<Integer> getReverseHead(int sum) {
        int divider = 10;
        int remainingNo = sum;
        SinglyLinkedListNode<Integer> fakeNode = new SinglyLinkedListNode<>(-1);
        SinglyLinkedListNode<Integer> currentNode = fakeNode;
        while (remainingNo > 0) {
            int data = remainingNo % divider;
            remainingNo /= divider;
            SinglyLinkedListNode<Integer> dataNode = new SinglyLinkedListNode<>(data);
            currentNode.setNext(dataNode);
            currentNode = dataNode;
        }
        return fakeNode.getNext();
    }

    private int getReverseDigit(SinglyLinkedListNode<Integer> head) {
        int sum = 0;
        int multiplier = 1;
        SinglyLinkedListNode<Integer> currentNode = head;

        while(currentNode != null) {
            int num = currentNode.getData();
            sum += (num * multiplier);
            multiplier *= 10;
            currentNode = currentNode.getNext();
        }

        return sum;
    }

    @Override
    public SinglyLinkedListNode<Integer> forwardSum(SinglyLinkedListNode<Integer> firstFirst, SinglyLinkedListNode<Integer> secondFirst) {

        int num1 = getForwardDigit(firstFirst);
        int num2 = getForwardDigit(secondFirst);

        int result = num1 + num2;

        return getForwardHead(result);

    }

    private SinglyLinkedListNode<Integer> getForwardHead(int result) {
        SinglyLinkedListNode<Integer> fakeNode = new SinglyLinkedListNode<>(-1);
        SinglyLinkedListNode<Integer> currentNode = fakeNode;
        int len = String.valueOf(result).length();
        int div = (int)Math.pow(10, (len - 1));

        while(div > 0) {
            int data = result / div;
            SinglyLinkedListNode<Integer> dataNode = new SinglyLinkedListNode<>(data);
            currentNode.setNext(dataNode);
            currentNode = dataNode;
            result = result % div;
            div /= 10;
        }

        return fakeNode.getNext();
    }

    private int getForwardDigit(SinglyLinkedListNode<Integer> first) {
        int digit = 0;

        int len = getLen(first);
        SinglyLinkedListNode<Integer> currentNode = first;

        int mul = (int)Math.pow(10, (len - 1));

        while (mul > 0) {
            int data = currentNode.getData();
            digit += (data * mul);
            mul /= 10;
            currentNode = currentNode.getNext();
        }

        return digit;
    }

    private int getLen(SinglyLinkedListNode<Integer> first) {
        int len = 0;
        SinglyLinkedListNode<Integer> currentNode = first;
        while (currentNode != null) {
            len++;
            currentNode = currentNode.getNext();
        }
        return len;
    }
}
