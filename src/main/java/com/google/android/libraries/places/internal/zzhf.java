package com.google.android.libraries.places.internal;

import java.io.IOException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzhf extends zzhe {
    private zzhf(zzhd zzhd, @NullableDecl Character ch) {
        super(zzhd, ch);
        boolean z;
        if (zzhd.zza(zzhd).length == 64) {
            z = true;
        } else {
            z = false;
        }
        zzft.zza(z);
    }

    zzhf(String str, String str2, @NullableDecl Character ch) {
        this(new zzhd(str, str2.toCharArray()), ch);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzha, com.google.android.libraries.places.internal.zzhe
    public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzft.zza(appendable);
        int i3 = i2 + 0;
        int i4 = 0;
        zzft.zza(0, i3, bArr.length);
        while (i2 >= 3) {
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i5] & 255) << 8) | ((bArr[i4] & 255) << 16);
            i4 = i6 + 1;
            int i8 = i7 | (bArr[i6] & 255);
            appendable.append(this.zza.zza(i8 >>> 18));
            appendable.append(this.zza.zza((i8 >>> 12) & 63));
            appendable.append(this.zza.zza((i8 >>> 6) & 63));
            appendable.append(this.zza.zza(i8 & 63));
            i2 -= 3;
        }
        if (i4 < i3) {
            zzb(appendable, bArr, i4, i3 - i4);
        }
    }
}
