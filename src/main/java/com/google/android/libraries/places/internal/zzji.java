package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzhj;
import com.google.android.libraries.places.internal.zzic;
import com.google.android.libraries.places.internal.zzqy;

public final class zzji {

    public static final class zzb extends zzqy<zzb, C70245zzb> implements zzsm {
        private static final zzb zzl;
        private static volatile zzsu<zzb> zzm;
        private int zzc;
        private zzri zzd = zzj();
        private zzri zze = zzj();
        private zzri zzf = zzj();
        private zzri zzg = zzj();
        private zzri zzh = zzj();
        private int zzi;
        private int zzj;
        private int zzk;

        public enum zza implements zzrb {
            FLP18_ORIENTATION_VERSION_UNSPECIFIED(0),
            INTERNAL_INERTIAL_ANCHOR(1),
            INTERNAL_NOT_SUPPORTED(2),
            INTERNAL_NULL(3),
            FOP_ORIENTATION_ENGINE(4),
            FOP_ORIENTATION_ENGINE_NOT_SUPPORTED(5);
            
            private static final zzre<zza> zzg = new zzjl();
            private final int zzh;

            public static zzrd zzb() {
                return zzjk.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzh;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            private zza(int i) {
                this.zzh = i;
            }
        }

        public enum zzc implements zzrb {
            FLP_VERSION_UNSPECIFIED(0),
            SIXTEEN(1),
            SEVENTEEN(2),
            EIGHTEEN(3);
            
            private static final zzre<zzc> zze = new zzjm();
            private final int zzf;

            public static zzrd zzb() {
                return zzjn.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzf;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.zzf = i;
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzji$zzb$zzb  reason: collision with other inner class name */
        public static final class C70245zzb extends zzqy.zzb<zzb, C70245zzb> implements zzsm {
            private C70245zzb() {
                super(zzb.zzl);
            }

            /* synthetic */ C70245zzb(zzjj zzjj) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzl = zzb;
            zzqy.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzb>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 156
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzd extends zzqy<zzd, zzb> implements zzsm {
        private static final zzd zzl;
        private static volatile zzsu<zzd> zzm;
        private int zzc;
        private int zzd;
        private long zze;
        private zza zzf;
        private long zzg;
        private int zzh;
        private zzrg zzi = zzi();
        private zzrg zzj = zzi();
        private int zzk;

        public enum zza implements zzrb {
            UNKNOWN(0),
            SUCCESS(1),
            FAILURE(2),
            STARTUP(3);
            
            private static final zzre<zza> zze = new zzjp();
            private final int zzf;

            public static zzrd zzb() {
                return zzjo.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzf;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            private zza(int i) {
                this.zzf = i;
            }
        }

        public static final class zzb extends zzqy.zzb<zzd, zzb> implements zzsm {
            private zzb() {
                super(zzd.zzl);
            }

            /* synthetic */ zzb(zzjj zzjj) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzl = zzd2;
            zzqy.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzd>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 148
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzd.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzh extends zzqy<zzh, zza> implements zzsm {
        private static final zzh zzh;
        private static volatile zzsu<zzh> zzi;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public enum zzb implements zzrb {
            UNKNOWN_CARRIER_FREQUENCY_BAND(0),
            GPS_L1(1),
            GPS_L5(2),
            GAL_E1(3),
            GAL_E5(4),
            GLO_G1(5),
            BDS_B1(6),
            BDS_B2(7),
            QZS_J1(8),
            QZS_J5(9);
            
            private static final zzre<zzb> zzk = new zzjq();
            private final int zzl;

            public static zzrd zzb() {
                return zzjr.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzl;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzl + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.zzl = i;
            }
        }

        public enum zzc implements zzrb {
            UNKNOWN_CONSTELLATION(0),
            GPS(1),
            SBAS(2),
            GLO(3),
            QZSS(4),
            BDS(5),
            GAL(6),
            IRNSS(7);
            
            private static final zzre<zzc> zzi = new zzjt();
            private final int zzj;

            public static zzrd zzb() {
                return zzjs.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzj;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.zzj = i;
            }
        }

        private zzh() {
        }

        public static final class zza extends zzqy.zzb<zzh, zza> implements zzsm {
            private zza() {
                super(zzh.zzh);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzh zzh2 = new zzh();
            zzh = zzh2;
            zzqy.zza(zzh.class, zzh2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzh>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 132
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzh.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzj extends zzqy<zzj, zza> implements zzsm {
        private static final zzj zzo;
        private static volatile zzsu<zzj> zzp;
        private int zzc;
        private zzi zzd;
        private zzrh<zzk> zze = zzk();
        private zze zzf;
        private zze zzg;
        private zzic.zza zzh;
        private int zzi;
        private zzf zzj;
        private zzd zzk;
        private zzc zzl;
        private zzg zzm;
        private zzrh<zzh> zzn = zzk();

        public enum zzb implements zzrb {
            UNKNOWN_FLP_EVENT(0),
            AGGREGATE_STATS_AND_JUMPS(1),
            GET_LAST_LOCATION_SAMPLE(2),
            REPORT_LOCATION_TO_CLIENT_SAMPLE(3),
            LATENCY_SAMPLE(4),
            LOCATION_AVAILABILITY_SAMPLE(5),
            BATTERY_USAGE_INFO_SAMPLE(6),
            RELATIVE_DISTANCE_BETWEEN_CONSECUTIVE_LOCATIONS(7),
            GNSS_SIGNAL_TYPE(8);
            
            private static final zzre<zzb> zzj = new zzju();
            private final int zzk;

            public static zzrd zzb() {
                return zzjv.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzk;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzk + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.zzk = i;
            }
        }

        public static final class zza extends zzqy.zzb<zzj, zza> implements zzsm {
            private zza() {
                super(zzj.zzo);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzj zzj2 = new zzj();
            zzo = zzj2;
            zzqy.zza(zzj.class, zzj2);
        }

        private zzj() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzj>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 178
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzj.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zza extends zzqy<zza, C70244zza> implements zzsm {
        private static final zza zzh;
        private static volatile zzsu<zza> zzi;
        private int zzc;
        private boolean zzd;
        private boolean zze;
        private int zzf;
        private int zzg;

        private zza() {
        }

        /* renamed from: com.google.android.libraries.places.internal.zzji$zza$zza  reason: collision with other inner class name */
        public static final class C70244zza extends zzqy.zzb<zza, C70244zza> implements zzsm {
            private C70244zza() {
                super(zza.zzh);
            }

            /* synthetic */ C70244zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzh = zza;
            zzqy.zza(zza.class, zza);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zza>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zze extends zzqy<zze, zza> implements zzsm {
        private static final zze zzt;
        private static volatile zzsu<zze> zzu;
        private int zzc;
        private long zzd;
        private zzhj.zza zze;
        private boolean zzf;
        private boolean zzg;
        private long zzh;
        private long zzi;
        private long zzj;
        private long zzk;
        private long zzl;
        private boolean zzm;
        private int zzn;
        private long zzo;
        private int zzp;
        private int zzq;
        private int zzr;
        private int zzs;

        private zze() {
        }

        public static final class zza extends zzqy.zzb<zze, zza> implements zzsm {
            private zza() {
                super(zze.zzt);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzt = zze2;
            zzqy.zza(zze.class, zze2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zze>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 188
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zze.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzf extends zzqy<zzf, zza> implements zzsm {
        private static final zzf zzi;
        private static volatile zzsu<zzf> zzj;
        private int zzc;
        private long zzd;
        private zza zze;
        private long zzf;
        private int zzg;
        private boolean zzh;

        private zzf() {
        }

        public static final class zza extends zzqy.zzb<zzf, zza> implements zzsm {
            private zza() {
                super(zzf.zzi);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzi = zzf2;
            zzqy.zza(zzf.class, zzf2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzf>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzf.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzg extends zzqy<zzg, zza> implements zzsm {
        private static final zzg zzj;
        private static volatile zzsu<zzg> zzk;
        private int zzc;
        private long zzd;
        private int zze;
        private float zzf;
        private int zzg;
        private float zzh;
        private float zzi;

        private zzg() {
        }

        public static final class zza extends zzqy.zzb<zzg, zza> implements zzsm {
            private zza() {
                super(zzg.zzj);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzj = zzg2;
            zzqy.zza(zzg.class, zzg2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzg>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzg.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzk extends zzqy<zzk, zza> implements zzsm {
        private static final zzk zzi;
        private static volatile zzsu<zzk> zzj;
        private int zzc;
        private long zzd;
        private int zze;
        private int zzf;
        private float zzg;
        private float zzh;

        private zzk() {
        }

        public static final class zza extends zzqy.zzb<zzk, zza> implements zzsm {
            private zza() {
                super(zzk.zzi);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzk zzk = new zzk();
            zzi = zzk;
            zzqy.zza(zzk.class, zzk);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzk>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzk.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzl extends zzqy<zzl, zza> implements zzsm {
        private static final zzl zzg;
        private static volatile zzsu<zzl> zzh;
        private int zzc;
        private int zzd;
        private long zze;
        private int zzf;

        private zzl() {
        }

        public static final class zza extends zzqy.zzb<zzl, zza> implements zzsm {
            private zza() {
                super(zzl.zzg);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzl zzl = new zzl();
            zzg = zzl;
            zzqy.zza(zzl.class, zzl);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzl>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzl.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzm extends zzqy<zzm, zza> implements zzsm {
        private static final zzm zzh;
        private static volatile zzsu<zzm> zzi;
        private int zzc;
        private int zzd;
        private int zze;
        private long zzf;
        private long zzg;

        private zzm() {
        }

        public static final class zza extends zzqy.zzb<zzm, zza> implements zzsm {
            private zza() {
                super(zzm.zzh);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzm zzm = new zzm();
            zzh = zzm;
            zzqy.zza(zzm.class, zzm);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzm>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzm.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzc extends zzqy<zzc, zza> implements zzsm {
        private static final zzc zzl;
        private static volatile zzsu<zzc> zzm;
        private int zzc;
        private int zzd;
        private int zze;
        private long zzf;
        private int zzg;
        private boolean zzh;
        private long zzi;
        private zzhj.zza zzj;
        private zzrh<zzhj.zza> zzk = zzk();

        public static final class zza extends zzqy.zzb<zzc, zza> implements zzsm {
            private zza() {
                super(zzc.zzl);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzl = zzc2;
            zzqy.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzc>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 146
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzi extends zzqy<zzi, zza> implements zzsm {
        private static final zzi zzr;
        private static volatile zzsu<zzi> zzs;
        private int zzc;
        private long zzd;
        private zzrh<zzl> zze = zzk();
        private zzrh<zzm> zzf = zzk();
        private long zzg;
        private long zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private long zzl;
        private long zzm;
        private int zzn;
        private int zzo;
        private long zzp;
        private zzb zzq;

        public static final class zza extends zzqy.zzb<zzi, zza> implements zzsm {
            private zza() {
                super(zzi.zzr);
            }

            /* synthetic */ zza(zzjj zzjj) {
                this();
            }
        }

        static {
            zzi zzi2 = new zzi();
            zzr = zzi2;
            zzqy.zza(zzi.class, zzi2);
        }

        private zzi() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzji$zzi>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 188
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzji.zzi.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
