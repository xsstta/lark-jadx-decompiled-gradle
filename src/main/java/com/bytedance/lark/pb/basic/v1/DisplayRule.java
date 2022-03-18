package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DisplayRule implements WireEnum {
    UNKNOWN_RULE(0),
    NO_TRANSLATION(1),
    ONLY_TRANSLATION(2),
    WITH_ORIGINAL(3);
    
    public static final ProtoAdapter<DisplayRule> ADAPTER = ProtoAdapter.newEnumAdapter(DisplayRule.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DisplayRule fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_RULE;
        }
        if (i == 1) {
            return NO_TRANSLATION;
        }
        if (i == 2) {
            return ONLY_TRANSLATION;
        }
        if (i != 3) {
            return null;
        }
        return WITH_ORIGINAL;
    }

    private DisplayRule(int i) {
        this.value = i;
    }
}
