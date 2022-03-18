package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CalendarDirtyType implements WireEnum {
    NONE_DIRTY_TYPE(0),
    UPDATED(1),
    DELETED(2);
    
    public static final ProtoAdapter<CalendarDirtyType> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarDirtyType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CalendarDirtyType fromValue(int i) {
        if (i == 0) {
            return NONE_DIRTY_TYPE;
        }
        if (i == 1) {
            return UPDATED;
        }
        if (i != 2) {
            return null;
        }
        return DELETED;
    }

    private CalendarDirtyType(int i) {
        this.value = i;
    }
}
