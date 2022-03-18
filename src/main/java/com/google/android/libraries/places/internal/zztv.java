package com.google.android.libraries.places.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class zztv {
    static final boolean zza;
    private static final Logger zzb = Logger.getLogger(zztv.class.getName());
    private static final Unsafe zzc;
    private static final Class<?> zzd = zzpv.zzb();
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzd zzg;
    private static final boolean zzh = zze();
    private static final boolean zzi = zzd();
    private static final long zzj;
    private static final long zzk = ((long) zzb(boolean[].class));
    private static final long zzl = ((long) zzc(boolean[].class));
    private static final long zzm = ((long) zzb(int[].class));
    private static final long zzn = ((long) zzc(int[].class));
    private static final long zzo = ((long) zzb(long[].class));
    private static final long zzp = ((long) zzc(long[].class));
    private static final long zzq = ((long) zzb(float[].class));
    private static final long zzr = ((long) zzc(float[].class));
    private static final long zzs = ((long) zzb(double[].class));
    private static final long zzt = ((long) zzc(double[].class));
    private static final long zzu = ((long) zzb(Object[].class));
    private static final long zzv = ((long) zzc(Object[].class));
    private static final long zzw;
    private static final int zzx;

    static boolean zza() {
        return zzi;
    }

    private zztv() {
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzg.zza((Object) bArr, zzj + j, b);
    }

    static Unsafe zzc() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zztx());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzb() {
        return zzh;
    }

    private static Field zzf() {
        Field zza2;
        if (zzpv.zza() && (zza2 = zza(Buffer.class, "effectiveDirectAddress")) != null) {
            return zza2;
        }
        Field zza3 = zza(Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    static {
        long j;
        boolean z;
        Unsafe zzc2 = zzc();
        zzc = zzc2;
        boolean zzd2 = zzd(Long.TYPE);
        zze = zzd2;
        boolean zzd3 = zzd(Integer.TYPE);
        zzf = zzd3;
        zzd zzd4 = null;
        if (zzc2 != null) {
            if (!zzpv.zza()) {
                zzd4 = new zzb(zzc2);
            } else if (zzd2) {
                zzd4 = new zzc(zzc2);
            } else if (zzd3) {
                zzd4 = new zza(zzc2);
            }
        }
        zzg = zzd4;
        long zzb2 = (long) zzb(byte[].class);
        zzj = zzb2;
        Field zzf2 = zzf();
        if (zzf2 == null || zzd4 == null) {
            j = -1;
        } else {
            j = zzd4.zza.objectFieldOffset(zzf2);
        }
        zzw = j;
        zzx = (int) (7 & zzb2);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        zza = z;
    }

    private static boolean zze() {
        Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzf() == null) {
                return false;
            }
            if (zzpv.zza()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzd() {
        Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzpv.zza()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final byte zza(Object obj, long j) {
            if (zztv.zza) {
                return zztv.zzk(obj, j);
            }
            return zztv.zzl(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final boolean zzb(Object obj, long j) {
            if (zztv.zza) {
                return zztv.zzm(obj, j);
            }
            return zztv.zzn(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, byte b) {
            if (zztv.zza) {
                zztv.zzc(obj, j, b);
            } else {
                zztv.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zztv.zza) {
                zztv.zzd(obj, j, z);
            } else {
                zztv.zze(obj, j, z);
            }
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final byte zza(Object obj, long j) {
            return this.zza.getByte(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final boolean zzb(Object obj, long j) {
            return this.zza.getBoolean(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final float zzc(Object obj, long j) {
            return this.zza.getFloat(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final double zzd(Object obj, long j) {
            return this.zza.getDouble(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, byte b) {
            this.zza.putByte(obj, j, b);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, double d) {
            this.zza.putDouble(obj, j, d);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, float f) {
            this.zza.putFloat(obj, j, f);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zza.putBoolean(obj, j, z);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final byte zza(Object obj, long j) {
            if (zztv.zza) {
                return zztv.zzk(obj, j);
            }
            return zztv.zzl(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final boolean zzb(Object obj, long j) {
            if (zztv.zza) {
                return zztv.zzm(obj, j);
            }
            return zztv.zzn(obj, j);
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, byte b) {
            if (zztv.zza) {
                zztv.zzc(obj, j, b);
            } else {
                zztv.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.libraries.places.internal.zztv.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zztv.zza) {
                zztv.zzd(obj, j, z);
            } else {
                zztv.zze(obj, j, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class zzd {
        Unsafe zza;

        public abstract byte zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract boolean zzb(Object obj, long j);

        public abstract float zzc(Object obj, long j);

        public abstract double zzd(Object obj, long j);

        zzd(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public final int zze(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final long zzf(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }
    }

    private static int zzb(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzc(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static boolean zzd(Class<?> cls) {
        if (!zzpv.zza()) {
            return false;
        }
        try {
            Class<?> cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static int zza(Object obj, long j) {
        return zzg.zze(obj, j);
    }

    static long zzb(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    static boolean zzc(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    static float zzd(Object obj, long j) {
        return zzg.zzc(obj, j);
    }

    static double zze(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    static byte zza(byte[] bArr, long j) {
        return zzg.zza(bArr, zzj + j);
    }

    static Object zzf(Object obj, long j) {
        return zzg.zza.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    public static byte zzl(Object obj, long j) {
        return (byte) (zza(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean zzm(Object obj, long j) {
        if (zzk(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean zzn(Object obj, long j) {
        if (zzl(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static byte zzk(Object obj, long j) {
        return (byte) (zza(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zze(Object obj, long j, boolean z) {
        zzd(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zza(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int zza2 = zza(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zza2 & (~(255 << i))));
    }

    static void zza(Object obj, long j, double d) {
        zzg.zza(obj, j, d);
    }

    static void zza(Object obj, long j, float f) {
        zzg.zza(obj, j, f);
    }

    static void zza(Object obj, long j, int i) {
        zzg.zza(obj, j, i);
    }

    static void zza(Object obj, long j, long j2) {
        zzg.zza(obj, j, j2);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzg.zza.putObject(obj, j, obj2);
    }

    static void zza(Object obj, long j, boolean z) {
        zzg.zza(obj, j, z);
    }
}
