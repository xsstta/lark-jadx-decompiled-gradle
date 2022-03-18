package com.google.android.libraries.places.internal;

public final class zzh {
    private final String zza;

    public final String toString() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    private zzh(String str) {
        this.zza = str;
    }

    public static zzh zza(String str) {
        return new zzh((String) zzft.zza(str));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzh) {
            return this.zza.equals(((zzh) obj).zza);
        }
        return false;
    }

    public static zzh zza(zzh zzh, zzh zzh2) {
        String str;
        String valueOf = String.valueOf(zzh.zza);
        String valueOf2 = String.valueOf(zzh2.zza);
        if (valueOf2.length() != 0) {
            str = valueOf.concat(valueOf2);
        } else {
            str = new String(valueOf);
        }
        return new zzh(str);
    }
}
