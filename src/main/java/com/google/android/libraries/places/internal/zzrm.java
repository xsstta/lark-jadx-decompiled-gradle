package com.google.android.libraries.places.internal;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public enum zzrm {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzpx.class, zzpx.class, zzpx.zza),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    public final Class<?> zza() {
        return this.zzl;
    }

    private zzrm(Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }
}
