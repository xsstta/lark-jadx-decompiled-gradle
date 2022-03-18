package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

public final class zzij {

    public static final class zza extends zzqy<zza, zzb> implements zzsm {
        private static final zza zzl;
        private static volatile zzsu<zza> zzm;
        private int zzc;
        private int zzd;
        private String zze = "";
        private long zzf;
        private int zzg;
        private String zzh = "";
        private long zzi;
        private long zzj;
        private int zzk;

        /* renamed from: com.google.android.libraries.places.internal.zzij$zza$zza  reason: collision with other inner class name */
        public enum EnumC70236zza implements zzrb {
            UNKNOWN(0),
            DELIVERY(1),
            INTERACTION(2);
            
            private static final zzre<EnumC70236zza> zzd = new zzim();
            private final int zze;

            public static zzrd zzb() {
                return zzin.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private EnumC70236zza(int i) {
                this.zze = i;
            }
        }

        public enum zzc implements zzrb {
            UNKNOWN_CONNECTIVITY_TYPE(0),
            CELL(1),
            WIFI(2);
            
            private static final zzre<zzc> zzd = new zzio();
            private final int zze;

            public static zzrd zzb() {
                return zzip.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.zze = i;
            }
        }

        public enum zzd implements zzrb {
            UNKNOWN_TIMESTAMP_TYPE(0),
            NATIVE(1),
            SUPPLIED(2);
            
            private static final zzre<zzd> zzd = new zzir();
            private final int zze;

            public static zzrd zzb() {
                return zziq.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private zzd(int i) {
                this.zze = i;
            }
        }

        public static final class zzb extends zzqy.zzb<zza, zzb> implements zzsm {
            private zzb() {
                super(zza.zzl);
            }

            /* synthetic */ zzb(zzil zzil) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzl = zza;
            zzqy.zza(zza.class, zza);
        }

        private zza() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzij$zza>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzij.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzb extends zzqy<zzb, zza> implements zzsm {
        private static final zzb zzf;
        private static volatile zzsu<zzb> zzg;
        private int zzc;
        private int zzd;
        private zza zze;

        /* renamed from: com.google.android.libraries.places.internal.zzij$zzb$zzb  reason: collision with other inner class name */
        public enum EnumC70237zzb implements zzrb {
            UNKNOWN(0),
            LIFECYCLE(1);
            
            private static final zzre<EnumC70237zzb> zzc = new zzis();
            private final int zzd;

            public static zzrd zzb() {
                return zziu.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzd;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
            }

            private EnumC70237zzb(int i) {
                this.zzd = i;
            }
        }

        private zzb() {
        }

        public static final class zza extends zzqy.zzb<zzb, zza> implements zzsm {
            private zza() {
                super(zzb.zzf);
            }

            /* synthetic */ zza(zzil zzil) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzf = zzb;
            zzqy.zza(zzb.class, zzb);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzij$zzb>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzij.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
