package com.google.android.libraries.places.internal;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class zztc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzth> zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zztj zze;
    private Map<K, V> zzf;
    private volatile zztd zzg;

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* access modifiers changed from: private */
    public final void zzf() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zztj(this, null);
        }
        return this.zze;
    }

    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zze() {
        if (this.zzg == null) {
            this.zzg = new zztd(this, null);
        }
        return this.zzg;
    }

    public void clear() {
        zzf();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public final Iterable<Map.Entry<K, V>> zzd() {
        if (this.zzc.isEmpty()) {
            return zztg.zza();
        }
        return this.zzc.entrySet();
    }

    private final SortedMap<K, V> zzg() {
        zzf();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    public int hashCode() {
        int zzc2 = zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc2; i2++) {
            i += this.zzb.get(i2).hashCode();
        }
        if (this.zzc.size() > 0) {
            return i + this.zzc.hashCode();
        }
        return i;
    }

    public void zza() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = map;
            if (this.zzf.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = map2;
            this.zzd = true;
        }
    }

    static <FieldDescriptorType extends zzqv<FieldDescriptorType>> zztc<FieldDescriptorType, Object> zza(int i) {
        return new zztb(i);
    }

    public final Map.Entry<K, V> zzb(int i) {
        return this.zzb.get(i);
    }

    private zztc(int i) {
        this.zza = i;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.libraries.places.internal.zztc<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza(comparable) >= 0 || this.zzc.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.libraries.places.internal.zztc<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        return zza2 >= 0 ? (V) this.zzb.get(zza2).getValue() : this.zzc.get(comparable);
    }

    /* access modifiers changed from: private */
    public final V zzc(int i) {
        zzf();
        V v = (V) this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzg().entrySet().iterator();
            this.zzb.add(new zzth(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.libraries.places.internal.zztc<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzf();
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        if (zza2 >= 0) {
            return (V) zzc(zza2);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    private final int zza(K k) {
        int size = this.zzb.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzb.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzb.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztc)) {
            return super.equals(obj);
        }
        zztc zztc = (zztc) obj;
        int size = size();
        if (size != zztc.size()) {
            return false;
        }
        int zzc2 = zzc();
        if (zzc2 != zztc.zzc()) {
            return entrySet().equals(zztc.entrySet());
        }
        for (int i = 0; i < zzc2; i++) {
            if (!zzb(i).equals(zztc.zzb(i))) {
                return false;
            }
        }
        if (zzc2 != size) {
            return this.zzc.equals(zztc.zzc);
        }
        return true;
    }

    /* synthetic */ zztc(int i, zztb zztb) {
        this(i);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzf();
        int zza2 = zza(k);
        if (zza2 >= 0) {
            return (V) this.zzb.get(zza2).setValue(v);
        }
        zzf();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i = -(zza2 + 1);
        if (i >= this.zza) {
            return zzg().put(k, v);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            zzth remove = this.zzb.remove(i2 - 1);
            zzg().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.zzb.add(i, new zzth(this, k, v));
        return null;
    }
}
