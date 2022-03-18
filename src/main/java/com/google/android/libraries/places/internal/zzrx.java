package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

/* access modifiers changed from: package-private */
public final class zzrx implements zzta {
    private static final zzsh zzb = new zzsa();
    private final zzsh zza;

    public zzrx() {
        this(new zzrz(zzqz.zza(), zza()));
    }

    private static zzsh zza() {
        try {
            return (zzsh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzb;
        }
    }

    private zzrx(zzsh zzsh) {
        this.zza = (zzsh) zzrc.zza((Object) zzsh, "messageInfoFactory");
    }

    private static boolean zza(zzsi zzsi) {
        if (zzsi.zza() == zzqy.zze.zzh) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzta
    public final <T> zzsx<T> zza(Class<T> cls) {
        zzsz.zza((Class<?>) cls);
        zzsi zzb2 = this.zza.zzb(cls);
        if (zzb2.zzb()) {
            if (zzqy.class.isAssignableFrom(cls)) {
                return zzsn.zza(zzsz.zzc(), zzqq.zza(), zzb2.zzc());
            }
            return zzsn.zza(zzsz.zza(), zzqq.zzb(), zzb2.zzc());
        } else if (zzqy.class.isAssignableFrom(cls)) {
            if (zza(zzb2)) {
                return zzso.zza(cls, zzb2, zzsr.zzb(), zzru.zzb(), zzsz.zzc(), zzqq.zza(), zzsf.zzb());
            }
            return zzso.zza(cls, zzb2, zzsr.zzb(), zzru.zzb(), zzsz.zzc(), null, zzsf.zzb());
        } else if (zza(zzb2)) {
            return zzso.zza(cls, zzb2, zzsr.zza(), zzru.zza(), zzsz.zza(), zzqq.zzb(), zzsf.zza());
        } else {
            return zzso.zza(cls, zzb2, zzsr.zza(), zzru.zza(), zzsz.zzb(), null, zzsf.zza());
        }
    }
}
