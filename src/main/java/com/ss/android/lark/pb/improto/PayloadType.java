package com.ss.android.lark.pb.improto;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum PayloadType implements WireEnum {
    TYPE_UNKNOWN(0),
    PB2(1),
    JSON(2);
    
    public static final ProtoAdapter<PayloadType> ADAPTER = ProtoAdapter.newEnumAdapter(PayloadType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static PayloadType fromValue(int i) {
        if (i == 0) {
            return TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PB2;
        }
        if (i != 2) {
            return null;
        }
        return JSON;
    }

    private PayloadType(int i) {
        this.value = i;
    }
}
