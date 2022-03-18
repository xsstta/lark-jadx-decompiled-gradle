package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/collections/MovingSubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "(Ljava/util/List;)V", "_size", "", "fromIndex", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "move", "", "toIndex", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.collections.ag */
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: b */
    private int f173059b;

    /* renamed from: c */
    private int f173060c;

    /* renamed from: d */
    private final List<E> f173061d;

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int mo109135b() {
        return this.f173060c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends E> */
    /* JADX WARN: Multi-variable type inference failed */
    public MovingSubList(List<? extends E> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f173061d = list;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.f173077a.mo239023a(i, this.f173060c);
        return this.f173061d.get(this.f173059b + i);
    }

    /* renamed from: a */
    public final void mo238974a(int i, int i2) {
        AbstractList.f173077a.mo239024a(i, i2, this.f173061d.size());
        this.f173059b = i;
        this.f173060c = i2 - i;
    }
}
