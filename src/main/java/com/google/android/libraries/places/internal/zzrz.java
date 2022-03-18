package com.google.android.libraries.places.internal;

final class zzrz implements zzsh {
    private zzsh[] zza;

    zzrz(zzsh... zzshArr) {
        this.zza = zzshArr;
    }

    @Override // com.google.android.libraries.places.internal.zzsh
    public final boolean zza(Class<?> cls) {
        for (zzsh zzsh : this.zza) {
            if (zzsh.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzsh
    public final zzsi zzb(Class<?> cls) {
        String str;
        zzsh[] zzshArr = this.zza;
        for (zzsh zzsh : zzshArr) {
            if (zzsh.zza(cls)) {
                return zzsh.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        if (valueOf.length() != 0) {
            str = "No factory is available for message type: ".concat(valueOf);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
