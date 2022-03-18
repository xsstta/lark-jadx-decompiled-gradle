package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

final class zzqz implements zzsh {
    private static final zzqz zza = new zzqz();

    private zzqz() {
    }

    public static zzqz zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzsh
    public final boolean zza(Class<?> cls) {
        return zzqy.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.libraries.places.internal.zzsh
    public final zzsi zzb(Class<?> cls) {
        String str;
        String str2;
        if (!zzqy.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            if (valueOf.length() != 0) {
                str2 = "Unsupported message type: ".concat(valueOf);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (zzsi) zzqy.zza(cls.asSubclass(zzqy.class)).zza(zzqy.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            if (valueOf2.length() != 0) {
                str = "Unable to get message info for ".concat(valueOf2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }
}
