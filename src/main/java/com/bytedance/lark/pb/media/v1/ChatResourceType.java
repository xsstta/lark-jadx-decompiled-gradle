package com.bytedance.lark.pb.media.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ChatResourceType implements WireEnum {
    IMAGE(1),
    VIDEO(2);
    
    public static final ProtoAdapter<ChatResourceType> ADAPTER = ProtoAdapter.newEnumAdapter(ChatResourceType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ChatResourceType fromValue(int i) {
        if (i == 1) {
            return IMAGE;
        }
        if (i != 2) {
            return null;
        }
        return VIDEO;
    }

    private ChatResourceType(int i) {
        this.value = i;
    }
}
