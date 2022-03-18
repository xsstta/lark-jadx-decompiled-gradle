package com.ss.android.lark.pb.chats;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum PickType implements WireEnum {
    UNKNOWN(0),
    USER(1),
    CHAT(2),
    DEPT(3);
    
    public static final ProtoAdapter<PickType> ADAPTER = ProtoAdapter.newEnumAdapter(PickType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static PickType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return USER;
        }
        if (i == 2) {
            return CHAT;
        }
        if (i != 3) {
            return null;
        }
        return DEPT;
    }

    private PickType(int i) {
        this.value = i;
    }
}
