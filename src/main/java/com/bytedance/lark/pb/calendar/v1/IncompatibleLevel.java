package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum IncompatibleLevel implements WireEnum {
    SHOW_HINT(1),
    DISABLE_EDIT(2),
    DISABLE_READ(3);
    
    public static final ProtoAdapter<IncompatibleLevel> ADAPTER = ProtoAdapter.newEnumAdapter(IncompatibleLevel.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static IncompatibleLevel fromValue(int i) {
        if (i == 1) {
            return SHOW_HINT;
        }
        if (i == 2) {
            return DISABLE_EDIT;
        }
        if (i != 3) {
            return null;
        }
        return DISABLE_READ;
    }

    private IncompatibleLevel(int i) {
        this.value = i;
    }
}
