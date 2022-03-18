package com.bytedance.lark.pb.im.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum HongbaoType implements WireEnum {
    UNKNOWN(0),
    NORMAL(1),
    COMMERCIAL(2);
    
    public static final ProtoAdapter<HongbaoType> ADAPTER = ProtoAdapter.newEnumAdapter(HongbaoType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static HongbaoType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return COMMERCIAL;
    }

    private HongbaoType(int i) {
        this.value = i;
    }
}
