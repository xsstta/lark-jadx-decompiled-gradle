package com.bytedance.platform.godzilla.anr.monitor.idletask;

import android.os.MessageQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ArrayListWrapper extends ArrayList<MessageQueue.IdleHandler> {
    private ArrayList<MessageQueue.IdleHandler> mOriginalArrayList;

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() throws Throwable {
        super.finalize();
    }

    public void clear() {
        throw new RuntimeException("Reach method clear");
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        throw new RuntimeException("Reach method isEmpty");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable, java.util.ArrayList
    public Iterator<MessageQueue.IdleHandler> iterator() {
        return this.mOriginalArrayList.iterator();
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public ListIterator<MessageQueue.IdleHandler> listIterator() {
        throw new RuntimeException("Reach method listIterator");
    }

    @Override // java.util.Collection
    public Stream<MessageQueue.IdleHandler> parallelStream() {
        throw new RuntimeException("Reach method parallelStream");
    }

    public int size() {
        return this.mOriginalArrayList.size();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, java.util.ArrayList
    public Spliterator<MessageQueue.IdleHandler> spliterator() {
        throw new RuntimeException("Reach method spliterator");
    }

    @Override // java.util.Collection
    public Stream<MessageQueue.IdleHandler> stream() {
        throw new RuntimeException("Reach method stream");
    }

    public Object[] toArray() {
        throw new RuntimeException("Reach method toArray");
    }

    public String toString() {
        return super.toString();
    }

    public void trimToSize() {
        throw new RuntimeException("Reach method trimToSize");
    }

    public ArrayListWrapper(ArrayList<MessageQueue.IdleHandler> arrayList) {
        this.mOriginalArrayList = arrayList;
    }

    public boolean contains(Object obj) {
        throw new RuntimeException("Reach method contains");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new RuntimeException("Reach method containsAll");
    }

    public void ensureCapacity(int i) {
        throw new RuntimeException("Reach method ensureCapacity");
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.lang.Iterable, java.util.ArrayList
    public void forEach(Consumer<? super MessageQueue.IdleHandler> consumer) {
        throw new RuntimeException("Reach method forEach");
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public MessageQueue.IdleHandler get(int i) {
        throw new RuntimeException("Reach method get");
    }

    public int indexOf(Object obj) {
        throw new RuntimeException("Reach method indexOf");
    }

    public int lastIndexOf(Object obj) {
        throw new RuntimeException("Reach method lastIndexOf");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean removeAll(Collection<?> collection) {
        throw new RuntimeException("Reach method removeAll");
    }

    @Override // java.util.Collection, java.util.ArrayList
    public boolean removeIf(Predicate<? super MessageQueue.IdleHandler> predicate) {
        throw new RuntimeException("Reach method removeIf");
    }

    @Override // java.util.List, java.util.ArrayList
    public void replaceAll(UnaryOperator<MessageQueue.IdleHandler> unaryOperator) {
        throw new RuntimeException("Reach method replaceAll");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean retainAll(Collection<?> collection) {
        throw new RuntimeException("Reach method retainAll");
    }

    @Override // java.util.List, java.util.ArrayList
    public void sort(Comparator<? super MessageQueue.IdleHandler> comparator) {
        throw new RuntimeException("Reach method sort");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean addAll(Collection<? extends MessageQueue.IdleHandler> collection) {
        throw new RuntimeException("Reach method addAll");
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public ListIterator<MessageQueue.IdleHandler> listIterator(int i) {
        throw new RuntimeException("Reach method listIterator");
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public MessageQueue.IdleHandler remove(int i) {
        return this.mOriginalArrayList.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.mOriginalArrayList.toArray(tArr);
    }

    public boolean add(MessageQueue.IdleHandler idleHandler) {
        if (idleHandler == null || (idleHandler instanceof C20303c)) {
            return this.mOriginalArrayList.add(idleHandler);
        }
        return this.mOriginalArrayList.add(new C20303c(idleHandler));
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        if (this.mOriginalArrayList.remove(obj)) {
            return true;
        }
        C20303c cVar = null;
        Iterator<MessageQueue.IdleHandler> it = this.mOriginalArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MessageQueue.IdleHandler next = it.next();
            if (next instanceof C20303c) {
                C20303c cVar2 = (C20303c) next;
                if (cVar2.mo68617a() == obj) {
                    cVar = cVar2;
                    break;
                }
            }
        }
        if (cVar != null) {
            return this.mOriginalArrayList.remove(cVar);
        }
        return false;
    }

    public void add(int i, MessageQueue.IdleHandler idleHandler) {
        throw new RuntimeException("Reach method add");
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public boolean addAll(int i, Collection<? extends MessageQueue.IdleHandler> collection) {
        throw new RuntimeException("Reach method addAll");
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        throw new RuntimeException("Reach method removeRange");
    }

    public MessageQueue.IdleHandler set(int i, MessageQueue.IdleHandler idleHandler) {
        throw new RuntimeException("Reach method set");
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public List<MessageQueue.IdleHandler> subList(int i, int i2) {
        throw new RuntimeException("Reach method subList");
    }
}
