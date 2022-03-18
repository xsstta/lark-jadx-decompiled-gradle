package com.ss.android.lark.passport.infra.util.collection;

import com.ss.android.lark.passport.infra.util.collection.AbstractC49181c;
import java.util.ArrayList;
import java.util.Collection;

public class ObservableArrayList<T> extends ArrayList<T> implements AbstractC49181c<T> {
    private transient C49178b mListeners = new C49178b();

    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            notifyRemove(0, size);
        }
    }

    public void removeOnListChangedCallback(AbstractC49181c.AbstractC49182a aVar) {
        C49178b bVar = this.mListeners;
        if (bVar != null) {
            bVar.mo171675b(aVar);
        }
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.ArrayList
    public boolean add(T t) {
        super.add(t);
        notifyAdd(size() - 1, 1);
        return true;
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public T remove(int i) {
        T t = (T) super.remove(i);
        notifyRemove(i, 1);
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            notifyAdd(size, size() - size);
        }
        return addAll;
    }

    public void addOnListChangedCallback(AbstractC49181c.AbstractC49182a aVar) {
        if (this.mListeners == null) {
            this.mListeners = new C49178b();
        }
        this.mListeners.mo171673a(aVar);
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    private void notifyAdd(int i, int i2) {
        C49178b bVar = this.mListeners;
        if (bVar != null) {
            bVar.mo171680b(this, i, i2);
        }
    }

    private void notifyRemove(int i, int i2) {
        C49178b bVar = this.mListeners;
        if (bVar != null) {
            bVar.mo171681c(this, i, i2);
        }
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public void add(int i, T t) {
        super.add(i, t);
        notifyAdd(i, 1);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        notifyRemove(i, i2 - i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            notifyAdd(i, collection.size());
        }
        return addAll;
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public T set(int i, T t) {
        T t2 = (T) super.set(i, t);
        C49178b bVar = this.mListeners;
        if (bVar != null) {
            bVar.mo171678a(this, i, 1);
        }
        return t2;
    }
}
