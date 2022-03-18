package com.google.android.libraries.places.internal;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.math.RoundingMode;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class zzhd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;

    public final String toString() {
        return this.zze;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf);
    }

    static /* synthetic */ char[] zza(zzhd zzhd) {
        return zzhd.zzf;
    }

    /* access modifiers changed from: package-private */
    public final char zza(int i) {
        return this.zzf[i];
    }

    public final boolean zza(char c) {
        byte[] bArr = this.zzg;
        if (c >= bArr.length || bArr[c] == -1) {
            return false;
        }
        return true;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzhd) {
            return Arrays.equals(this.zzf, ((zzhd) obj).zzf);
        }
        return false;
    }

    zzhd(String str, char[] cArr) {
        String str2;
        boolean z;
        boolean z2;
        this.zze = (String) zzft.zza(str);
        this.zzf = (char[]) zzft.zza(cArr);
        try {
            int zza2 = zzpn.zza(cArr.length, RoundingMode.UNNECESSARY);
            this.zzb = zza2;
            int min = Math.min(8, Integer.lowestOneBit(zza2));
            try {
                this.zzc = 8 / min;
                this.zzd = zza2 / min;
                this.zza = cArr.length - 1;
                byte[] bArr = new byte[SmActions.ACTION_ONTHECALL_EXIT];
                Arrays.fill(bArr, (byte) -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    if (c < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzft.zza(z, "Non-ASCII character: %s", c);
                    if (bArr[c] == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzft.zza(z2, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                }
                this.zzg = bArr;
                boolean[] zArr = new boolean[this.zzc];
                for (int i2 = 0; i2 < this.zzd; i2++) {
                    zArr[zzpn.zza(i2 << 3, this.zzb, RoundingMode.CEILING)] = true;
                }
                this.zzh = zArr;
            } catch (ArithmeticException e) {
                String str3 = new String(cArr);
                if (str3.length() != 0) {
                    str2 = "Illegal alphabet ".concat(str3);
                } else {
                    str2 = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(str2, e);
            }
        } catch (ArithmeticException e2) {
            int length = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }
}
