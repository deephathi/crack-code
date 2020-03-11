package com.deephathi.crack.code.ch2_linkedlists.ex2_5;

import com.deephathi.crack.code.ch2_linkedlists.SinglyLinkedListNode;

public class NodeByNodeLinkedListSum implements LinkedListSum {

    // check for 1234 + 234 = 4168
    @Override
    public SinglyLinkedListNode<Integer> reverseSum(SinglyLinkedListNode<Integer> firstHead, SinglyLinkedListNode<Integer> secondHead) {

        SinglyLinkedListNode<Integer> currentNodeFirst = firstHead;
        SinglyLinkedListNode<Integer> currentNodeSecond = secondHead;

        SinglyLinkedListNode<Integer> fakeNode = new SinglyLinkedListNode<>(-1);
        SinglyLinkedListNode<Integer> currentNode = fakeNode;

        int carryForward = 0;

        while (currentNodeFirst != null || currentNodeSecond != null || carryForward > 0) {

            int firstDigit = 0;
            int secondDigit = 0;
            int sumDigit = 0;

            if (currentNodeFirst != null) {
                firstDigit = currentNodeFirst.getData();
            }

            if (currentNodeSecond != null) {
                secondDigit = currentNodeSecond.getData();
            }

            sumDigit = firstDigit + secondDigit + carryForward;
            if (sumDigit >= 10) {
                sumDigit -= 10;
                carryForward = 1;
            } else {
                carryForward = 0;
            }

            SinglyLinkedListNode<Integer> digitNode = new SinglyLinkedListNode<>(sumDigit);
            currentNode.setNext(digitNode);
            currentNode = currentNode.getNext();

            if (currentNodeFirst != null) {
                currentNodeFirst = currentNodeFirst.getNext();
            }
            if (currentNodeSecond != null) {
                currentNodeSecond = currentNodeSecond.getNext();
            }

        }

        return fakeNode.getNext();
    }

    @Override
    public SinglyLinkedListNode<Integer> forwardSum(SinglyLinkedListNode<Integer> firstFirst, SinglyLinkedListNode<Integer> secondFirst) {

        int len1 = getLen(firstFirst);
        int len2 = getLen(secondFirst);

        SinglyLinkedListNode<Integer> updatedFirstFirst = firstFirst;
        SinglyLinkedListNode<Integer> updatedSecondFirst = secondFirst;

        int ans = len1 - len2;
        if (ans != 0) {
            if (ans > 0) {
                updatedSecondFirst = padAdditionalZeros(secondFirst, ans);
            } else {
                updatedFirstFirst =padAdditionalZeros(firstFirst, ans);
            }
        }

        SinglyLinkedListNode<Integer> forwardSumNode = forwardSumInternal(updatedFirstFirst, updatedSecondFirst);

        while (forwardSumNode != null) {
            if (forwardSumNode.getData() == 0) {
                forwardSumNode = forwardSumNode.getNext();
            } else {
                break;
            }
        }

        return forwardSumNode;
    }

    private SinglyLinkedListNode<Integer> forwardSumInternal(SinglyLinkedListNode<Integer> updatedFirstFirst, SinglyLinkedListNode<Integer> updatedSecondFirst) {

        if (updatedFirstFirst == null) {
            return new SinglyLinkedListNode<>(0);
        }

        SinglyLinkedListNode<Integer> carryForwardNode = forwardSumInternal(updatedFirstFirst.getNext(), updatedSecondFirst.getNext());

        int firstDigit = updatedFirstFirst.getData();
        int secondDigit = updatedSecondFirst.getData();
        int carryForward = carryForwardNode.getData();

        int ans = firstDigit + secondDigit + carryForward;

        if (ans >= 10) {
            ans -= 10;
            carryForward = 1;
        } else {
            carryForward = 0;
        }

        SinglyLinkedListNode<Integer> answerNode = new SinglyLinkedListNode<>(ans);

        SinglyLinkedListNode<Integer> tailNode = carryForwardNode.getNext();
        answerNode.setNext(tailNode);

        SinglyLinkedListNode<Integer> returningCarryForwardNode = new SinglyLinkedListNode<>(carryForward);
        returningCarryForwardNode.setNext(answerNode);


        return returningCarryForwardNode;

    }

    private SinglyLinkedListNode<Integer> padAdditionalZeros(SinglyLinkedListNode<Integer> first, int ans) {
        int zeroNum = Math.abs(ans);
        SinglyLinkedListNode<Integer> zeroTail = getZeroNodes(zeroNum);
        zeroTail.setNext(first);
        return zeroTail;
    }

    private SinglyLinkedListNode<Integer> getZeroNodes(int zeroNum) {
        SinglyLinkedListNode<Integer> zeroNodeTail = new SinglyLinkedListNode<>(-1);
        for (;zeroNum > 0; zeroNum--) {
            SinglyLinkedListNode<Integer> zeroNode = new SinglyLinkedListNode<>(0);
            zeroNodeTail.setNext(zeroNode);
            if (zeroNodeTail.getNext() != null) {
                zeroNodeTail = zeroNodeTail.getNext();
            }

        }
        return zeroNodeTail;
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
