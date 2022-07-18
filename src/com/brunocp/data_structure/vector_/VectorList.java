package com.brunocp.data_structure.vector_;

import java.lang.reflect.Array;

public class VectorList<T> {

    private T[] elements;
    private int vectorSize;

    public VectorList(int capacity) {
        this.elements = (T[]) new Object[capacity]; //effective java solution
        this.vectorSize = 0;
    }

    public VectorList() {
        this(10);
    }

    public VectorList(int capacity, Class<T> classType) {
        this.elements = (T[]) Array.newInstance(classType, capacity);
        this.vectorSize = 0;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < this.vectorSize - 1; i++) {

            sb.append(this.elements[i]);
            sb.append(", ");
        }

        if (this.vectorSize > 0) {

            sb.append(this.elements[this.vectorSize - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    public boolean addElement(T element) {

        if (this.vectorSize < this.elements.length) {

            this.elements[this.vectorSize] = element;
            this.vectorSize++;
            return true;

        }

        return false;
    }

    public boolean addElement(int position, T element) {

        if (!(position >= 0 && position <= vectorSize)) {

            throw new IllegalArgumentException("Invalid position");
        }

        increaseCapacity();

        //Moving all elements
        for (int i = this.vectorSize; i >= position; i--) {

            this.elements[i + 1] = this.elements[i];
        }

        this.elements[position] = element;
        this.vectorSize++;

        return true;
    }

    public void removeElement(int position) {

        if (!(position >= 0 && position <= vectorSize)) {

            throw new IllegalArgumentException("Invalid position");
        }

        for (int i = position; i < this.vectorSize - 1; i++) {

            this.elements[i] = this.elements[i + 1];
        }

        this.vectorSize--;
    }

    public void removeElement(T element) {

        int position = search(element);

        if (position > - 1) {

            this.removeElement(position);
        }
    }

    public T get(int position) {

        return this.search(position);
    }

    public T search(int position) {

        increaseCapacity();

        if (!(position >= 0 && position <= vectorSize)) {

            throw new IllegalArgumentException("Invalid position");
        }

        return this.elements[position];
    }

    public int search(T element) {

        for (int i = 0; i < this.vectorSize; i++) {

            if (this.elements[i].equals(element)) {

                return i;
            }
        }

        return -1;
    }

    public boolean contains(T element) {

            return this.search(element) > -1;
    }

    public int lastIndexOf(T element) {

        for (int i = this.vectorSize - 1; i >= 0; i--) {

            if (this.elements[i].equals(element)) {

                return i;
            }
        }

        return -1;
    }

    public void clear() {

        //option 1
        this.elements = (T[]) new Object[this.elements.length];

        //option 2
        //this.vectorSize = 0;

        //option 3
        //for (int i = 0; i < this.vectorSize; i++) {
        //    this.elements[i] = null;
        //}
        //this.vectorSize = 0;
    }

    private void increaseCapacity() {

        if (this.vectorSize == this.elements.length) {

            T[] newElements = (T[]) new Object[this.elements.length * 2];

            for (int i = 0; i < this.elements.length; i++) {

                newElements[i] = this.elements[i];
            }

            this.elements = newElements;
        }
    }

    public int getVectorSize() {
        return vectorSize;
    }

    public Object[] getElements() {
        return elements;
    }
}
