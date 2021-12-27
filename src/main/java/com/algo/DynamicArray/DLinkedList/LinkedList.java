package com.algo.DynamicArray.DLinkedList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public int getFirst() {
        return first.value;
    }

    public int getNextNode() {
        return first.next.value;
    }

    public int getLast() {
        return last.value;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = node;
            last = node;
        }
        last.next = node;
        last = node;
        size++;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int value) {
        int indexCounter = 0;
        Node current = first;
        while (current != null) {
            if (current.value == value)
                return indexCounter;
            current = current.next;
            indexCounter++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;

    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        var current = first;
        while (current.next != last) {
            current = current.next;
        }
        last = current;
        last.next = null;
        size--;

    }

    public int size() {
        return size;
    }

    public int[] asArray() {
        int arrayIndexCounter = 0;
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Node current = first;
        int[] linkedListAsArray = new int[size];
        while (current != null) {
            linkedListAsArray[arrayIndexCounter++] = current.value;
            // arrayIndexCounter++;
            current = current.next;

        }
        return linkedListAsArray;

    }

    public int[] reverseArray() {
        int index = size - 1;
        System.out.println("index:" + index);
        Node current = first;
        int[] reverse = new int[size];
        while (current != null) {
            reverse[index--] = current.value;
            current = current.next;
        }
        return reverse;
    }

    public void reverseLinkedList() {
        var current = first.next;
        var previous = first;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;

    }

    public int getKthNodeOfEnd(int index) {

        return 0;
    }
}
