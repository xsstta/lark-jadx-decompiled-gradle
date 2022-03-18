package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzrw extends zzru {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzrw() {
        super();
    }

    private static <E> List<E> zzb(Object obj, long j) {
        return (List) zztv.zzf(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzru
    public final void zza(Object obj, long j) {
        Object obj2;
        List list = (List) zztv.zzf(obj, j);
        if (list instanceof zzrr) {
            obj2 = ((zzrr) list).a_();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzst) || !(list instanceof zzrh)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzrh zzrh = (zzrh) list;
                if (zzrh.zza()) {
                    zzrh.b_();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zztv.zza(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzru
    public final <E> void zza(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List zzb = zzb(obj2, j);
        int size = zzb.size();
        List zzb2 = zzb(obj, j);
        if (zzb2.isEmpty()) {
            if (zzb2 instanceof zzrr) {
                zzb2 = new zzrs(size);
            } else if (!(zzb2 instanceof zzst) || !(zzb2 instanceof zzrh)) {
                zzb2 = new ArrayList(size);
            } else {
                zzb2 = ((zzrh) zzb2).zzb(size);
            }
            zztv.zza(obj, j, zzb2);
        } else {
            if (zza.isAssignableFrom(zzb2.getClass())) {
                ArrayList arrayList2 = new ArrayList(zzb2.size() + size);
                arrayList2.addAll(zzb2);
                zztv.zza(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (zzb2 instanceof zztu) {
                zzrs zzrs = new zzrs(zzb2.size() + size);
                zzrs.addAll((zztu) zzb2);
                zztv.zza(obj, j, zzrs);
                arrayList = zzrs;
            } else if ((zzb2 instanceof zzst) && (zzb2 instanceof zzrh)) {
                zzrh zzrh = (zzrh) zzb2;
                if (!zzrh.zza()) {
                    zzb2 = zzrh.zzb(zzb2.size() + size);
                    zztv.zza(obj, j, zzb2);
                }
            }
            zzb2 = arrayList;
        }
        int size2 = zzb2.size();
        int size3 = zzb.size();
        if (size2 > 0 && size3 > 0) {
            zzb2.addAll(zzb);
        }
        if (size2 > 0) {
            zzb = zzb2;
        }
        zztv.zza(obj, j, zzb);
    }
}
