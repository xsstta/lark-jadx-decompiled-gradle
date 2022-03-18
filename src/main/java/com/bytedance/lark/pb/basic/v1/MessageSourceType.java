package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MessageSourceType implements WireEnum {
    COMMON_MESSAGE(0),
    MERGE_FORWARD_MESSAGE(1);
    
    public static final ProtoAdapter<MessageSourceType> ADAPTER = ProtoAdapter.newEnumAdapter(MessageSourceType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MessageSourceType fromValue(int i) {
        if (i == 0) {
            return COMMON_MESSAGE;
        }
        if (i != 1) {
            return null;
        }
        return MERGE_FORWARD_MESSAGE;
    }

    private MessageSourceType(int i) {
        this.value = i;
    }
}
