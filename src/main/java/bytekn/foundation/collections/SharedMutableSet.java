package bytekn.foundation.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lbytekn/foundation/collections/SharedMutableSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "useConcurrency", "", "(Z)V", "map", "Lbytekn/foundation/collections/SharedMutableMap;", "size", "", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "clear", "", "contains", "isEmpty", "iterator", "", "remove", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.a.c */
public final class SharedMutableSet<E> extends AbstractMutableSet<E> {

    /* renamed from: a */
    private final SharedMutableMap<E, Boolean> f5721a;

    public SharedMutableSet() {
        this(false, 1, null);
    }

    public void clear() {
        this.f5721a.clear();
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* renamed from: a */
    public int mo8616a() {
        return this.f5721a.keySet().size();
    }

    public boolean isEmpty() {
        return this.f5721a.keySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f5721a.keySet().iterator();
    }

    public SharedMutableSet(boolean z) {
        this.f5721a = new SharedMutableMap<>(z);
    }

    public boolean contains(Object obj) {
        return this.f5721a.keySet().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return Intrinsics.areEqual((Object) this.f5721a.put(e, true), (Object) true);
    }

    public boolean remove(Object obj) {
        return Intrinsics.areEqual((Object) this.f5721a.remove(obj), (Object) true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedMutableSet(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
