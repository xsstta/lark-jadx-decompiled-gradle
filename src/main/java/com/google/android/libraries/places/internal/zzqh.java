package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* access modifiers changed from: package-private */
public class zzqh extends zzqe {
    protected final byte[] zzb;

    /* access modifiers changed from: protected */
    public int zze() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzpx
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.libraries.places.internal.zzpx
    public final boolean zzc() {
        int zze = zze();
        return zzty.zza(this.zzb, zze, zza() + zze);
    }

    @Override // com.google.android.libraries.places.internal.zzpx
    public byte zza(int i) {
        return this.zzb[i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzpx
    public byte zzb(int i) {
        return this.zzb[i];
    }

    zzqh(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzpx
    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.libraries.places.internal.zzpx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpx) || zza() != ((zzpx) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof zzqh)) {
            return obj.equals(this);
        }
        zzqh zzqh = (zzqh) obj;
        int zzd = zzd();
        int zzd2 = zzqh.zzd();
        if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
            return zza(zzqh, 0, zza());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzpx
    public final void zza(zzpu zzpu) throws IOException {
        zzpu.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.libraries.places.internal.zzpx
    public final zzpx zza(int i, int i2) {
        int zzb2 = zzb(0, i2, zza());
        if (zzb2 == 0) {
            return zzpx.zza;
        }
        return new zzqa(this.zzb, zze(), zzb2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzpx
    public final int zza(int i, int i2, int i3) {
        return zzrc.zza(i, this.zzb, zze(), i3);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzqe
    public final boolean zza(zzpx zzpx, int i, int i2) {
        if (i2 > zzpx.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzpx.zza()) {
            int zza2 = zzpx.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzpx instanceof zzqh)) {
            return zzpx.zza(0, i2).equals(zza(0, i2));
        } else {
            zzqh zzqh = (zzqh) zzpx;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzqh.zzb;
            int zze = zze() + i2;
            int zze2 = zze();
            int zze3 = zzqh.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }
}
