package com.bytedance.lark.pb.sync.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MsgType implements WireEnum {
    Common(0),
    Order(1);
    
    public static final ProtoAdapter<MsgType> ADAPTER = ProtoAdapter.newEnumAdapter(MsgType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MsgType fromValue(int i) {
        if (i == 0) {
            return Common;
        }
        if (i != 1) {
            return null;
        }
        return Order;
    }

    private MsgType(int i) {
        this.value = i;
    }
}
