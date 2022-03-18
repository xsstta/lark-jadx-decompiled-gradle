package com.bytedance.lark.pb.im.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SyncStrategy implements WireEnum {
    Sync(0),
    OldThenTrigger(1);
    
    public static final ProtoAdapter<SyncStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(SyncStrategy.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SyncStrategy fromValue(int i) {
        if (i == 0) {
            return Sync;
        }
        if (i != 1) {
            return null;
        }
        return OldThenTrigger;
    }

    private SyncStrategy(int i) {
        this.value = i;
    }
}
