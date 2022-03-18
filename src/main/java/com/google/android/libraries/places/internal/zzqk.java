package com.google.android.libraries.places.internal;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzqk extends zzpu {
    private static final Logger zzb = Logger.getLogger(zzqk.class.getName());
    private static final boolean zzc = zztv.zza();
    zzqn zza;

    public static int zzb(double d) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public static int zze(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int zzg(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzg(long j) {
        return 8;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzi(int i) {
        return 4;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzj(int i) {
        return 4;
    }

    private static int zzm(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    public abstract void zza(int i) throws IOException;

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzpx zzpx) throws IOException;

    public abstract void zza(int i, zzsk zzsk) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(int i, zzsk zzsk, zzsx zzsx) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(zzpx zzpx) throws IOException;

    public abstract void zza(zzsk zzsk) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzb(int i, zzpx zzpx) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(long j) throws IOException;

    public abstract void zzd(int i) throws IOException;

    public abstract void zze(int i, int i2) throws IOException;

    private zzqk() {
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzi(j));
    }

    public final void zzb(long j) throws IOException {
        zza(zzi(j));
    }

    public final void zza(boolean z) throws IOException {
        zza(z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public static class zza extends zzqk {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(zzpx zzpx) throws IOException {
            zzb(zzpx.zza());
            zzpx.zza(this);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(zzsk zzsk) throws IOException {
            zzb(zzsk.zzh());
            zzsk.zza(this);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(long j) throws IOException {
            if (!zzqk.zzc || zza() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zze;
                    this.zze = i + 1;
                    bArr[i] = (byte) ((((int) j) & SmActions.ACTION_ONTHECALL_ENTRY) | SmActions.ACTION_ONTHECALL_EXIT);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.zzb;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.zzb;
                    int i3 = this.zze;
                    this.zze = i3 + 1;
                    zztv.zza(bArr3, (long) i3, (byte) ((((int) j) & SmActions.ACTION_ONTHECALL_ENTRY) | SmActions.ACTION_ONTHECALL_EXIT));
                    j >>>= 7;
                }
                byte[] bArr4 = this.zzb;
                int i4 = this.zze;
                this.zze = i4 + 1;
                zztv.zza(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(String str) throws IOException {
            int i = this.zze;
            try {
                int zzg = zzg(str.length() * 3);
                int zzg2 = zzg(str.length());
                if (zzg2 == zzg) {
                    int i2 = i + zzg2;
                    this.zze = i2;
                    int zza = zzty.zza(str, this.zzb, i2, zza());
                    this.zze = i;
                    zzb((zza - i) - zzg2);
                    this.zze = zza;
                    return;
                }
                zzb(zzty.zza(str));
                this.zze = zzty.zza(str, this.zzb, this.zze, zza());
            } catch (zzuc e) {
                this.zze = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i) throws IOException {
            if (i >= 0) {
                zzb(i);
            } else {
                zza((long) i);
            }
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(byte b) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                this.zze = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzd(int i) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                int i3 = i2 + 1;
                this.zze = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.zze = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.zze = i5;
                bArr[i4] = (byte) (i >> 16);
                this.zze = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzb(int i) throws IOException {
            if (!zzqk.zzc || zzpv.zza() || zza() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.zzb;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    bArr[i2] = (byte) ((i & SmActions.ACTION_ONTHECALL_ENTRY) | SmActions.ACTION_ONTHECALL_EXIT);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.zzb;
                    int i3 = this.zze;
                    this.zze = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.zzb;
                int i4 = this.zze;
                this.zze = i4 + 1;
                zztv.zza(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.zzb;
                int i5 = this.zze;
                this.zze = i5 + 1;
                zztv.zza(bArr4, (long) i5, (byte) (i | SmActions.ACTION_ONTHECALL_EXIT));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.zzb;
                    int i7 = this.zze;
                    this.zze = i7 + 1;
                    zztv.zza(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.zzb;
                int i8 = this.zze;
                this.zze = i8 + 1;
                zztv.zza(bArr6, (long) i8, (byte) (i6 | SmActions.ACTION_ONTHECALL_EXIT));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.zzb;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    zztv.zza(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.zzb;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zztv.zza(bArr8, (long) i11, (byte) (i9 | SmActions.ACTION_ONTHECALL_EXIT));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.zzb;
                    int i13 = this.zze;
                    this.zze = i13 + 1;
                    zztv.zza(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.zzb;
                int i14 = this.zze;
                this.zze = i14 + 1;
                zztv.zza(bArr10, (long) i14, (byte) (i12 | SmActions.ACTION_ONTHECALL_EXIT));
                byte[] bArr11 = this.zzb;
                int i15 = this.zze;
                this.zze = i15 + 1;
                zztv.zza(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzc(long j) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                int i2 = i + 1;
                this.zze = i2;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                this.zze = i3;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                this.zze = i4;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                this.zze = i5;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                this.zze = i6;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                this.zze = i7;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                this.zze = i8;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.zze = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzb(int i, int i2) throws IOException {
            zza(i, 0);
            zza(i2);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzc(int i, int i2) throws IOException {
            zza(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zze(int i, int i2) throws IOException {
            zza(i, 5);
            zzd(i2);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzc(int i, long j) throws IOException {
            zza(i, 1);
            zzc(j);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i, int i2) throws IOException {
            zzb((i << 3) | i2);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzb(int i, zzpx zzpx) throws IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, zzpx);
            zza(1, 4);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i, long j) throws IOException {
            zza(i, 0);
            zza(j);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i, zzpx zzpx) throws IOException {
            zza(i, 2);
            zza(zzpx);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i, zzsk zzsk) throws IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, 2);
            zza(zzsk);
            zza(1, 4);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i, String str) throws IOException {
            zza(i, 2);
            zza(str);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i, boolean z) throws IOException {
            zza(i, 0);
            zza(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.libraries.places.internal.zzpu
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzb(i2);
            zzc(bArr, 0, i2);
        }

        zza(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                this.zzb = bArr;
                this.zzc = 0;
                this.zze = 0;
                this.zzd = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zze, i2);
                this.zze += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i2)), e);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.libraries.places.internal.zzqk
        public final void zza(int i, zzsk zzsk, zzsx zzsx) throws IOException {
            zza(i, 2);
            zzpo zzpo = (zzpo) zzsk;
            int zze2 = zzpo.zze();
            if (zze2 == -1) {
                zze2 = zzsx.zzd(zzpo);
                zzpo.zza(zze2);
            }
            zzb(zze2);
            zzsx.zza((Object) zzsk, (zzuj) this.zza);
        }
    }

    public static int zzb(String str) {
        int i;
        try {
            i = zzty.zza(str);
        } catch (zzuc unused) {
            i = str.getBytes(zzrc.zza).length;
        }
        return zzg(i) + i;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzuc zzuc) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzuc);
        byte[] bytes = str.getBytes(zzrc.zza);
        try {
            zzb(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        } catch (zzb e2) {
            throw e2;
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqk.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public static zzqk zza(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzc(zzsk zzsk) {
        return zzsk.zzh();
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public static int zze(int i) {
        return zzg(i << 3);
    }

    public static int zzk(int i) {
        return zzf(i);
    }

    public static int zzl(int i) {
        return zzg(i);
    }

    public static int zzf(int i) {
        if (i >= 0) {
            return zzg(i);
        }
        return 10;
    }

    public static int zzh(int i) {
        return zzg(zzm(i));
    }

    public static int zza(zzrp zzrp) {
        int zzb2 = zzrp.zzb();
        return zzg(zzb2) + zzb2;
    }

    public final void zzc(int i) throws IOException {
        zzb(zzm(i));
    }

    public static int zzf(long j) {
        return zze(zzi(j));
    }

    public final void zza(double d) throws IOException {
        zzc(Double.doubleToRawLongBits(d));
    }

    public final void zza(float f) throws IOException {
        zzd(Float.floatToRawIntBits(f));
    }

    public static int zzb(zzpx zzpx) {
        int zza2 = zzpx.zza();
        return zzg(zza2) + zza2;
    }

    public static int zzb(zzsk zzsk) {
        int zzh = zzsk.zzh();
        return zzg(zzh) + zzh;
    }

    public static int zzg(int i, long j) {
        return zze(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zze(i) + 8;
    }

    public static int zzi(int i, int i2) {
        return zze(i) + 4;
    }

    public static int zzj(int i, int i2) {
        return zze(i) + 4;
    }

    public static int zza(int i, zzrp zzrp) {
        int zze = zze(i);
        int zzb2 = zzrp.zzb();
        return zze + zzg(zzb2) + zzb2;
    }

    public static int zzb(int i, double d) {
        return zze(i) + 8;
    }

    public static int zzc(int i, zzpx zzpx) {
        int zze = zze(i);
        int zza2 = zzpx.zza();
        return zze + zzg(zza2) + zza2;
    }

    public static int zzd(int i, long j) {
        return zze(i) + zze(j);
    }

    public static int zze(int i, long j) {
        return zze(i) + zze(j);
    }

    public static int zzg(int i, int i2) {
        return zze(i) + zzg(i2);
    }

    public static int zzk(int i, int i2) {
        return zze(i) + zzf(i2);
    }

    public static int zzb(int i, float f) {
        return zze(i) + 4;
    }

    public static int zzd(int i, zzpx zzpx) {
        return (zze(1) << 1) + zzg(2, i) + zzc(3, zzpx);
    }

    public static int zzf(int i, int i2) {
        return zze(i) + zzf(i2);
    }

    public static int zzh(int i, int i2) {
        return zze(i) + zzg(zzm(i2));
    }

    static int zza(zzsk zzsk, zzsx zzsx) {
        zzpo zzpo = (zzpo) zzsk;
        int zze = zzpo.zze();
        if (zze == -1) {
            zze = zzsx.zzd(zzpo);
            zzpo.zza(zze);
        }
        return zzg(zze) + zze;
    }

    public static int zzb(int i, zzrp zzrp) {
        return (zze(1) << 1) + zzg(2, i) + zza(3, zzrp);
    }

    public static int zzf(int i, long j) {
        return zze(i) + zze(zzi(j));
    }

    public final void zzd(int i, int i2) throws IOException {
        zzc(i, zzm(i2));
    }

    public static int zzb(int i, zzsk zzsk) {
        return (zze(1) << 1) + zzg(2, i) + zze(3) + zzb(zzsk);
    }

    public static int zzb(int i, String str) {
        return zze(i) + zzb(str);
    }

    public static int zzb(int i, boolean z) {
        return zze(i) + 1;
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zza(int i, float f) throws IOException {
        zze(i, Float.floatToRawIntBits(f));
    }

    static int zzc(int i, zzsk zzsk, zzsx zzsx) {
        int zze = zze(i) << 1;
        zzpo zzpo = (zzpo) zzsk;
        int zze2 = zzpo.zze();
        if (zze2 == -1) {
            zze2 = zzsx.zzd(zzpo);
            zzpo.zza(zze2);
        }
        return zze + zze2;
    }

    static int zzb(int i, zzsk zzsk, zzsx zzsx) {
        return zze(i) + zza(zzsk, zzsx);
    }
}
