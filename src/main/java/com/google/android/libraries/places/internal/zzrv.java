package com.google.android.libraries.places.internal;

final class zzrv extends zzru {
    private zzrv() {
        super();
    }

    private static <E> zzrh<E> zzb(Object obj, long j) {
        return (zzrh) zztv.zzf(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzru
    public final void zza(Object obj, long j) {
        zzb(obj, j).b_();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.libraries.places.internal.zzrh] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzru
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzrh<E> zzb = zzb(obj, j);
        zzrh<E> zzb2 = zzb(obj2, j);
        int size = zzb.size();
        int size2 = zzb2.size();
        zzrh<E> zzrh = zzb;
        zzrh = zzb;
        if (size > 0 && size2 > 0) {
            boolean zza = zzb.zza();
            zzrh<E> zzrh2 = zzb;
            if (!zza) {
                zzrh2 = zzb.zzb(size2 + size);
            }
            zzrh2.addAll(zzb2);
            zzrh = zzrh2;
        }
        if (size > 0) {
            zzb2 = zzrh;
        }
        zztv.zza(obj, j, zzb2);
    }
}
