package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B<\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ\u0013\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0018\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020+H\u0016R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lkotlin/collections/MapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MapWithDefault;", "map", "", "default", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "getMap", "()Ljava/util/Map;", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrImplicitDefault", "hashCode", "isEmpty", "toString", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.collections.ad */
final class MapWithDefaultImpl<K, V> implements MapWithDefault<K, V> {

    /* renamed from: a */
    private final Map<K, V> f173057a;

    /* renamed from: b */
    private final Function1<K, V> f173058b;

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.collections.MapWithDefault
    /* renamed from: a */
    public Map<K, V> mo238954a() {
        return this.f173057a;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return mo238961e();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return mo238956c();
    }

    public final int size() {
        return mo238955b();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return mo238960d();
    }

    /* renamed from: b */
    public int mo238955b() {
        return mo238954a().size();
    }

    /* renamed from: c */
    public Set<K> mo238956c() {
        return mo238954a().keySet();
    }

    /* renamed from: d */
    public Collection<V> mo238960d() {
        return mo238954a().values();
    }

    /* renamed from: e */
    public Set<Map.Entry<K, V>> mo238961e() {
        return mo238954a().entrySet();
    }

    public int hashCode() {
        return mo238954a().hashCode();
    }

    public boolean isEmpty() {
        return mo238954a().isEmpty();
    }

    public String toString() {
        return mo238954a().toString();
    }

    public boolean containsKey(Object obj) {
        return mo238954a().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo238954a().containsValue(obj);
    }

    public boolean equals(Object obj) {
        return mo238954a().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return mo238954a().get(obj);
    }

    @Override // kotlin.collections.MapWithDefault
    /* renamed from: a */
    public V mo238953a(K k) {
        Map<K, V> a = mo238954a();
        V v = a.get(k);
        if (v != null || a.containsKey(k)) {
            return v;
        }
        return this.f173058b.invoke(k);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public MapWithDefaultImpl(Map<K, ? extends V> map, Function1<? super K, ? extends V> function1) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        Intrinsics.checkParameterIsNotNull(function1, "default");
        this.f173057a = map;
        this.f173058b = function1;
    }
}
