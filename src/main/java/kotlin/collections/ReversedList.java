package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.collections.aj */
final class ReversedList<T> extends AbstractMutableList<T> {

    /* renamed from: a */
    private final List<T> f173064a;

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: a */
    public int mo238994a() {
        return this.f173064a.size();
    }

    public void clear() {
        this.f173064a.clear();
    }

    public ReversedList(List<T> list) {
        Intrinsics.checkParameterIsNotNull(list, "delegate");
        this.f173064a = list;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: a */
    public T mo238995a(int i) {
        return this.f173064a.remove(C69057s.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // java.util.List, java.util.AbstractList
    public T get(int i) {
        return this.f173064a.get(C69057s.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, T t) {
        this.f173064a.add(C69057s.reversePositionIndex$CollectionsKt__ReversedViewsKt(this, i), t);
    }

    @Override // java.util.List, java.util.AbstractList
    public T set(int i, T t) {
        return this.f173064a.set(C69057s.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i), t);
    }
}
