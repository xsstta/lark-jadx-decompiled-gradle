package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

final class zzsy implements zzsi {
    private final zzsk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.libraries.places.internal.zzsi
    public final zzsk zzc() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public final int zza() {
        if ((this.zzd & 1) == 1) {
            return zzqy.zze.zzh;
        }
        return zzqy.zze.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public final boolean zzb() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    zzsy(zzsk zzsk, String str, Object[] objArr) {
        this.zza = zzsk;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.zzd = i | (charAt2 << i2);
                return;
            }
        }
    }
}
