package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public final LazyStringList list;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            /* class kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.C692442 */
            Iterator<String> iter;

            public boolean hasNext() {
                return this.iter.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public String next() {
                return this.iter.next();
            }

            {
                this.iter = UnmodifiableLazyStringList.this.list.iterator();
            }
        };
    }

    public int size() {
        return this.list.size();
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        return this.list.getByteString(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) {
            /* class kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.C692431 */
            ListIterator<String> iter;
            final /* synthetic */ int val$index;

            public boolean hasNext() {
                return this.iter.hasNext();
            }

            public boolean hasPrevious() {
                return this.iter.hasPrevious();
            }

            public int nextIndex() {
                return this.iter.nextIndex();
            }

            public int previousIndex() {
                return this.iter.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator, java.util.ListIterator
            public String next() {
                return this.iter.next();
            }

            @Override // java.util.ListIterator
            public String previous() {
                return this.iter.previous();
            }

            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            {
                this.val$index = r2;
                this.iter = UnmodifiableLazyStringList.this.list.listIterator(r2);
            }
        };
    }

    @Override // java.util.List, java.util.AbstractList
    public String get(int i) {
        return (String) this.list.get(i);
    }
}
