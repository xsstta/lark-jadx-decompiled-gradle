package com.bytedance.lark.pb.moments.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum EntityType implements WireEnum {
    UNKNOWN(0),
    POST(1),
    COMMENT(2);
    
    public static final ProtoAdapter<EntityType> ADAPTER = ProtoAdapter.newEnumAdapter(EntityType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static EntityType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return POST;
        }
        if (i != 2) {
            return null;
        }
        return COMMENT;
    }

    private EntityType(int i) {
        this.value = i;
    }
}
