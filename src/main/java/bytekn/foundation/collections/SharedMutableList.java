package bytekn.foundation.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C69116e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\fJ\u001e\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0001J\u0017\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0001J\t\u0010\u0013\u001a\u00020\rH\u0001J\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0003¢\u0006\u0002\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0001J\u0016\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0004H\u0001J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0003J\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0001J\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0001J\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\fJ\u0017\u0010!\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0001J\u0016\u0010\"\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0017J\u0017\u0010#\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0001J\u001e\u0010$\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0003¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006)"}, d2 = {"Lbytekn/foundation/collections/SharedMutableList;", "V", "", "useConcurrency", "", "(Z)V", "size", "", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.a.a */
public final class SharedMutableList<V> implements List<V>, KMutableList {

    /* renamed from: a */
    private final /* synthetic */ List f5719a;

    public SharedMutableList() {
        this(false, 1, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedMutableList(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: a */
    public int mo8575a() {
        return this.f5719a.size();
    }

    /* renamed from: a */
    public V mo8576a(int i) {
        return (V) this.f5719a.remove(i);
    }

    @Override // java.util.List
    public void add(int i, V v) {
        this.f5719a.add(i, v);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(V v) {
        return this.f5719a.add(v);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends V> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        return this.f5719a.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        return this.f5719a.addAll(collection);
    }

    public void clear() {
        this.f5719a.clear();
    }

    public boolean contains(Object obj) {
        return this.f5719a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        return this.f5719a.containsAll(collection);
    }

    @Override // java.util.List
    public V get(int i) {
        return (V) this.f5719a.get(i);
    }

    public int indexOf(Object obj) {
        return this.f5719a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f5719a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f5719a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f5719a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<V> listIterator() {
        return this.f5719a.listIterator();
    }

    @Override // java.util.List
    public ListIterator<V> listIterator(int i) {
        return this.f5719a.listIterator(i);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        return this.f5719a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        return this.f5719a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        return this.f5719a.retainAll(collection);
    }

    @Override // java.util.List
    public V set(int i, V v) {
        return (V) this.f5719a.set(i, v);
    }

    @Override // java.util.List
    public List<V> subList(int i, int i2) {
        return this.f5719a.subList(i, i2);
    }

    public Object[] toArray() {
        return C69116e.m265964a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C69116e.m265965a(this, tArr);
    }

    public final int size() {
        return mo8575a();
    }

    @Override // java.util.List
    public final V remove(int i) {
        return mo8576a(i);
    }

    public SharedMutableList(boolean z) {
        ArrayList arrayList;
        if (z) {
            arrayList = Collections.synchronizedList(new ArrayList());
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "Collections.synchronizedList(mutableListOf())");
        } else {
            arrayList = new ArrayList();
        }
        this.f5719a = arrayList;
    }
}
