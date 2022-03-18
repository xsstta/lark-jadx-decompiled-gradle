package com.bytedance.lark.pb.settings.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BadgeStyle implements WireEnum {
    WEAK_REMIND(1),
    STRONG_REMIND(2);
    
    public static final ProtoAdapter<BadgeStyle> ADAPTER = ProtoAdapter.newEnumAdapter(BadgeStyle.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static BadgeStyle fromValue(int i) {
        if (i == 1) {
            return WEAK_REMIND;
        }
        if (i != 2) {
            return null;
        }
        return STRONG_REMIND;
    }

    private BadgeStyle(int i) {
        this.value = i;
    }
}
