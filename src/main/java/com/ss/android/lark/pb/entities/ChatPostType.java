package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ChatPostType implements WireEnum {
    UNKNOWN_POST_TYPE(0),
    ANYONE(1),
    ONLY_ADMIN(2),
    WHITE_LIST(3);
    
    public static final ProtoAdapter<ChatPostType> ADAPTER = ProtoAdapter.newEnumAdapter(ChatPostType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ChatPostType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_POST_TYPE;
        }
        if (i == 1) {
            return ANYONE;
        }
        if (i == 2) {
            return ONLY_ADMIN;
        }
        if (i != 3) {
            return null;
        }
        return WHITE_LIST;
    }

    private ChatPostType(int i) {
        this.value = i;
    }
}
