package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

public final class zzie {

    public static final class zza extends zzqy<zza, zzb> implements zzsm {
        private static final zza zzf;
        private static volatile zzsu<zza> zzg;
        private int zzc;
        private int zzd;
        private zzc zze;

        public static final class zzc extends zzqy<zzc, C70235zza> implements zzsm {
            private static final zzc zzg;
            private static volatile zzsu<zzc> zzh;
            private int zzc;
            private int zzd;
            private long zze;
            private long zzf;

            public enum zzb implements zzrb {
                UNSPECIFIED(0),
                BACKOFF(1),
                ACCEPT(2),
                REJECT(3);
                
                private static final zzre<zzb> zze = new zzii();
                private final int zzf;

                public static zzrd zzb() {
                    return zzik.zza;
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

            private zzc() {
            }

            /* renamed from: com.google.android.libraries.places.internal.zzie$zza$zzc$zza  reason: collision with other inner class name */
            public static final class C70235zza extends zzqy.zzb<zzc, C70235zza> implements zzsm {
                private C70235zza() {
                    super(zzc.zzg);
                }

                /* synthetic */ C70235zza(zzif zzif) {
                    this();
                }
            }

            static {
                zzc zzc2 = new zzc();
                zzg = zzc2;
                zzqy.zza(zzc.class, zzc2);
            }

            /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzie$zza$zzc>, com.google.android.libraries.places.internal.zzqy$zza] */
            /* access modifiers changed from: protected */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.google.android.libraries.places.internal.zzqy
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                // Method dump skipped, instructions count: 120
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzie.zza.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzie$zza$zza  reason: collision with other inner class name */
        public enum EnumC70234zza implements zzrb {
            UNSPECIFIED(0),
            LOWD(1);
            
            private static final zzre<EnumC70234zza> zzc = new zzih();
            private final int zzd;

            public static zzrd zzb() {
                return zzig.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzd;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
            }

            private EnumC70234zza(int i) {
                this.zzd = i;
            }
        }

        private zza() {
        }

        public static final class zzb extends zzqy.zzb<zza, zzb> implements zzsm {
            private zzb() {
                super(zza.zzf);
            }

            /* synthetic */ zzb(zzif zzif) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzf = zza;
            zzqy.zza(zza.class, zza);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzie$zza>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzie.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
