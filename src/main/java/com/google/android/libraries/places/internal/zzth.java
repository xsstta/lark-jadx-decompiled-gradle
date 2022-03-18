package com.google.android.libraries.places.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class zzth implements Comparable<zzth>, Map.Entry<K, V> {
    private final K zza;
    private V zzb;
    private final /* synthetic */ zztc zzc;

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.zzb;
    }

    public final int hashCode() {
        int i;
        K k = this.zza;
        int i2 = 0;
        if (k == null) {
            i = 0;
        } else {
            i = k.hashCode();
        }
        V v = this.zzb;
        if (v != null) {
            i2 = v.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(valueOf2);
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzc.zzf();
        V v2 = this.zzb;
        this.zzb = v;
        return v2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzth zzth) {
        return ((Comparable) getKey()).compareTo((Comparable) zzth.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!zza(this.zza, entry.getKey()) || !zza(this.zzb, entry.getValue())) {
            return false;
        }
        return true;
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    zzth(zztc zztc, Map.Entry<K, V> entry) {
        this(zztc, entry.getKey(), entry.getValue());
    }

    zzth(zztc zztc, K k, V v) {
        this.zzc = zztc;
        this.zza = k;
        this.zzb = v;
    }
}
