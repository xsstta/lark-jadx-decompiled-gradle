package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum UserCustomStatusDuration implements WireEnum {
    MINUTES_30(1),
    HOUR_1(2),
    HOUR_2(3),
    HOUR_4(4),
    UNTIL_TONIGHT(5);
    
    public static final ProtoAdapter<UserCustomStatusDuration> ADAPTER = ProtoAdapter.newEnumAdapter(UserCustomStatusDuration.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static UserCustomStatusDuration fromValue(int i) {
        if (i == 1) {
            return MINUTES_30;
        }
        if (i == 2) {
            return HOUR_1;
        }
        if (i == 3) {
            return HOUR_2;
        }
        if (i == 4) {
            return HOUR_4;
        }
        if (i != 5) {
            return null;
        }
        return UNTIL_TONIGHT;
    }

    private UserCustomStatusDuration(int i) {
        this.value = i;
    }
}
