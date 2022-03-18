package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CustomStatusSyncField implements WireEnum {
    IS_SYN_ON_LEAVE(1),
    IS_SYN_MEETING(2),
    IS_SYN_SCHEDULE(3);
    
    public static final ProtoAdapter<CustomStatusSyncField> ADAPTER = ProtoAdapter.newEnumAdapter(CustomStatusSyncField.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CustomStatusSyncField fromValue(int i) {
        if (i == 1) {
            return IS_SYN_ON_LEAVE;
        }
        if (i == 2) {
            return IS_SYN_MEETING;
        }
        if (i != 3) {
            return null;
        }
        return IS_SYN_SCHEDULE;
    }

    private CustomStatusSyncField(int i) {
        this.value = i;
    }
}
