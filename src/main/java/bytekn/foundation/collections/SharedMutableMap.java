package bytekn.foundation.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0017H\u0001J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0001H\u0001¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0005H\u0001J \u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H\u0001¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u00172\u0014\u0010#\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0001J\u0018\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u001eR$\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\bX\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013X\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lbytekn/foundation/collections/SharedMutableMap;", "K", "V", "", "useConcurrency", "", "(Z)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.a.b */
public final class SharedMutableMap<K, V> implements Map<K, V>, KMutableMap {

    /* renamed from: a */
    private final /* synthetic */ Map f5720a;

    public SharedMutableMap() {
        this(false, 1, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedMutableMap(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo8600a() {
        return this.f5720a.entrySet();
    }

    /* renamed from: b */
    public Set<K> mo8601b() {
        return this.f5720a.keySet();
    }

    /* renamed from: c */
    public int mo8602c() {
        return this.f5720a.size();
    }

    public void clear() {
        this.f5720a.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f5720a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f5720a.containsValue(obj);
    }

    /* renamed from: d */
    public Collection<V> mo8606d() {
        return this.f5720a.values();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) this.f5720a.get(obj);
    }

    public boolean isEmpty() {
        return this.f5720a.isEmpty();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return (V) this.f5720a.put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        Intrinsics.checkParameterIsNotNull(map, "from");
        this.f5720a.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return (V) this.f5720a.remove(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return mo8600a();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return mo8601b();
    }

    public final int size() {
        return mo8602c();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return mo8606d();
    }

    public SharedMutableMap(boolean z) {
        Map map;
        if (z) {
            map = new ConcurrentHashMap();
        } else {
            map = new LinkedHashMap(0, 0.75f, true);
        }
        this.f5720a = map;
    }
}
