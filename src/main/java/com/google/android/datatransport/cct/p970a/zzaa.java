package com.google.android.datatransport.cct.p970a;

import android.util.SparseArray;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.android.datatransport.cct.a.zzaa */
public final class zzaa extends Enum<zzaa> {
    public static final zzaa zza;
    public static final zzaa zzb;
    public static final zzaa zzc;
    public static final zzaa zzd;
    public static final zzaa zze;
    public static final zzaa zzf;
    private static final SparseArray<zzaa> zzg;

    static {
        zzaa zzaa = new zzaa("DEFAULT", 0, 0);
        zza = zzaa;
        zzaa zzaa2 = new zzaa("UNMETERED_ONLY", 1, 1);
        zzb = zzaa2;
        zzaa zzaa3 = new zzaa("UNMETERED_OR_DAILY", 2, 2);
        zzc = zzaa3;
        zzaa zzaa4 = new zzaa("FAST_IF_RADIO_AWAKE", 3, 3);
        zzd = zzaa4;
        zzaa zzaa5 = new zzaa("NEVER", 4, 4);
        zze = zzaa5;
        zzaa zzaa6 = new zzaa("UNRECOGNIZED", 5, -1);
        zzf = zzaa6;
        SparseArray<zzaa> sparseArray = new SparseArray<>();
        zzg = sparseArray;
        sparseArray.put(0, zzaa);
        sparseArray.put(1, zzaa2);
        sparseArray.put(2, zzaa3);
        sparseArray.put(3, zzaa4);
        sparseArray.put(4, zzaa5);
        sparseArray.put(-1, zzaa6);
    }

    private zzaa(String str, int i, int i2) {
    }
}
