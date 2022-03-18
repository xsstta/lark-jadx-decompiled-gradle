package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

final class zzsz {
    private static final Class<?> zza = zzd();
    private static final zztp<?, ?> zzb = zza(false);
    private static final zztp<?, ?> zzc = zza(true);
    private static final zztp<?, ?> zzd = new zztr();

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzqy.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static zztp<?, ?> zza() {
        return zzb;
    }

    public static zztp<?, ?> zzb() {
        return zzc;
    }

    public static zztp<?, ?> zzc() {
        return zzd;
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zza(zzsd zzsd, T t, T t2, long j) {
        zztv.zza(t, j, zzsd.zza(zztv.zzf(t, j), zztv.zzf(t2, j)));
    }

    static <T, FT extends zzqv<FT>> void zza(zzqo<FT> zzqo, T t, T t2) {
        zzqt<FT> zza2 = zzqo.zza((Object) t2);
        if (!zza2.zza.isEmpty()) {
            zzqo.zzb(t).zza(zza2);
        }
    }

    static <T, UT, UB> void zza(zztp<UT, UB> zztp, T t, T t2) {
        zztp.zza(t, zztp.zzb(zztp.zza(t), zztp.zza(t2)));
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int zzh(List<?> list) {
        return list.size() << 2;
    }

    static int zzi(List<?> list) {
        return list.size() << 3;
    }

    static int zzj(List<?> list) {
        return list.size();
    }

    static int zzc(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            i = 0;
            while (i2 < size) {
                i += zzqk.zzf(zzry.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzqk.zzf(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzd(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzra) {
            zzra zzra = (zzra) list;
            i = 0;
            while (i2 < size) {
                i += zzqk.zzk(zzra.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzqk.zzk(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzra) {
            zzra zzra = (zzra) list;
            i = 0;
            while (i2 < size) {
                i += zzqk.zzf(zzra.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzqk.zzf(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzra) {
            zzra zzra = (zzra) list;
            i = 0;
            while (i2 < size) {
                i += zzqk.zzg(zzra.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzqk.zzg(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzra) {
            zzra zzra = (zzra) list;
            i = 0;
            while (i2 < size) {
                i += zzqk.zzh(zzra.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzqk.zzh(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            i = 0;
            while (i2 < size) {
                i += zzqk.zze(zzry.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzqk.zze(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zza(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            i = 0;
            while (i2 < size) {
                i += zzqk.zzd(zzry.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzqk.zzd(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    private static zztp<?, ?> zza(boolean z) {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zztp) zze.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static int zzb(int i, List<zzpx> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzqk.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzqk.zzb(list.get(i2));
        }
        return zze;
    }

    static int zza(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzqk.zze(i) * size;
        if (list instanceof zzrr) {
            zzrr zzrr = (zzrr) list;
            while (i4 < size) {
                Object zza2 = zzrr.zza(i4);
                if (zza2 instanceof zzpx) {
                    i3 = zzqk.zzb((zzpx) zza2);
                } else {
                    i3 = zzqk.zzb((String) zza2);
                }
                zze += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzpx) {
                    i2 = zzqk.zzb((zzpx) obj);
                } else {
                    i2 = zzqk.zzb((String) obj);
                }
                zze += i2;
                i4++;
            }
        }
        return zze;
    }

    public static void zza(int i, List<String> list, zzuj zzuj) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zza(i, list);
        }
    }

    public static void zzb(int i, List<zzpx> list, zzuj zzuj) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzb(i, list);
        }
    }

    static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqk.zzi(i, 0);
    }

    static int zzj(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqk.zzb(i, true);
    }

    static int zza(int i, Object obj, zzsx zzsx) {
        if (obj instanceof zzrp) {
            return zzqk.zza(i, (zzrp) obj);
        }
        return zzqk.zzb(i, (zzsk) obj, zzsx);
    }

    static int zzb(int i, List<zzsk> list, zzsx zzsx) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzqk.zzc(i, list.get(i3), zzsx);
        }
        return i2;
    }

    static int zzc(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzqk.zze(i));
    }

    static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzqk.zze(i));
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzqk.zze(i));
    }

    static int zzf(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzqk.zze(i));
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzqk.zze(i));
    }

    static int zzi(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqk.zzg(i, 0L);
    }

    static int zza(int i, List<?> list, zzsx zzsx) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzqk.zze(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzrp) {
                i2 = zzqk.zza((zzrp) obj);
            } else {
                i2 = zzqk.zza((zzsk) obj, zzsx);
            }
            zze += i2;
        }
        return zze;
    }

    static int zzb(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzqk.zze(i));
    }

    static int zza(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzqk.zze(i));
    }

    public static void zzc(int i, List<Long> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzc(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzl(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzj(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzi(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zza(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzm(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzn(i, list, z);
        }
    }

    public static void zzb(int i, List<?> list, zzuj zzuj, zzsx zzsx) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzb(i, list, zzsx);
        }
    }

    public static void zzb(int i, List<Float> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzf(i, list, z);
        }
    }

    public static void zza(int i, List<?> list, zzuj zzuj, zzsx zzsx) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zza(i, list, zzsx);
        }
    }

    public static void zza(int i, List<Double> list, zzuj zzuj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzuj.zzg(i, list, z);
        }
    }
}
