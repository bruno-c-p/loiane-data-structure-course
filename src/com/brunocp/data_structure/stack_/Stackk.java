package com.brunocp.data_structure.stack_;

public class Stackk<T> extends StaticStructure<T> {

    public Stackk() {
        super();
    }

    public Stackk(int capacity) {
        super(capacity);
    }

    public void stackUp(T element) {
        super.addElement(element);
    }

    public T top() {

        if (this.isEmpty()) {
            return null;
        }

        return this.elements[size - 1];
    }
    
    public T unstack() {

        if (this.isEmpty()) {
            return null;
        }

//        T element = this.elements[size - 1];
//        size--;

        return this.elements[--size];
    }
}
