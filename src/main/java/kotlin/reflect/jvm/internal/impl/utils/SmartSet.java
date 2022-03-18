package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.collections.am;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C69115b;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class SmartSet<T> extends AbstractSet<T> {
    public static final Companion Companion = new Companion(null);
    private Object data;
    private int size;

    @JvmStatic
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final <T> SmartSet<T> create(Collection<? extends T> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(collection);
            return smartSet;
        }
    }

    private static final class SingletonIterator<T> implements Iterator<T>, KMutableIterator {
        private final T element;
        private boolean hasNext = true;

        public boolean hasNext() {
            return this.hasNext;
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.hasNext) {
                this.hasNext = false;
                return this.element;
            }
            throw new NoSuchElementException();
        }

        public SingletonIterator(T t) {
            this.element = t;
        }
    }

    private SmartSet() {
    }

    public int getSize() {
        return this.size;
    }

    private static final class ArrayIterator<T> implements Iterator<T>, KMutableIterator {
        private final Iterator<T> arrayIterator;

        public boolean hasNext() {
            return this.arrayIterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.arrayIterator.next();
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public ArrayIterator(T[] tArr) {
            Intrinsics.checkParameterIsNotNull(tArr, "array");
            this.arrayIterator = C69115b.m265959a(tArr);
        }
    }

    public void clear() {
        this.data = null;
        setSize(0);
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new SingletonIterator(this.data);
        }
        if (size() < 5) {
            Object obj = this.data;
            if (obj != null) {
                return new ArrayIterator((Object[]) obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.data;
        if (obj2 != null) {
            return C69121n.m265991h(obj2).iterator();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    public void setSize(int i) {
        this.size = i;
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.areEqual(this.data, obj);
        }
        if (size() < 5) {
            Object obj2 = this.data;
            if (obj2 != null) {
                return C69043h.m265767b((Object[]) obj2, obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj3 = this.data;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: java.util.LinkedHashSet */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object[] objArr;
        if (size() == 0) {
            this.data = t;
        } else if (size() == 1) {
            if (Intrinsics.areEqual(this.data, t)) {
                return false;
            }
            this.data = new Object[]{this.data, t};
        } else if (size() < 5) {
            Object obj = this.data;
            if (obj != null) {
                Object[] objArr2 = (Object[]) obj;
                if (C69043h.m265767b(objArr2, (Object) t)) {
                    return false;
                }
                if (size() == 4) {
                    LinkedHashSet c = am.m265691c(Arrays.copyOf(objArr2, objArr2.length));
                    c.add(t);
                    objArr = c;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                    Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                    copyOf[copyOf.length - 1] = t;
                    objArr = copyOf;
                }
                this.data = objArr;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            Object obj2 = this.data;
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            } else if (!C69121n.m265991h(obj2).add(t)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }
}
