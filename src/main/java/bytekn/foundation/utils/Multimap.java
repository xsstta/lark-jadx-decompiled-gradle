package bytekn.foundation.utils;

import bytekn.foundation.collections.SharedMutableList;
import bytekn.foundation.collections.SharedMutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011\u0018\u00010\u0010J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u001b\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\fJ\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0013R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lbytekn/foundation/utils/Multimap;", "K", "V", "", "()V", "mInternalHashMap", "Lbytekn/foundation/collections/SharedMutableMap;", "Lbytekn/foundation/collections/SharedMutableList;", "containsEntry", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "containsKey", "(Ljava/lang/Object;)Z", "entrySet", "", "Lbytekn/foundation/utils/Multimap$Entry;", "get", "", "(Ljava/lang/Object;)Ljava/util/Collection;", "keySet", "put", "", "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "values", "Entry", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.e.c */
public final class Multimap<K, V> {

    /* renamed from: a */
    private final SharedMutableMap<K, SharedMutableList<V>> f5764a = new SharedMutableMap<>(false, 1, null);

    /* renamed from: a */
    public final Set<K> mo8671a() {
        return this.f5764a.keySet();
    }

    /* renamed from: b */
    public final Collection<V> mo8673b() {
        Collection<SharedMutableList<V>> values = this.f5764a.values();
        ArrayList arrayList = new ArrayList();
        for (SharedMutableList<V> aVar : values) {
            arrayList.addAll(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Collection<V> mo8670a(K k) {
        SharedMutableList<V> aVar = this.f5764a.get(k);
        if (aVar == null) {
            aVar = CollectionsKt.emptyList();
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo8672a(K k, V v) {
        SharedMutableList<V> aVar = this.f5764a.get(k);
        if (aVar == null) {
            SharedMutableList<V> aVar2 = new SharedMutableList<>(false, 1, null);
            aVar2.add(v);
            this.f5764a.put(k, aVar2);
            return;
        }
        aVar.add(v);
    }
}
