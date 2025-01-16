package com.designpatterns.java.behavioral.iterator_pattern;

import java.util.*;
import java.util.Iterator;

public abstract class SnapshotArrayListBasedOnTimestamp<E> implements List<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private int actualSize;
    private int totalSize;
    private Object[] elements;
    private long[] addTimestamps;
    private long[] delTimestamps;

    public SnapshotArrayListBasedOnTimestamp(){
        this.elements = new Object[DEFAULT_CAPACITY];
        this.addTimestamps = new long[DEFAULT_CAPACITY];
        this.delTimestamps = new long[DEFAULT_CAPACITY];
        this.totalSize = 0;
        this.actualSize = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean add(E e) {
        elements[totalSize] = e;
        addTimestamps[totalSize] = System.currentTimeMillis(); // add의 timestamp
        delTimestamps[totalSize] = Long.MAX_VALUE;
        totalSize++;
        actualSize++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < totalSize; ++i){
            if (elements[i].equals(o)){
                delTimestamps[i] = System.currentTimeMillis(); // 삭제 timestamp 지정
                actualSize--;
                return true;
            }
        }
        return false;
    }

    public int actualSize() {
        return actualSize;
    }

    public int totalSize() {
        return totalSize;
    }

    public long getAddTimestamp(int index){
        return addTimestamps[index];
    }

    public long getdelTimestamp(int index){
        return delTimestamps[index];
    }
    //..
}

