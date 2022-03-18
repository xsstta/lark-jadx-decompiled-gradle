package io.reactivex.internal.queue;

import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.util.C68986j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements AbstractC68372i<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex = new AtomicLong();
    final int lookAheadStep;
    final int mask = (length() - 1);
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;

    /* access modifiers changed from: package-private */
    public int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        if (this.producerIndex.get() == this.consumerIndex.get()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68372i, io.reactivex.internal.p3460b.AbstractC68373j
    public E poll() {
        long j = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j + 1);
        soElement(calcElementOffset, null);
        return lvElement;
    }

    /* access modifiers changed from: package-private */
    public int calcElementOffset(long j) {
        return this.mask & ((int) j);
    }

    /* access modifiers changed from: package-private */
    public E lvElement(int i) {
        return get(i);
    }

    /* access modifiers changed from: package-private */
    public void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    /* access modifiers changed from: package-private */
    public void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    public SpscArrayQueue(int i) {
        super(C68986j.m265580a(i));
        this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        int i = this.mask;
        long j = this.producerIndex.get();
        int calcElementOffset = calcElementOffset(j, i);
        if (j >= this.producerLookAhead) {
            long j2 = ((long) this.lookAheadStep) + j;
            if (lvElement(calcElementOffset(j2, i)) == null) {
                this.producerLookAhead = j2;
            } else if (lvElement(calcElementOffset) != null) {
                return false;
            }
        }
        soElement(calcElementOffset, e);
        soProducerIndex(j + 1);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void soElement(int i, E e) {
        lazySet(i, e);
    }

    public boolean offer(E e, E e2) {
        if (!offer(e) || !offer(e2)) {
            return false;
        }
        return true;
    }
}
