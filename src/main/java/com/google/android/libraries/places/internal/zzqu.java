package com.google.android.libraries.places.internal;

import java.lang.reflect.Type;

public enum zzqu {
    DOUBLE(0, zzqw.SCALAR, zzrm.DOUBLE),
    FLOAT(1, zzqw.SCALAR, zzrm.FLOAT),
    INT64(2, zzqw.SCALAR, zzrm.LONG),
    UINT64(3, zzqw.SCALAR, zzrm.LONG),
    INT32(4, zzqw.SCALAR, zzrm.INT),
    FIXED64(5, zzqw.SCALAR, zzrm.LONG),
    FIXED32(6, zzqw.SCALAR, zzrm.INT),
    BOOL(7, zzqw.SCALAR, zzrm.BOOLEAN),
    STRING(8, zzqw.SCALAR, zzrm.STRING),
    MESSAGE(9, zzqw.SCALAR, zzrm.MESSAGE),
    BYTES(10, zzqw.SCALAR, zzrm.BYTE_STRING),
    UINT32(11, zzqw.SCALAR, zzrm.INT),
    ENUM(12, zzqw.SCALAR, zzrm.ENUM),
    SFIXED32(13, zzqw.SCALAR, zzrm.INT),
    SFIXED64(14, zzqw.SCALAR, zzrm.LONG),
    SINT32(15, zzqw.SCALAR, zzrm.INT),
    SINT64(16, zzqw.SCALAR, zzrm.LONG),
    GROUP(17, zzqw.SCALAR, zzrm.MESSAGE),
    DOUBLE_LIST(18, zzqw.VECTOR, zzrm.DOUBLE),
    FLOAT_LIST(19, zzqw.VECTOR, zzrm.FLOAT),
    INT64_LIST(20, zzqw.VECTOR, zzrm.LONG),
    UINT64_LIST(21, zzqw.VECTOR, zzrm.LONG),
    INT32_LIST(22, zzqw.VECTOR, zzrm.INT),
    FIXED64_LIST(23, zzqw.VECTOR, zzrm.LONG),
    FIXED32_LIST(24, zzqw.VECTOR, zzrm.INT),
    BOOL_LIST(25, zzqw.VECTOR, zzrm.BOOLEAN),
    STRING_LIST(26, zzqw.VECTOR, zzrm.STRING),
    MESSAGE_LIST(27, zzqw.VECTOR, zzrm.MESSAGE),
    BYTES_LIST(28, zzqw.VECTOR, zzrm.BYTE_STRING),
    UINT32_LIST(29, zzqw.VECTOR, zzrm.INT),
    ENUM_LIST(30, zzqw.VECTOR, zzrm.ENUM),
    SFIXED32_LIST(31, zzqw.VECTOR, zzrm.INT),
    SFIXED64_LIST(32, zzqw.VECTOR, zzrm.LONG),
    SINT32_LIST(33, zzqw.VECTOR, zzrm.INT),
    SINT64_LIST(34, zzqw.VECTOR, zzrm.LONG),
    DOUBLE_LIST_PACKED(35, zzqw.PACKED_VECTOR, zzrm.DOUBLE),
    FLOAT_LIST_PACKED(36, zzqw.PACKED_VECTOR, zzrm.FLOAT),
    INT64_LIST_PACKED(37, zzqw.PACKED_VECTOR, zzrm.LONG),
    UINT64_LIST_PACKED(38, zzqw.PACKED_VECTOR, zzrm.LONG),
    INT32_LIST_PACKED(39, zzqw.PACKED_VECTOR, zzrm.INT),
    FIXED64_LIST_PACKED(40, zzqw.PACKED_VECTOR, zzrm.LONG),
    FIXED32_LIST_PACKED(41, zzqw.PACKED_VECTOR, zzrm.INT),
    BOOL_LIST_PACKED(42, zzqw.PACKED_VECTOR, zzrm.BOOLEAN),
    UINT32_LIST_PACKED(43, zzqw.PACKED_VECTOR, zzrm.INT),
    ENUM_LIST_PACKED(44, zzqw.PACKED_VECTOR, zzrm.ENUM),
    SFIXED32_LIST_PACKED(45, zzqw.PACKED_VECTOR, zzrm.INT),
    SFIXED64_LIST_PACKED(46, zzqw.PACKED_VECTOR, zzrm.LONG),
    SINT32_LIST_PACKED(47, zzqw.PACKED_VECTOR, zzrm.INT),
    SINT64_LIST_PACKED(48, zzqw.PACKED_VECTOR, zzrm.LONG),
    GROUP_LIST(49, zzqw.VECTOR, zzrm.MESSAGE),
    MAP(50, zzqw.MAP, zzrm.VOID);
    
    private static final zzqu[] zzbe;
    private static final Type[] zzbf = new Type[0];
    private final zzrm zzaz;
    private final int zzba;
    private final zzqw zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    public final int zza() {
        return this.zzba;
    }

    static {
        zzqu[] values = values();
        zzbe = new zzqu[values.length];
        for (zzqu zzqu : values) {
            zzbe[zzqu.zzba] = zzqu;
        }
    }

    private zzqu(int i, zzqw zzqw, zzrm zzrm) {
        int i2;
        this.zzba = i;
        this.zzbb = zzqw;
        this.zzaz = zzrm;
        int i3 = zzqx.zza[zzqw.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzbc = zzrm.zza();
        } else if (i3 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = zzrm.zza();
        }
        this.zzbd = (zzqw != zzqw.SCALAR || (i2 = zzqx.zzb[zzrm.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }
}
