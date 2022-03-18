package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

public final class zzkh {

    public static final class zza extends zzqy<zza, C70251zza> implements zzsm {
        private static final zza zzg;
        private static volatile zzsu<zza> zzh;
        private int zzc;
        private String zzd = "";
        private int zze;
        private long zzf;

        public enum zzb implements zzrb {
            INVALID(0),
            SHOW_NOTIFICATION(1),
            USER_DISMISSED(2),
            USER_VIEW_DASHBOARD(3);
            
            private static final zzre<zzb> zze = new zzki();
            private final int zzf;

            public static zzrd zzb() {
                return zzkk.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzf;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.zzf = i;
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzkh$zza$zza  reason: collision with other inner class name */
        public static final class C70251zza extends zzqy.zzb<zza, C70251zza> implements zzsm {
            private C70251zza() {
                super(zza.zzg);
            }

            /* synthetic */ C70251zza(zzkg zzkg) {
                this();
            }
        }

        private zza() {
        }

        static {
            zza zza = new zza();
            zzg = zza;
            zzqy.zza(zza.class, zza);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkh$zza>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 120
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkh.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
