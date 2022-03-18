package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SyncDataStrategy implements WireEnum {
    LOCAL(1),
    TRY_LOCAL(2),
    FORCE_SERVER(3);
    
    public static final ProtoAdapter<SyncDataStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(SyncDataStrategy.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SyncDataStrategy fromValue(int i) {
        if (i == 1) {
            return LOCAL;
        }
        if (i == 2) {
            return TRY_LOCAL;
        }
        if (i != 3) {
            return null;
        }
        return FORCE_SERVER;
    }

    private SyncDataStrategy(int i) {
        this.value = i;
    }
}
