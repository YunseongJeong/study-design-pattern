package com.designpatterns.java.behavioral.iterator_pattern;

import java.util.ArrayList;

public class SnapshotArrayIterator<E> implements Iterator<E>{
    private long snapshotTimestamp;
    private int cursorInAll;
    private int leftCount;
    private SnapshotArrayListBasedOnTimestamp<E> arrayList;

    public SnapshotArrayIterator(SnapshotArrayListBasedOnTimestamp<E> arrayList) {
        this.snapshotTimestamp = System.currentTimeMillis();
        this.cursorInAll = 0;
        this.leftCount = arrayList.actualSize();
        this.arrayList = arrayList;
        justNext();
    }

    @Override
    public boolean hasNext() {
        return this.leftCount >= 0;
    }

    @Override
    public E next() {
        E currentItem = arrayList.get(cursorInAll);
        justNext();
        return currentItem;
    }

    private void justNext(){ // snapshot timestamp에 맞는 요소를 가리킬 때까지 cursor를 옮긴다.
        while (cursorInAll < arrayList.totalSize()){
            long addTimestamp = arrayList.getAddTimestamp(cursorInAll);
            long delTimestamp = arrayList.getdelTimestamp(cursorInAll);
            if (snapshotTimestamp > addTimestamp && snapshotTimestamp < delTimestamp) {
                leftCount--;
                break;
            }
            cursorInAll++;
        }
    }
}
