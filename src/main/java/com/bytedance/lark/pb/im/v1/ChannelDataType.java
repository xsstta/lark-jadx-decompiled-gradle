package com.bytedance.lark.pb.im.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ChannelDataType implements WireEnum {
    NORMAL_DATA(1),
    QUASI_DATA(2);
    
    public static final ProtoAdapter<ChannelDataType> ADAPTER = ProtoAdapter.newEnumAdapter(ChannelDataType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ChannelDataType fromValue(int i) {
        if (i == 1) {
            return NORMAL_DATA;
        }
        if (i != 2) {
            return null;
        }
        return QUASI_DATA;
    }

    private ChannelDataType(int i) {
        this.value = i;
    }
}
