package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzpx implements Serializable, Iterable<Byte> {
    public static final zzpx zza = new zzqh(zzrc.zzb);
    private static final zzqd zzb;
    private static final Comparator<zzpx> zzd = new zzpz();
    private int zzc;

    /* access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract int zza();

    /* access modifiers changed from: protected */
    public abstract int zza(int i, int i2, int i3);

    public abstract zzpx zza(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zza(zzpu zzpu) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract boolean zzc();

    zzpx() {
    }

    /* access modifiers changed from: protected */
    public final int zzd() {
        return this.zzc;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzpw(this);
    }

    public final String zzb() {
        Charset charset = zzrc.zza;
        if (zza() == 0) {
            return "";
        }
        return zza(charset);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zza2 = zza();
            i = zza(zza2, 0, zza2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.libraries.places.internal.zzqb] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.libraries.places.internal.zzqg] */
    /* JADX WARNING: Unknown variable types count: 2 */
    static {
        /*
            com.google.android.libraries.places.internal.zzqh r0 = new com.google.android.libraries.places.internal.zzqh
            byte[] r1 = com.google.android.libraries.places.internal.zzrc.zzb
            r0.<init>(r1)
            com.google.android.libraries.places.internal.zzpx.zza = r0
            boolean r0 = com.google.android.libraries.places.internal.zzpv.zza()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.google.android.libraries.places.internal.zzqg r0 = new com.google.android.libraries.places.internal.zzqg
            r0.<init>(r1)
            goto L_0x001b
        L_0x0016:
            com.google.android.libraries.places.internal.zzqb r0 = new com.google.android.libraries.places.internal.zzqb
            r0.<init>(r1)
        L_0x001b:
            com.google.android.libraries.places.internal.zzpx.zzb = r0
            com.google.android.libraries.places.internal.zzpz r0 = new com.google.android.libraries.places.internal.zzpz
            r0.<init>()
            com.google.android.libraries.places.internal.zzpx.zzd = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzpx.<clinit>():void");
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zza());
        if (zza() <= 50) {
            str = zztl.zza(this);
        } else {
            str = String.valueOf(zztl.zza(zza(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    static zzqf zzc(int i) {
        return new zzqf(i, null);
    }

    public static zzpx zza(String str) {
        return new zzqh(str.getBytes(zzrc.zza));
    }

    static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
