package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

final class zzsg implements zzsd {
    zzsg() {
    }

    @Override // com.google.android.libraries.places.internal.zzsd
    public final Map<?, ?> zza(Object obj) {
        return (zzse) obj;
    }

    @Override // com.google.android.libraries.places.internal.zzsd
    public final Object zzb(Object obj) {
        ((zzse) obj).zzb();
        return obj;
    }

    @Override // com.google.android.libraries.places.internal.zzsd
    public final zzsb<?, ?> zzc(Object obj) {
        zzsc zzsc = (zzsc) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.libraries.places.internal.zzsd
    public final Object zza(Object obj, Object obj2) {
        zzse zzse = (zzse) obj;
        zzse zzse2 = (zzse) obj2;
        if (!zzse2.isEmpty()) {
            if (!zzse.zzc()) {
                zzse = zzse.zza();
            }
            zzse.zza(zzse2);
        }
        return zzse;
    }

    @Override // com.google.android.libraries.places.internal.zzsd
    public final int zza(int i, Object obj, Object obj2) {
        zzse zzse = (zzse) obj;
        zzsc zzsc = (zzsc) obj2;
        if (zzse.isEmpty()) {
            return 0;
        }
        Iterator it = zzse.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
