package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DraftChangeAction implements WireEnum {
    ADD(0),
    DELETE(1),
    SEND(2),
    UPDATE(3);
    
    public static final ProtoAdapter<DraftChangeAction> ADAPTER = ProtoAdapter.newEnumAdapter(DraftChangeAction.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DraftChangeAction fromValue(int i) {
        if (i == 0) {
            return ADD;
        }
        if (i == 1) {
            return DELETE;
        }
        if (i == 2) {
            return SEND;
        }
        if (i != 3) {
            return null;
        }
        return UPDATE;
    }

    private DraftChangeAction(int i) {
        this.value = i;
    }
}
