package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ChannelType implements WireEnum {
    UNKNOWN_CHANNEL_TYPE(0),
    CHAT_CHANNEL(1),
    EMAIL_CHANNEL(2);
    
    public static final ProtoAdapter<ChannelType> ADAPTER = ProtoAdapter.newEnumAdapter(ChannelType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ChannelType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_CHANNEL_TYPE;
        }
        if (i == 1) {
            return CHAT_CHANNEL;
        }
        if (i != 2) {
            return null;
        }
        return EMAIL_CHANNEL;
    }

    private ChannelType(int i) {
        this.value = i;
    }
}
