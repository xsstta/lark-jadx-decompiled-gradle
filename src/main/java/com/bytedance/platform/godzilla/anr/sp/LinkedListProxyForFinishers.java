package com.bytedance.platform.godzilla.anr.sp;

import java.util.LinkedList;

public class LinkedListProxyForFinishers<E> extends LinkedList<E> {
    private LinkedList<Runnable> mRealList;

    @Override // java.util.Queue, java.util.LinkedList, java.util.Deque
    public E poll() {
        return null;
    }

    public LinkedListProxyForFinishers(LinkedList<Runnable> linkedList) {
        this.mRealList = linkedList;
    }

    @Override // java.util.List, java.util.LinkedList
    public boolean remove(Object obj) {
        return this.mRealList.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.Queue, java.util.LinkedList, java.util.Deque
    public boolean add(E e) {
        return this.mRealList.add(e);
    }
}
