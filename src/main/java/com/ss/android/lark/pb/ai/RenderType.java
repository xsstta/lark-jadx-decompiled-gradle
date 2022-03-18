package com.ss.android.lark.pb.ai;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum RenderType implements WireEnum {
    CARD(0),
    JSON(1),
    GECKO(2);
    
    public static final ProtoAdapter<RenderType> ADAPTER = ProtoAdapter.newEnumAdapter(RenderType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static RenderType fromValue(int i) {
        if (i == 0) {
            return CARD;
        }
        if (i == 1) {
            return JSON;
        }
        if (i != 2) {
            return null;
        }
        return GECKO;
    }

    private RenderType(int i) {
        this.value = i;
    }
}
