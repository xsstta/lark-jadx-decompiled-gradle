package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class zzrc {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;
    private static final Charset zzc = Charset.forName("ISO-8859-1");
    private static final ByteBuffer zzd;
    private static final zzqj zze;

    public static int zza(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzd = ByteBuffer.wrap(bArr);
        zze = zzqj.zza(bArr, 0, bArr.length, false);
    }

    static <T> T zza(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static int zzc(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    static boolean zza(zzsk zzsk) {
        if (!(zzsk instanceof zzpq)) {
            return false;
        }
        zzpq zzpq = (zzpq) zzsk;
        return false;
    }

    public static boolean zza(byte[] bArr) {
        return zzty.zza(bArr);
    }

    static Object zza(Object obj, Object obj2) {
        return ((zzsk) obj).zzl().zza((zzsk) obj2).zze();
    }

    static <T> T zza(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
