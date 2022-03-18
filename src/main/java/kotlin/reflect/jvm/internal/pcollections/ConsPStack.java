package kotlin.reflect.jvm.internal.pcollections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class ConsPStack<E> implements Iterable<E> {
    private static final ConsPStack<Object> EMPTY = new ConsPStack<>();
    final E first;
    final ConsPStack<E> rest;
    public final int size;

    private ConsPStack() {
    }

    public static <E> ConsPStack<E> empty() {
        return (ConsPStack<E>) EMPTY;
    }

    public int size() {
        return this.size;
    }

    /* access modifiers changed from: private */
    public static class Itr<E> implements Iterator<E> {
        private ConsPStack<E> next;

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            if (this.next.size > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            E e = this.next.first;
            this.next = this.next.rest;
            return e;
        }

        public Itr(ConsPStack<E> consPStack) {
            this.next = consPStack;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return iterator(0);
    }

    public ConsPStack<E> plus(E e) {
        return new ConsPStack<>(e, this);
    }

    private Iterator<E> iterator(int i) {
        return new Itr(subList(i));
    }

    public ConsPStack<E> minus(int i) {
        return minus(get(i));
    }

    private ConsPStack<E> subList(int i) {
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.rest.subList(i - 1);
        }
    }

    private ConsPStack<E> minus(Object obj) {
        if (this.size == 0) {
            return this;
        }
        if (this.first.equals(obj)) {
            return this.rest;
        }
        ConsPStack<E> minus = this.rest.minus(obj);
        if (minus == this.rest) {
            return this;
        }
        return new ConsPStack<>(this.first, minus);
    }

    public E get(int i) {
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return iterator(i).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
    }

    private ConsPStack(E e, ConsPStack<E> consPStack) {
        this.first = e;
        this.rest = consPStack;
        this.size = consPStack.size + 1;
    }
}
