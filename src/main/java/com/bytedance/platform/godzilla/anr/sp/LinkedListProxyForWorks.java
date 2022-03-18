package com.bytedance.platform.godzilla.anr.sp;

import android.os.Looper;
import java.util.LinkedList;

public class LinkedListProxyForWorks<E> extends LinkedList<E> {
    private static final Object LOCK = new Object();
    private LinkedList<Runnable> mRealList;

    public void clear() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C20304a.m74059b();
            return;
        }
        synchronized (LOCK) {
            this.mRealList.clear();
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        LinkedList linkedList;
        super.clone();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return new LinkedList();
        }
        synchronized (LOCK) {
            linkedList = new LinkedList(this.mRealList);
        }
        return linkedList;
    }

    public LinkedListProxyForWorks(LinkedList<Runnable> linkedList) {
        this.mRealList = linkedList;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.Queue, java.util.LinkedList, java.util.Deque
    public boolean add(E e) {
        boolean add;
        synchronized (LOCK) {
            add = this.mRealList.add(e);
        }
        return add;
    }
}
