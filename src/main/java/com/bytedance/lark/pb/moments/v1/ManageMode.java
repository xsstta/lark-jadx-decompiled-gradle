package com.bytedance.lark.pb.moments.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ManageMode implements WireEnum {
    BASIC(0),
    STRONG_INTERVENTION(1);
    
    public static final ProtoAdapter<ManageMode> ADAPTER = ProtoAdapter.newEnumAdapter(ManageMode.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ManageMode fromValue(int i) {
        if (i == 0) {
            return BASIC;
        }
        if (i != 1) {
            return null;
        }
        return STRONG_INTERVENTION;
    }

    private ManageMode(int i) {
        this.value = i;
    }
}
