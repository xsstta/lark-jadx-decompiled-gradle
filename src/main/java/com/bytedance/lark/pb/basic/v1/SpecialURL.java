package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SpecialURL implements WireEnum {
    UNKNOWN_URL(0),
    BEAR(1);
    
    public static final ProtoAdapter<SpecialURL> ADAPTER = ProtoAdapter.newEnumAdapter(SpecialURL.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SpecialURL fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_URL;
        }
        if (i != 1) {
            return null;
        }
        return BEAR;
    }

    private SpecialURL(int i) {
        this.value = i;
    }
}
