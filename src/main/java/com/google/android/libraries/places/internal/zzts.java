package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;
import java.io.IOException;
import java.util.Arrays;

public final class zzts {
    private static final zzts zza = new zzts(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public final void zzb() {
        this.zzf = false;
    }

    public static zzts zza() {
        return zza;
    }

    private zzts() {
        this(0, new int[8], new Object[8], true);
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zzc() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzqk.zzd(this.zzc[i3] >>> 3, (zzpx) this.zzd[i3]);
        }
        this.zze = i2;
        return i2;
    }

    public final int zzd() {
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzqk.zze(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 1) {
                i = zzqk.zzg(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 2) {
                i = zzqk.zzc(i6, (zzpx) this.zzd[i4]);
            } else if (i7 == 3) {
                i = (zzqk.zze(i6) << 1) + ((zzts) this.zzd[i4]).zzd();
            } else if (i7 == 5) {
                i = zzqk.zzi(i6, ((Integer) this.zzd[i4]).intValue());
            } else {
                throw new IllegalStateException(zzrk.zza());
            }
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final void zzb(zzuj zzuj) throws IOException {
        if (this.zzb != 0) {
            if (zzuj.zza() == zzqy.zze.zzj) {
                for (int i = 0; i < this.zzb; i++) {
                    zza(this.zzc[i], this.zzd[i], zzuj);
                }
                return;
            }
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zza(this.zzc[i2], this.zzd[i2], zzuj);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzts)) {
            return false;
        }
        zzts zzts = (zzts) obj;
        int i = this.zzb;
        if (i == zzts.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzts.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzts.zzd;
                int i3 = this.zzb;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzuj zzuj) throws IOException {
        if (zzuj.zza() == zzqy.zze.zzk) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzuj.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzuj.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzsl.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    static zzts zza(zzts zzts, zzts zzts2) {
        int i = zzts.zzb + zzts2.zzb;
        int[] copyOf = Arrays.copyOf(zzts.zzc, i);
        System.arraycopy(zzts2.zzc, 0, copyOf, zzts.zzb, zzts2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzts.zzd, i);
        System.arraycopy(zzts2.zzd, 0, copyOf2, zzts.zzb, zzts2.zzb);
        return new zzts(i, copyOf, copyOf2, true);
    }

    private static void zza(int i, Object obj, zzuj zzuj) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzuj.zza(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzuj.zzd(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzuj.zza(i2, (zzpx) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzuj.zzd(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzrk.zza());
        } else if (zzuj.zza() == zzqy.zze.zzj) {
            zzuj.zza(i2);
            ((zzts) obj).zzb(zzuj);
            zzuj.zzb(i2);
        } else {
            zzuj.zzb(i2);
            ((zzts) obj).zzb(zzuj);
            zzuj.zza(i2);
        }
    }

    private zzts(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }
}
