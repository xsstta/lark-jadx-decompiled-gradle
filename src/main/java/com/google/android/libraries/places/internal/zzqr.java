package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;
import java.io.IOException;
import java.util.Map;

final class zzqr extends zzqo<zzqy.zzc> {
    zzqr() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqo
    public final boolean zza(zzsk zzsk) {
        return zzsk instanceof zzqy.zzd;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqo
    public final zzqt<zzqy.zzc> zza(Object obj) {
        return ((zzqy.zzd) obj).zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqo
    public final void zzc(Object obj) {
        zza(obj).zzb();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqo
    public final int zza(Map.Entry<?, ?> entry) {
        zzqy.zzc zzc = (zzqy.zzc) entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqo
    public final zzqt<zzqy.zzc> zzb(Object obj) {
        zzqy.zzd zzd = (zzqy.zzd) obj;
        if (zzd.zzc.zzc()) {
            zzd.zzc = (zzqt) zzd.zzc.clone();
        }
        return zzd.zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqo
    public final void zza(zzuj zzuj, Map.Entry<?, ?> entry) throws IOException {
        zzqy.zzc zzc = (zzqy.zzc) entry.getKey();
        throw new NoSuchMethodError();
    }
}
