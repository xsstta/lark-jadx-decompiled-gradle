package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MergeFowardMessageType implements WireEnum {
    MERGE_MESSAGE(1),
    MERGE_THREAD(2);
    
    public static final ProtoAdapter<MergeFowardMessageType> ADAPTER = ProtoAdapter.newEnumAdapter(MergeFowardMessageType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MergeFowardMessageType fromValue(int i) {
        if (i == 1) {
            return MERGE_MESSAGE;
        }
        if (i != 2) {
            return null;
        }
        return MERGE_THREAD;
    }

    private MergeFowardMessageType(int i) {
        this.value = i;
    }
}
