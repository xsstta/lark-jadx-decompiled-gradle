package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum UserEventVisibility implements WireEnum {
    BUSY_READER(0),
    FREE_READER(1),
    READER(2);
    
    public static final ProtoAdapter<UserEventVisibility> ADAPTER = ProtoAdapter.newEnumAdapter(UserEventVisibility.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static UserEventVisibility fromValue(int i) {
        if (i == 0) {
            return BUSY_READER;
        }
        if (i == 1) {
            return FREE_READER;
        }
        if (i != 2) {
            return null;
        }
        return READER;
    }

    private UserEventVisibility(int i) {
        this.value = i;
    }
}
