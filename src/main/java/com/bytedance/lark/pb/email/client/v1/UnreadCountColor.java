package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum UnreadCountColor implements WireEnum {
    GRAY(0),
    RED(1),
    WARNING(2),
    REDDOT(3);
    
    public static final ProtoAdapter<UnreadCountColor> ADAPTER = ProtoAdapter.newEnumAdapter(UnreadCountColor.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static UnreadCountColor fromValue(int i) {
        if (i == 0) {
            return GRAY;
        }
        if (i == 1) {
            return RED;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i != 3) {
            return null;
        }
        return REDDOT;
    }

    private UnreadCountColor(int i) {
        this.value = i;
    }
}
