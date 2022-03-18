package com.google.android.libraries.places.internal;

final class zzqq {
    private static final zzqo<?> zza = new zzqr();
    private static final zzqo<?> zzb = zzc();

    static zzqo<?> zza() {
        return zza;
    }

    static zzqo<?> zzb() {
        zzqo<?> zzqo = zzb;
        if (zzqo != null) {
            return zzqo;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static zzqo<?> zzc() {
        try {
            return (zzqo) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
