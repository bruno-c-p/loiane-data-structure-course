package com.brunocp.data_structure.stack_;

public class StaticStructure<T> {

    protected T[] elements;
    protected int size;

    public StaticStructure(int capacity) {
        this.elements = (T[]) new Object[capacity]; //effective java solution
        this.size = 0;
    }

    public StaticStructure() {
        this(10);
    }

    public boolean isEmpty() {

        return this.size == 0;
    }

    protected boolean addElement(T element) {

        if (this.size < this.elements.length) {

            this.elements[this.size] = element;
            this.size++;
            return true;

        }

        return false;
    }

    protected boolean addElement(int position, T element) {

        if (!(position >= 0 && position <= size)) {

            throw new IllegalArgumentException("Invalid position");
        }

        increaseCapacity();

        //Moving all elements
        for (int i = this.size; i >= position; i--) {

            this.elements[i + 1] = this.elements[i];
        }

        this.elements[position] = element;
        this.size++;

        return true;
    }

    protected void increaseCapacity() {

        if (this.size == this.elements.length) {

            T[] newElements = (T[]) new Object[this.elements.length * 2];

            for (int i = 0; i < this.elements.length; i++) {

                newElements[i] = this.elements[i];
            }

            this.elements = newElements;
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < this.size - 1; i++) {

            sb.append(this.elements[i]);
            sb.append(", ");
        }

        if (this.size > 0) {

            sb.append(this.elements[this.size - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }
}
