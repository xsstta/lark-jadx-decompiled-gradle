package com.bytedance.lark.pb.feed.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CursorType implements WireEnum {
    INBOX(1),
    DONE(2),
    BOX(3);
    
    public static final ProtoAdapter<CursorType> ADAPTER = ProtoAdapter.newEnumAdapter(CursorType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CursorType fromValue(int i) {
        if (i == 1) {
            return INBOX;
        }
        if (i == 2) {
            return DONE;
        }
        if (i != 3) {
            return null;
        }
        return BOX;
    }

    private CursorType(int i) {
        this.value = i;
    }
}
