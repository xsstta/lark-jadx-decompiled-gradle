package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

public final class zzkm {

    public static final class zzb extends zzqy<zzb, C70254zzb> implements zzsm {
        private static final zzb zzj;
        private static volatile zzsu<zzb> zzk;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private boolean zzh;
        private int zzi;

        public enum zza implements zzrb {
            NOT_REQUIRED(0),
            ISSUED(1),
            REQUIRED_BUT_GPS_SPEED_TOO_HIGH(2),
            REQUIRED_BUT_RECENTLY_MADE(3),
            REQUIRED_BUT_USER_ON_THE_GO(4),
            REQUIRED_BUT_USER_IN_TRANSIT(5);
            
            private static final zzre<zza> zzg = new zzkp();
            private final int zzh;

            public static zzrd zzb() {
                return zzko.zza;
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

        private zzb() {
        }

        /* renamed from: com.google.android.libraries.places.internal.zzkm$zzb$zzb  reason: collision with other inner class name */
        public static final class C70254zzb extends zzqy.zzb<zzb, C70254zzb> implements zzsm {
            private C70254zzb() {
                super(zzb.zzj);
            }

            /* synthetic */ C70254zzb(zzkn zzkn) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzj = zzb;
            zzqy.zza(zzb.class, zzb);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzb>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzc extends zzqy<zzc, zza> implements zzsm {
        private static final zzc zzg;
        private static volatile zzsu<zzc> zzh;
        private int zzc;
        private int zzd;
        private zze zze;
        private zza zzf;

        public enum zzb implements zzrb {
            UNKNOWN(0),
            LOCATION_WITH_WIFI(1),
            BLE_BEACON(2);
            
            private static final zzre<zzb> zzd = new zzkq();
            private final int zze;

            public static zzrd zzb() {
                return zzkr.zza;
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

        private zzc() {
        }

        public static final class zza extends zzqy.zzb<zzc, zza> implements zzsm {
            private zza() {
                super(zzc.zzg);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzg = zzc2;
            zzqy.zza(zzc.class, zzc2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzc>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 120
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzd extends zzqy<zzd, zzb> implements zzsm {
        private static final zzd zzg;
        private static volatile zzsu<zzd> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;

        public enum zza implements zzrb {
            UNKNOWN_COMPONENT(0),
            CENTRAL_ENGINE(1),
            ANONYMOUS_ENGINE(2),
            PERSONALIZED_ENGINE(3);
            
            private static final zzre<zza> zze = new zzkt();
            private final int zzf;

            public static zzrd zzb() {
                return zzks.zza;
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

        public enum zzc implements zzrb {
            UNKNOWN_MODE(0),
            ZERO_POWER(1),
            STATE_ONLY(2),
            FULL_INFERENCE(3);
            
            private static final zzre<zzc> zze = new zzku();
            private final int zzf;

            public static zzrd zzb() {
                return zzkv.zza;
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

        /* renamed from: com.google.android.libraries.places.internal.zzkm$zzd$zzd  reason: collision with other inner class name */
        public enum EnumC70255zzd implements zzrb {
            UNKNOWN_STATE_CHANGE(0),
            STARTED(1),
            STOPPED(2);
            
            private static final zzre<EnumC70255zzd> zzd = new zzkx();
            private final int zze;

            public static zzrd zzb() {
                return zzkw.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private EnumC70255zzd(int i) {
                this.zze = i;
            }
        }

        private zzd() {
        }

        public static final class zzb extends zzqy.zzb<zzd, zzb> implements zzsm {
            private zzb() {
                super(zzd.zzg);
            }

            /* synthetic */ zzb(zzkn zzkn) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzg = zzd2;
            zzqy.zza(zzd.class, zzd2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzd>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzd.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzf extends zzqy<zzf, zza> implements zzsm {
        private static final zzf zzg;
        private static volatile zzsu<zzf> zzh;
        private int zzc;
        private int zzd;
        private boolean zze;
        private long zzf;

        public enum zzb implements zzrb {
            UNKNOWN_TYPE(0),
            IO_EXCEPTION(1),
            FILE_NOT_FOUND(2);
            
            private static final zzre<zzb> zzd = new zzky();
            private final int zze;

            public static zzrd zzb() {
                return zzkz.zza;
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

        private zzf() {
        }

        public static final class zza extends zzqy.zzb<zzf, zza> implements zzsm {
            private zza() {
                super(zzf.zzg);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzg = zzf2;
            zzqy.zza(zzf.class, zzf2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzf>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 120
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzf.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzg extends zzqy<zzg, zzb> implements zzsm {
        private static final zzg zzh;
        private static volatile zzsu<zzg> zzi;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public enum zza implements zzrb {
            UNDEFINED_SOURCE(0),
            INTERNAL_STORAGE(1),
            MOBILE_DATA_DOWNLOAD(2),
            APK(3),
            SERVER_DOWNLOAD(4);
            
            private static final zzre<zza> zzf = new zzlb();
            private final int zzg;

            public static zzrd zzb() {
                return zzla.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzg;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            private zza(int i) {
                this.zzg = i;
            }
        }

        public enum zzc implements zzrb {
            UNDEFINED_STATUS(0),
            SUCCESS(1),
            NO_FILE_AVAILABLE(2),
            PARSING_FAILED(3),
            SERVER_REQUEST_FAILED(4),
            MDD_CONNECTION_FAILED(5),
            FILE_READ_FAILED(6);
            
            private static final zzre<zzc> zzh = new zzlc();
            private final int zzi;

            public static zzrd zzb() {
                return zzle.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzi;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.zzi = i;
            }
        }

        private zzg() {
        }

        public static final class zzb extends zzqy.zzb<zzg, zzb> implements zzsm {
            private zzb() {
                super(zzg.zzh);
            }

            /* synthetic */ zzb(zzkn zzkn) {
                this();
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzh = zzg2;
            zzqy.zza(zzg.class, zzg2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzg>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzg.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzh extends zzqy<zzh, zzc> implements zzsm {
        private static final zzh zzm;
        private static volatile zzsu<zzh> zzn;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private zzq zzh;
        private zzk zzi;
        private zzp zzj;
        private int zzk;
        private int zzl;

        public enum zza implements zzrb {
            UNKNOWN_STATUS(0),
            LOW_BATTERY(1),
            NORMAL_BATTERY(2),
            CHARGING(3);
            
            private static final zzre<zza> zze = new zzli();
            private final int zzf;

            public static zzrd zzb() {
                return zzlh.zza;
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

        public enum zzb implements zzrb {
            UNKNOWN(0),
            WLAN(1),
            MOBILE(2),
            OTHER(3);
            
            private static final zzre<zzb> zze = new zzlk();
            private final int zzf;

            public static zzrd zzb() {
                return zzlj.zza;
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

        public enum zzd implements zzrb {
            UNKNOWN_NETWORK_REQUEST(0),
            PLACE_INFO_REQUEST(1),
            PERSONALIZED_PLACE_INFO_REQUEST(2),
            PLACE_INFERENCE_MODEL_WEIGHTS_REQUEST(3);
            
            private static final zzre<zzd> zze = new zzll();
            private final int zzf;

            public static zzrd zzb() {
                return zzlm.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzf;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            private zzd(int i) {
                this.zzf = i;
            }
        }

        public enum zze implements zzrb {
            UNKNOWN_SERVER_TYPE(0),
            PLACES_SERVER(1),
            SEMANTIC_LOCATION_SERVER(2);
            
            private static final zzre<zze> zzd = new zzlo();
            private final int zze;

            public static zzrd zzb() {
                return zzln.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private zze(int i) {
                this.zze = i;
            }
        }

        public enum zzf implements zzrb {
            UNKNOWN_REQUEST_STATUS(0),
            SUCCESS(1),
            TIMEOUT(2),
            NETWORK_ERROR(3);
            
            private static final zzre<zzf> zze = new zzlp();
            private final int zzf;

            public static zzrd zzb() {
                return zzlq.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzf;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            private zzf(int i) {
                this.zzf = i;
            }
        }

        private zzh() {
        }

        public static final class zzc extends zzqy.zzb<zzh, zzc> implements zzsm {
            private zzc() {
                super(zzh.zzm);
            }

            /* synthetic */ zzc(zzkn zzkn) {
                this();
            }
        }

        static {
            zzh zzh2 = new zzh();
            zzm = zzh2;
            zzqy.zza(zzh.class, zzh2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzh>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 186
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzh.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzj extends zzqy<zzj, zzb> implements zzsm {
        private static final zzj zzl;
        private static volatile zzsu<zzj> zzm;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private boolean zzi;
        private int zzj;
        private int zzk;

        public enum zza implements zzrb {
            CONTEXT_MANAGER(0),
            MDH(1);
            
            private static final zzre<zza> zzc = new zzls();
            private final int zzd;

            public static zzrd zzb() {
                return zzlr.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzd;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
            }

            private zza(int i) {
                this.zzd = i;
            }
        }

        public enum zzc implements zzrb {
            SUCCESS(0),
            PROTO_PARSING_ERROR(1),
            REQUEST_FAILED(2);
            
            private static final zzre<zzc> zzd = new zzlt();
            private final int zze;

            public static zzrd zzb() {
                return zzlu.zza;
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

        private zzj() {
        }

        public static final class zzb extends zzqy.zzb<zzj, zzb> implements zzsm {
            private zzb() {
                super(zzj.zzl);
            }

            /* synthetic */ zzb(zzkn zzkn) {
                this();
            }
        }

        static {
            zzj zzj2 = new zzj();
            zzl = zzj2;
            zzqy.zza(zzj.class, zzj2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzj>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 156
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzj.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzn extends zzqy<zzn, zzb> implements zzsm {
        private static final zzn zzp;
        private static volatile zzsu<zzn> zzq;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private boolean zzh;
        private int zzi;
        private int zzj;
        private int zzk;
        private zzrh<zza> zzl = zzk();
        private int zzm;
        private int zzn;
        private int zzo;

        public static final class zza extends zzqy<zza, C70256zza> implements zzsm {
            private static final zza zzg;
            private static volatile zzsu<zza> zzh;
            private int zzc;
            private int zzd;
            private int zze;
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.libraries.places.internal.zzkm$zzn$zza$zza  reason: collision with other inner class name */
            public static final class C70256zza extends zzqy.zzb<zza, C70256zza> implements zzsm {
                private C70256zza() {
                    super(zza.zzg);
                }

                /* synthetic */ C70256zza(zzkn zzkn) {
                    this();
                }
            }

            static {
                zza zza = new zza();
                zzg = zza;
                zzqy.zza(zza.class, zza);
            }

            /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzn$zza>] */
            /* access modifiers changed from: protected */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.google.android.libraries.places.internal.zzqy
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                // Method dump skipped, instructions count: 112
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzn.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        public static final class zzb extends zzqy.zzb<zzn, zzb> implements zzsm {
            private zzb() {
                super(zzn.zzp);
            }

            /* synthetic */ zzb(zzkn zzkn) {
                this();
            }
        }

        static {
            zzn zzn2 = new zzn();
            zzp = zzn2;
            zzqy.zza(zzn.class, zzn2);
        }

        private zzn() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzn>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 178
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzn.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzo extends zzqy<zzo, zzb> implements zzsm {
        private static final zzo zzw;
        private static volatile zzsu<zzo> zzx;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private boolean zzh;
        private zzrg zzi = zzi();
        private int zzj;
        private zzh zzk;
        private zzn zzl;
        private zzb zzm;
        private zzl zzn;
        private zzj zzo;
        private zzm zzp;
        private zzc zzq;
        private zzd zzr;
        private zzr zzs;
        private zzs zzt;
        private zzg zzu;
        private zzf zzv;

        public enum zza implements zzrb {
            UNKNOWN_EVENT_TYPE(0),
            NETWORK_REQUEST(1),
            PLACE_INFERENCE_COMPUTATION(2),
            CANDIDATE_SELECTION(3),
            PLACE_INDEX(4),
            PERSONAL_PLACES_UPDATE(5),
            PLACE_INDEX_FREE_SPACE(6),
            INCOMING_SIGNAL(7),
            LIFECYCLE(8),
            PREFETCH(9),
            SEGMENTER(10),
            MODEL_LOAD(11),
            MAPPED_BYTE_BUFFER_ERROR(12);
            
            private static final zzre<zza> zzn = new zzlw();
            private final int zzo;

            public static zzrd zzb() {
                return zzlv.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzo;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzo + " name=" + name() + '>';
            }

            private zza(int i) {
                this.zzo = i;
            }
        }

        public enum zzc implements zzrb {
            UNKWNOWN_POWER_MODE(0),
            HIGH_POWER(1),
            BALANCED_POWER(2),
            LOW_POWER(3),
            NO_POWER(4);
            
            private static final zzre<zzc> zzf = new zzlx();
            private final int zzg;

            public static zzrd zzb() {
                return zzly.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzg;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.zzg = i;
            }
        }

        public static final class zzb extends zzqy.zzb<zzo, zzb> implements zzsm {
            private zzb() {
                super(zzo.zzw);
            }

            /* synthetic */ zzb(zzkn zzkn) {
                this();
            }
        }

        static {
            zzo zzo2 = new zzo();
            zzw = zzo2;
            zzqy.zza(zzo.class, zzo2);
        }

        private zzo() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzo>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzo.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzr extends zzqy<zzr, zzb> implements zzsm {
        private static final zzr zze;
        private static volatile zzsu<zzr> zzf;
        private int zzc;
        private int zzd;

        public enum zza implements zzrb {
            UNKNOWN(0),
            SCHEDULE(1),
            TRIGGERED(2),
            CANCEL(3);
            
            private static final zzre<zza> zze = new zzma();
            private final int zzf;

            public static zzrd zzb() {
                return zzlz.zza;
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

        private zzr() {
        }

        public static final class zzb extends zzqy.zzb<zzr, zzb> implements zzsm {
            private zzb() {
                super(zzr.zze);
            }

            /* synthetic */ zzb(zzkn zzkn) {
                this();
            }
        }

        static {
            zzr zzr = new zzr();
            zze = zzr;
            zzqy.zza(zzr.class, zzr);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzr>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 110
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzr.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzs extends zzqy<zzs, zza> implements zzsm {
        private static final zzs zzj;
        private static volatile zzsu<zzs> zzk;
        private int zzc;
        private int zzd;
        private zzb zze;
        private zzb zzf;
        private int zzg;
        private zzt zzh;
        private zzi zzi;

        public static final class zzb extends zzqy<zzb, zza> implements zzsm {
            private static final zzb zzf;
            private static volatile zzsu<zzb> zzg;
            private int zzc;
            private int zzd;
            private long zze;

            /* renamed from: com.google.android.libraries.places.internal.zzkm$zzs$zzb$zzb  reason: collision with other inner class name */
            public enum EnumC70257zzb implements zzrb {
                UNKNOWN(0),
                AT_PLACE(1),
                IN_TRANSIT(2);
                
                private static final zzre<EnumC70257zzb> zzd = new zzmb();
                private final int zze;

                public static zzrd zzb() {
                    return zzmc.zza;
                }

                @Override // com.google.android.libraries.places.internal.zzrb
                public final int zza() {
                    return this.zze;
                }

                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
                }

                private EnumC70257zzb(int i) {
                    this.zze = i;
                }
            }

            private zzb() {
            }

            public static final class zza extends zzqy.zzb<zzb, zza> implements zzsm {
                private zza() {
                    super(zzb.zzf);
                }

                /* synthetic */ zza(zzkn zzkn) {
                    this();
                }
            }

            static {
                zzb zzb = new zzb();
                zzf = zzb;
                zzqy.zza(zzb.class, zzb);
            }

            /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzs$zzb>, com.google.android.libraries.places.internal.zzqy$zza] */
            /* access modifiers changed from: protected */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.google.android.libraries.places.internal.zzqy
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                // Method dump skipped, instructions count: 114
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzs.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        public enum zzc implements zzrb {
            UNKNOWN_EVENT_TYPE(0),
            NEW_SEGMENT(1),
            EXTEND_SEGMENT(2);
            
            private static final zzre<zzc> zzd = new zzme();
            private final int zze;

            public static zzrd zzb() {
                return zzmd.zza;
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
            UNKNOWN(0),
            SIMPLE_SEGMENTER(1),
            ON_THE_GO_SEGMENTER(2);
            
            private static final zzre<zzd> zzd = new zzmf();
            private final int zze;

            public static zzrd zzb() {
                return zzmg.zza;
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

        private zzs() {
        }

        public static final class zza extends zzqy.zzb<zzs, zza> implements zzsm {
            private zza() {
                super(zzs.zzj);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzs zzs = new zzs();
            zzj = zzs;
            zzqy.zza(zzs.class, zzs);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzs>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzs.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zza extends zzqy<zza, C70253zza> implements zzsm {
        private static final zza zze;
        private static volatile zzsu<zza> zzf;
        private int zzc;
        private int zzd;

        private zza() {
        }

        /* renamed from: com.google.android.libraries.places.internal.zzkm$zza$zza  reason: collision with other inner class name */
        public static final class C70253zza extends zzqy.zzb<zza, C70253zza> implements zzsm {
            private C70253zza() {
                super(zza.zze);
            }

            /* synthetic */ C70253zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zze = zza;
            zzqy.zza(zza.class, zza);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zza>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zze extends zzqy<zze, zza> implements zzsm {
        private static final zze zzi;
        private static volatile zzsu<zze> zzj;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;

        private zze() {
        }

        public static final class zza extends zzqy.zzb<zze, zza> implements zzsm {
            private zza() {
                super(zze.zzi);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzi = zze2;
            zzqy.zza(zze.class, zze2);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zze>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zze.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzi extends zzqy<zzi, zza> implements zzsm {
        private static final zzi zze;
        private static volatile zzsu<zzi> zzf;
        private int zzc;
        private int zzd;

        private zzi() {
        }

        public static final class zza extends zzqy.zzb<zzi, zza> implements zzsm {
            private zza() {
                super(zzi.zze);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzi zzi = new zzi();
            zze = zzi;
            zzqy.zza(zzi.class, zzi);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzi>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzi.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzk extends zzqy<zzk, zza> implements zzsm {
        private static final zzk zzg;
        private static volatile zzsu<zzk> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;

        private zzk() {
        }

        public static final class zza extends zzqy.zzb<zzk, zza> implements zzsm {
            private zza() {
                super(zzk.zzg);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzk zzk = new zzk();
            zzg = zzk;
            zzqy.zza(zzk.class, zzk);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzk>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzk.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzl extends zzqy<zzl, zza> implements zzsm {
        private static final zzl zzj;
        private static volatile zzsu<zzl> zzk;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        private zzl() {
        }

        public static final class zza extends zzqy.zzb<zzl, zza> implements zzsm {
            private zza() {
                super(zzl.zzj);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzl zzl = new zzl();
            zzj = zzl;
            zzqy.zza(zzl.class, zzl);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzl>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzl.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzm extends zzqy<zzm, zza> implements zzsm {
        private static final zzm zzk;
        private static volatile zzsu<zzm> zzl;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;
        private int zzj;

        private zzm() {
        }

        public static final class zza extends zzqy.zzb<zzm, zza> implements zzsm {
            private zza() {
                super(zzm.zzk);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzm zzm = new zzm();
            zzk = zzm;
            zzqy.zza(zzm.class, zzm);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzm>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzm.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzp extends zzqy<zzp, zza> implements zzsm {
        private static final zzp zze;
        private static volatile zzsu<zzp> zzf;
        private int zzc;
        private int zzd;

        private zzp() {
        }

        public static final class zza extends zzqy.zzb<zzp, zza> implements zzsm {
            private zza() {
                super(zzp.zze);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzp zzp = new zzp();
            zze = zzp;
            zzqy.zza(zzp.class, zzp);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzp>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzp.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzq extends zzqy<zzq, zza> implements zzsm {
        private static final zzq zzh;
        private static volatile zzsu<zzq> zzi;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private boolean zzg;

        private zzq() {
        }

        public static final class zza extends zzqy.zzb<zzq, zza> implements zzsm {
            private zza() {
                super(zzq.zzh);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzq zzq = new zzq();
            zzh = zzq;
            zzqy.zza(zzq.class, zzq);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzq>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzq.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzt extends zzqy<zzt, zza> implements zzsm {
        private static final zzt zzh;
        private static volatile zzsu<zzt> zzi;
        private int zzc;
        private int zzd;
        private boolean zze;
        private boolean zzf;
        private boolean zzg;

        private zzt() {
        }

        public static final class zza extends zzqy.zzb<zzt, zza> implements zzsm {
            private zza() {
                super(zzt.zzh);
            }

            /* synthetic */ zza(zzkn zzkn) {
                this();
            }
        }

        static {
            zzt zzt = new zzt();
            zzh = zzt;
            zzqy.zza(zzt.class, zzt);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzkm$zzt>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkm.zzt.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
