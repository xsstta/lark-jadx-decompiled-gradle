package com.google.android.libraries.places.internal;

final class zzpv {
    private static final Class<?> zza = zza("libcore.io.Memory");
    private static final boolean zzb;

    static Class<?> zzb() {
        return zza;
    }

    static boolean zza() {
        if (zza == null || zzb) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        if (zza("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        zzb = z;
    }

    private static <T> Class<T> zza(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
