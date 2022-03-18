package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CollaboratorType implements WireEnum {
    USER(0),
    GROUP(1);
    
    public static final ProtoAdapter<CollaboratorType> ADAPTER = ProtoAdapter.newEnumAdapter(CollaboratorType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CollaboratorType fromValue(int i) {
        if (i == 0) {
            return USER;
        }
        if (i != 1) {
            return null;
        }
        return GROUP;
    }

    private CollaboratorType(int i) {
        this.value = i;
    }
}
