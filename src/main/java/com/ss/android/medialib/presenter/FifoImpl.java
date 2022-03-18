package com.ss.android.medialib.presenter;

import java.util.LinkedList;

public class FifoImpl<T> extends LinkedList<T> {
    private int mMaxSize = 10;
    private final Object synObj = new Object();

    public int getMaxSize() {
        return this.mMaxSize;
    }

    public T pollSafe() {
        T t;
        synchronized (this.synObj) {
            t = (T) poll();
        }
        return t;
    }

    public FifoImpl(int i) {
        this.mMaxSize = i;
    }

    public T addLastSafe(T t) {
        T t2;
        synchronized (this.synObj) {
            t2 = null;
            while (size() >= this.mMaxSize) {
                t2 = (T) poll();
            }
            addLast(t);
        }
        return t2;
    }
}
