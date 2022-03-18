package com.bytedance.platform.godzilla.anr.sp;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueProxy<E> extends ConcurrentLinkedQueue<E> {
    public ConcurrentLinkedQueue<Runnable> workFinishers;

    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Queue, java.util.concurrent.ConcurrentLinkedQueue
    public E poll() {
        return null;
    }

    public ConcurrentLinkedQueueProxy(ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue) {
        this.workFinishers = concurrentLinkedQueue;
    }

    public boolean remove(Object obj) {
        return this.workFinishers.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.AbstractQueue, java.util.Queue, java.util.concurrent.ConcurrentLinkedQueue
    public boolean add(E e) {
        return this.workFinishers.add(e);
    }
}
