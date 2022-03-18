package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ConflictType implements WireEnum {
    NONE(1),
    NORMAL(2),
    RECURRENCE(3);
    
    public static final ProtoAdapter<ConflictType> ADAPTER = ProtoAdapter.newEnumAdapter(ConflictType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ConflictType fromValue(int i) {
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return NORMAL;
        }
        if (i != 3) {
            return null;
        }
        return RECURRENCE;
    }

    private ConflictType(int i) {
        this.value = i;
    }
}
