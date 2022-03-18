package com.google.android.libraries.places.internal;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public enum zzuk {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzpx.zza),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzj;

    private zzuk(Object obj) {
        this.zzj = obj;
    }
}
