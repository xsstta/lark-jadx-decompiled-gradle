package com.bytedance.lark.pb.openplatform.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BadgeNodeActionCode implements WireEnum {
    UNKNOWN_BADGE_CODE(0),
    CODE_SUCCESS(1),
    CODE_INVALID_PARAMS(2),
    CODE_NONEXISTENT_NODE(3);
    
    public static final ProtoAdapter<BadgeNodeActionCode> ADAPTER = ProtoAdapter.newEnumAdapter(BadgeNodeActionCode.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static BadgeNodeActionCode fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_BADGE_CODE;
        }
        if (i == 1) {
            return CODE_SUCCESS;
        }
        if (i == 2) {
            return CODE_INVALID_PARAMS;
        }
        if (i != 3) {
            return null;
        }
        return CODE_NONEXISTENT_NODE;
    }

    private BadgeNodeActionCode(int i) {
        this.value = i;
    }
}
