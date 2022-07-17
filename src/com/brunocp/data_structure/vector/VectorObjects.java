package com.brunocp.data_structure.vector;

public class VectorObjects {

    private Object[] elements;
    private int vectorSize;

    public VectorObjects(int capacity) {
        this.elements = new Object[capacity];
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

    public boolean addElement(Object element) {

        if (this.vectorSize < this.elements.length) {

            this.elements[this.vectorSize] = element;
            this.vectorSize++;
            return true;

        }

        return false;
    }

    public boolean addElement(int position, Object element) {

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

    public Object search(int position) {

        increaseCapacity();

        if (!(position >= 0 && position <= vectorSize)) {

            throw new IllegalArgumentException("Invalid position");
        }

        return this.elements[position];
    }

    public int search(Object element) {

        for (int i = 0; i < this.vectorSize; i++) {

            if (this.elements[i].equals(element)) {

                return i;
            }
        }

        return -1;
    }

    private void increaseCapacity() {

        if (this.vectorSize == this.elements.length) {

            Object[] newElements = new Object[this.elements.length * 2];

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