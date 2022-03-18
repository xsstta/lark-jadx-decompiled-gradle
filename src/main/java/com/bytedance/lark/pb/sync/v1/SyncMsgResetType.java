package com.bytedance.lark.pb.sync.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SyncMsgResetType implements WireEnum {
    FROM_LAST_MSG(0),
    FROM_BIZ_KEY(1);
    
    public static final ProtoAdapter<SyncMsgResetType> ADAPTER = ProtoAdapter.newEnumAdapter(SyncMsgResetType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SyncMsgResetType fromValue(int i) {
        if (i == 0) {
            return FROM_LAST_MSG;
        }
        if (i != 1) {
            return null;
        }
        return FROM_BIZ_KEY;
    }

    private SyncMsgResetType(int i) {
        this.value = i;
    }
}
