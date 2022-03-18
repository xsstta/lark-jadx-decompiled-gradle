package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ScrollType implements WireEnum {
    EVENT_INFO(1),
    MEETING_TRANSFER_CHAT(2);
    
    public static final ProtoAdapter<ScrollType> ADAPTER = ProtoAdapter.newEnumAdapter(ScrollType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ScrollType fromValue(int i) {
        if (i == 1) {
            return EVENT_INFO;
        }
        if (i != 2) {
            return null;
        }
        return MEETING_TRANSFER_CHAT;
    }

    private ScrollType(int i) {
        this.value = i;
    }
}
