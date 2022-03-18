package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

public final class zzhv {

    public static final class zzb extends zzqy<zzb, zza> implements zzsm {
        private static final zzb zzi;
        private static volatile zzsu<zzb> zzj;
        private int zzc;
        private int zzd;
        private zzc zze;
        private zzf zzf;
        private zzd zzg;
        private zze zzh;

        /* renamed from: com.google.android.libraries.places.internal.zzhv$zzb$zzb  reason: collision with other inner class name */
        public enum EnumC70232zzb implements zzrb {
            UNKNOWN_CHRE_EVENT(0),
            CURRENT_STATE(1),
            REBOOT(2),
            ERROR(3),
            MESSAGE(4);
            
            private static final zzre<EnumC70232zzb> zzf = new zzhw();
            private final int zzg;

            public static zzrd zzb() {
                return zzhx.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzg;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            private EnumC70232zzb(int i) {
                this.zzg = i;
            }
        }

        private zzb() {
        }

        public static final class zza extends zzqy.zzb<zzb, zza> implements zzsm {
            private zza() {
                super(zzb.zzi);
            }

            /* synthetic */ zza(zzhu zzhu) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzi = zzb;
            zzqy.zza(zzb.class, zzb);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhv$zzb>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 130
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhv.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzd extends zzqy<zzd, zzb> implements zzsm {
        private static final zzd zzf;
        private static volatile zzsu<zzd> zzg;
        private int zzc;
        private int zzd;
        private String zze = "";

        public enum zza implements zzrb {
            UNKNOWN_ERROR(0),
            LOAD(1),
            UNLOAD(2);
            
            private static final zzre<zza> zzd = new zzhz();
            private final int zze;

            public static zzrd zzb() {
                return zzhy.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private zza(int i) {
                this.zze = i;
            }
        }

        public static final class zzb extends zzqy.zzb<zzd, zzb> implements zzsm {
            private zzb() {
                super(zzd.zzf);
            }

            /* synthetic */ zzb(zzhu zzhu) {
                this();
            }
        }

        private zzd() {
        }

        static {
            zzd zzd2 = new zzd();
            zzf = zzd2;
            zzqy.zza(zzd.class, zzd2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhv$zzd>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhv.zzd.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zze extends zzqy<zze, zza> implements zzsm {
        private static final zze zzg;
        private static volatile zzsu<zze> zzh;
        private int zzc;
        private zza zzd;
        private int zze;
        private int zzf;

        public enum zzb implements zzrb {
            UNKNOWN_DIRECTION(0),
            AP_TO_CHRE(1),
            CHRE_TO_AP(2);
            
            private static final zzre<zzb> zzd = new zzia();
            private final int zze;

            public static zzrd zzb() {
                return zzib.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.zze = i;
            }
        }

        private zze() {
        }

        public static final class zza extends zzqy.zzb<zze, zza> implements zzsm {
            private zza() {
                super(zze.zzg);
            }

            /* synthetic */ zza(zzhu zzhu) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzg = zze2;
            zzqy.zza(zze.class, zze2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhv$zze>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 120
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhv.zze.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zza extends zzqy<zza, C70231zza> implements zzsm {
        private static final zza zzf;
        private static volatile zzsu<zza> zzg;
        private int zzc;
        private long zzd;
        private int zze;

        private zza() {
        }

        /* renamed from: com.google.android.libraries.places.internal.zzhv$zza$zza  reason: collision with other inner class name */
        public static final class C70231zza extends zzqy.zzb<zza, C70231zza> implements zzsm {
            private C70231zza() {
                super(zza.zzf);
            }

            /* synthetic */ C70231zza(zzhu zzhu) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzf = zza;
            zzqy.zza(zza.class, zza);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhv$zza>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhv.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzf extends zzqy<zzf, zza> implements zzsm {
        private static final zzf zze;
        private static volatile zzsu<zzf> zzf;
        private int zzc;
        private long zzd;

        private zzf() {
        }

        public static final class zza extends zzqy.zzb<zzf, zza> implements zzsm {
            private zza() {
                super(zzf.zze);
            }

            /* synthetic */ zza(zzhu zzhu) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zze = zzf2;
            zzqy.zza(zzf.class, zzf2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhv$zzf>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhv.zzf.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzc extends zzqy<zzc, zza> implements zzsm {
        private static final zzc zzf;
        private static volatile zzsu<zzc> zzg;
        private int zzc;
        private zzrh<zza> zzd = zzk();
        private int zze;

        public static final class zza extends zzqy.zzb<zzc, zza> implements zzsm {
            private zza() {
                super(zzc.zzf);
            }

            /* synthetic */ zza(zzhu zzhu) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzf = zzc2;
            zzqy.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhv$zzc>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhv.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
