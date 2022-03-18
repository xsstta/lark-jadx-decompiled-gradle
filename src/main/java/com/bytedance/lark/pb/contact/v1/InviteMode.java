package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum InviteMode implements WireEnum {
    SELECTED(1),
    UNSELECTED(2);
    
    public static final ProtoAdapter<InviteMode> ADAPTER = ProtoAdapter.newEnumAdapter(InviteMode.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static InviteMode fromValue(int i) {
        if (i == 1) {
            return SELECTED;
        }
        if (i != 2) {
            return null;
        }
        return UNSELECTED;
    }

    private InviteMode(int i) {
        this.value = i;
    }
}
