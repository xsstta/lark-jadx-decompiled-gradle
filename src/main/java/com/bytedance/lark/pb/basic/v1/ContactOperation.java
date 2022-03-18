package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ContactOperation implements WireEnum {
    OPERATION_UNKNOWN(0),
    OPERATION_ADD(1),
    OPERATION_DELETE(2),
    OPERATION_UPDATE(3);
    
    public static final ProtoAdapter<ContactOperation> ADAPTER = ProtoAdapter.newEnumAdapter(ContactOperation.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ContactOperation fromValue(int i) {
        if (i == 0) {
            return OPERATION_UNKNOWN;
        }
        if (i == 1) {
            return OPERATION_ADD;
        }
        if (i == 2) {
            return OPERATION_DELETE;
        }
        if (i != 3) {
            return null;
        }
        return OPERATION_UPDATE;
    }

    private ContactOperation(int i) {
        this.value = i;
    }
}
