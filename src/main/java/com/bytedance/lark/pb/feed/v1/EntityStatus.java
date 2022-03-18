package com.bytedance.lark.pb.feed.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum EntityStatus implements WireEnum {
    NORMAL(1),
    PENDING(2),
    FAILED(3),
    READ(4),
    UNREAD(5);
    
    public static final ProtoAdapter<EntityStatus> ADAPTER = ProtoAdapter.newEnumAdapter(EntityStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static EntityStatus fromValue(int i) {
        if (i == 1) {
            return NORMAL;
        }
        if (i == 2) {
            return PENDING;
        }
        if (i == 3) {
            return FAILED;
        }
        if (i == 4) {
            return READ;
        }
        if (i != 5) {
            return null;
        }
        return UNREAD;
    }

    private EntityStatus(int i) {
        this.value = i;
    }
}
