package butterknife.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

final class ImmutableList<T> extends AbstractList<T> implements RandomAccess {
    private final T[] views;

    public int size() {
        return this.views.length;
    }

    ImmutableList(T[] tArr) {
        this.views = tArr;
    }

    @Override // java.util.List, java.util.AbstractList
    public T get(int i) {
        return this.views[i];
    }

    public boolean contains(Object obj) {
        for (T t : this.views) {
            if (t == obj) {
                return true;
            }
        }
        return false;
    }
}
