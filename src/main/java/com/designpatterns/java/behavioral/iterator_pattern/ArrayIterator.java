package com.designpatterns.java.behavioral.iterator_pattern;

import java.util.ArrayList;

public class ArrayIterator<E> implements Iterator<E>{
    private int cursor;
    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList){
        this.arrayList = arrayList;
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public E next() {
        return arrayList.get(cursor++);
    }
}
