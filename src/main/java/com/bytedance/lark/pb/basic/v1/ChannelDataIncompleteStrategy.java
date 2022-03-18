package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ChannelDataIncompleteStrategy implements WireEnum {
    IGNORE_LOCAL_DATA(1),
    RETURN_LOCAL_DATA(2),
    SYNC_SERVER_DATA(3);
    
    public static final ProtoAdapter<ChannelDataIncompleteStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(ChannelDataIncompleteStrategy.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ChannelDataIncompleteStrategy fromValue(int i) {
        if (i == 1) {
            return IGNORE_LOCAL_DATA;
        }
        if (i == 2) {
            return RETURN_LOCAL_DATA;
        }
        if (i != 3) {
            return null;
        }
        return SYNC_SERVER_DATA;
    }

    private ChannelDataIncompleteStrategy(int i) {
        this.value = i;
    }
}
