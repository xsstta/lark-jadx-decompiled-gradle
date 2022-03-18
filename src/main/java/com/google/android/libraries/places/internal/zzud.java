package com.google.android.libraries.places.internal;

public enum zzud {
    DOUBLE(zzuk.DOUBLE, 1),
    FLOAT(zzuk.FLOAT, 5),
    INT64(zzuk.LONG, 0),
    UINT64(zzuk.LONG, 0),
    INT32(zzuk.INT, 0),
    FIXED64(zzuk.LONG, 1),
    FIXED32(zzuk.INT, 5),
    BOOL(zzuk.BOOLEAN, 0),
    STRING(zzuk.STRING, 2) {
    },
    GROUP(zzuk.MESSAGE, 3) {
    },
    MESSAGE(zzuk.MESSAGE, 2) {
    },
    BYTES(zzuk.BYTE_STRING, 2) {
    },
    UINT32(zzuk.INT, 0),
    ENUM(zzuk.ENUM, 0),
    SFIXED32(zzuk.INT, 5),
    SFIXED64(zzuk.LONG, 1),
    SINT32(zzuk.INT, 0),
    SINT64(zzuk.LONG, 0);
    
    private final zzuk zzs;
    private final int zzt;

    public final zzuk zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    private zzud(zzuk zzuk, int i) {
        this.zzs = zzuk;
        this.zzt = i;
    }

    /* synthetic */ zzud(zzuk zzuk, int i, zzue zzue) {
        this(zzuk, i);
    }
}
