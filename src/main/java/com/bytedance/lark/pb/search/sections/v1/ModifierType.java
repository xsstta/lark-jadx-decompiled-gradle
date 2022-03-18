package com.bytedance.lark.pb.search.sections.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ModifierType implements WireEnum {
    UNKNOWN(0),
    ACTION(1),
    HIGHLIGHT(2),
    EMPHASIS(3),
    TOOLTIPS(4);
    
    public static final ProtoAdapter<ModifierType> ADAPTER = ProtoAdapter.newEnumAdapter(ModifierType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ModifierType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACTION;
        }
        if (i == 2) {
            return HIGHLIGHT;
        }
        if (i == 3) {
            return EMPHASIS;
        }
        if (i != 4) {
            return null;
        }
        return TOOLTIPS;
    }

    private ModifierType(int i) {
        this.value = i;
    }
}
