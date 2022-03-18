package com.google.android.libraries.places.internal;

import java.io.IOException;

public abstract class zzha {
    private static final zzha zza = new zzhf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzha zzb = new zzhf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzha zzc = new zzhe("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzha zzd = new zzhe("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzha zze = new zzhc("base16()", "0123456789ABCDEF");

    /* access modifiers changed from: package-private */
    public abstract int zza(int i);

    /* access modifiers changed from: package-private */
    public abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    zzha() {
    }

    public static zzha zza() {
        return zze;
    }

    public final String zza(byte[] bArr, int i, int i2) {
        zzft.zza(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zza(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
