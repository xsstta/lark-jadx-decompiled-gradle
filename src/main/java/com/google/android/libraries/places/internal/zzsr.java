package com.google.android.libraries.places.internal;

final class zzsr {
    private static final zzsp zza = zzc();
    private static final zzsp zzb = new zzss();

    static zzsp zza() {
        return zza;
    }

    static zzsp zzb() {
        return zzb;
    }

    private static zzsp zzc() {
        try {
            return (zzsp) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
