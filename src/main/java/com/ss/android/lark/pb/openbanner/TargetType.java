package com.ss.android.lark.pb.openbanner;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TargetType implements WireEnum {
    CHAT(1);
    
    public static final ProtoAdapter<TargetType> ADAPTER = ProtoAdapter.newEnumAdapter(TargetType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TargetType fromValue(int i) {
        if (i != 1) {
            return null;
        }
        return CHAT;
    }

    private TargetType(int i) {
        this.value = i;
    }
}
