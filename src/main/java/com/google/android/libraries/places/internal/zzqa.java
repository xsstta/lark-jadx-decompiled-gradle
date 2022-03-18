package com.google.android.libraries.places.internal;

final class zzqa extends zzqh {
    private final int zzc;
    private final int zzd;

    @Override // com.google.android.libraries.places.internal.zzqh, com.google.android.libraries.places.internal.zzpx
    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzqh
    public final int zze() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqh, com.google.android.libraries.places.internal.zzpx
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.libraries.places.internal.zzqh, com.google.android.libraries.places.internal.zzpx
    public final byte zza(int i) {
        int zza = zza();
        if (((zza - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(zza);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    zzqa(byte[] bArr, int i, int i2) {
        super(bArr);
        zzb(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }
}
