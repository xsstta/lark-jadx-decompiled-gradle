package com.larksuite.component.metriclogger;

import java.util.LinkedList;

public class FixSizeLinkedList<T> extends LinkedList<T> {
    private static final long serialVersionUID = 6180260678661012457L;
    private int mCapacity;

    public FixSizeLinkedList(int i) {
        this.mCapacity = i <= 0 ? Integer.MAX_VALUE : i;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.Queue, java.util.LinkedList, java.util.Deque
    public boolean add(T t) {
        if (size() + 1 > this.mCapacity) {
            super.removeFirst();
        }
        return super.add(t);
    }
}
