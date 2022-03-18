package com.google.android.libraries.places.internal;

final class zzsf {
    private static final zzsd zza = zzc();
    private static final zzsd zzb = new zzsg();

    static zzsd zza() {
        return zza;
    }

    static zzsd zzb() {
        return zzb;
    }

    private static zzsd zzc() {
        try {
            return (zzsd) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
