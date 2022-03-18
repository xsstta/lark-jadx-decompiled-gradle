package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public class zzhe extends zzha {
    final zzhd zza;
    @NullableDecl
    private final Character zzb;

    public int hashCode() {
        return this.zza.hashCode() ^ Arrays.hashCode(new Object[]{this.zzb});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza.toString());
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzhe) {
            zzhe zzhe = (zzhe) obj;
            if (!this.zza.equals(zzhe.zza) || !zzfn.zza(this.zzb, zzhe.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzha
    public final int zza(int i) {
        return this.zza.zzc * zzpn.zza(i, this.zza.zzd, RoundingMode.CEILING);
    }

    zzhe(zzhd zzhd, @NullableDecl Character ch) {
        boolean z;
        this.zza = (zzhd) zzft.zza(zzhd);
        if (ch == null || !zzhd.zza(ch.charValue())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.zzb = ch;
        } else {
            throw new IllegalArgumentException(zzfz.zza("Padding character %s was already in alphabet", ch));
        }
    }

    zzhe(String str, String str2, @NullableDecl Character ch) {
        this(new zzhd(str, str2.toCharArray()), ch);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzha
    public void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzft.zza(appendable);
        int i3 = 0;
        zzft.zza(0, i2 + 0, bArr.length);
        while (i3 < i2) {
            zzb(appendable, bArr, i3 + 0, Math.min(this.zza.zzd, i2 - i3));
            i3 += this.zza.zzd;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        zzft.zza(appendable);
        zzft.zza(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.zza.zzd) {
            z = true;
        } else {
            z = false;
        }
        zzft.zza(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) << 3) - this.zza.zzb;
        while (i3 < (i2 << 3)) {
            appendable.append(this.zza.zza(((int) (j >>> (i5 - i3))) & this.zza.zza));
            i3 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i3 < (this.zza.zzd << 3)) {
                appendable.append(this.zzb.charValue());
                i3 += this.zza.zzb;
            }
        }
    }
}
