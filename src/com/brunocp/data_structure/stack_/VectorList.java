package com.brunocp.data_structure.stack_;

public class VectorList<T> extends StaticStructure<T> {

    public VectorList() {
        super();
    }

    public VectorList(int capacity) {
        super(capacity);
    }

    protected boolean addElement(T element) {
        return super.addElement(element);
    }

    protected boolean addElement(int position, T element) {
        return super.addElement(position, element);
    }
}
