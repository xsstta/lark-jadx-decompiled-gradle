package com.bytedance.lark.pb.sync.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SyncEventType implements WireEnum {
    UNKNOWN(0),
    BIZ_RESET(1);
    
    public static final ProtoAdapter<SyncEventType> ADAPTER = ProtoAdapter.newEnumAdapter(SyncEventType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SyncEventType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return BIZ_RESET;
    }

    private SyncEventType(int i) {
        this.value = i;
    }
}
