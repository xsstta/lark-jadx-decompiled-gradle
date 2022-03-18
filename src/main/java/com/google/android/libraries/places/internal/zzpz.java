package com.google.android.libraries.places.internal;

import java.util.Comparator;

final class zzpz implements Comparator<zzpx> {
    zzpz() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzpx zzpx, zzpx zzpx2) {
        zzpx zzpx3 = zzpx;
        zzpx zzpx4 = zzpx2;
        zzqc zzqc = (zzqc) zzpx3.iterator();
        zzqc zzqc2 = (zzqc) zzpx4.iterator();
        while (zzqc.hasNext() && zzqc2.hasNext()) {
            int compare = Integer.compare(zzpx.zzb(zzqc.zza()), zzpx.zzb(zzqc2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzpx3.zza(), zzpx4.zza());
    }
}
