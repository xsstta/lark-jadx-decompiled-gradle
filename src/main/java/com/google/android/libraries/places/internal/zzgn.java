package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzgn<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];
    private transient zzgp<Map.Entry<K, V>> zzb;
    private transient zzgp<K> zzc;
    private transient zzgj<V> zzd;

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public abstract zzgp<Map.Entry<K, V>> zza();

    /* access modifiers changed from: package-private */
    public abstract zzgp<K> zzb();

    /* access modifiers changed from: package-private */
    public abstract zzgj<V> zzc();

    zzgn() {
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzgp<Map.Entry<K, V>> zzgp = this.zzb;
        if (zzgp != null) {
            return zzgp;
        }
        zzgp<Map.Entry<K, V>> zza2 = zza();
        this.zzb = zza2;
        return zza2;
    }

    public int hashCode() {
        return zzgz.zza((zzgp) entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzgp<K> zzgp = this.zzc;
        if (zzgp != null) {
            return zzgp;
        }
        zzgp<K> zzb2 = zzb();
        this.zzc = zzb2;
        return zzb2;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzgj<V> zzgj = this.zzd;
        if (zzgj != null) {
            return zzgj;
        }
        zzgj<V> zzc2 = zzc();
        this.zzd = zzc2;
        return zzc2;
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append((Object) entry.getKey());
                sb.append('=');
                sb.append((Object) entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("size".length() + 40);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzgj) values()).contains(obj);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }
}
