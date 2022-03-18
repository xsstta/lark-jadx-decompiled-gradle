package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzdc;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

abstract class zzbt<TypeT, RequestT extends zzdc> extends zzaj<TypeT, RequestT> {
    private final Locale zza;
    private final String zzb;
    private final boolean zzc;
    private final zzdr zzd;

    /* access modifiers changed from: protected */
    public abstract Map<String, String> zze();

    /* access modifiers changed from: protected */
    public abstract String zzf();

    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzaj
    public final String zzd() {
        return new zzcf(zzf(), this.zzb).zza(this.zza).zza(zze()).zza();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzaj
    public final Map<String, String> zzc() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzd.zza());
        if (this.zzc) {
            str = ".compat";
        } else {
            str = "";
        }
        if (str.length() != 0) {
            str2 = "2.2.0".concat(str);
        } else {
            str2 = new String("2.2.0");
        }
        hashMap.put("X-Places-Android-Sdk", str2);
        return hashMap;
    }

    protected static void zza(Map<String, String> map, String str, Object obj, Object obj2) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    protected zzbt(RequestT requestt, Locale locale, String str, boolean z, zzdr zzdr) {
        super(requestt);
        this.zza = locale;
        this.zzb = str;
        this.zzc = z;
        this.zzd = zzdr;
    }
}
