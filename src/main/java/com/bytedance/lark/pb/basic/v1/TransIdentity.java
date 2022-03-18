package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TransIdentity implements WireEnum {
    OTHER(0),
    SENDER(1),
    RECEIVER(2),
    WAITING_RECEIVER(3);
    
    public static final ProtoAdapter<TransIdentity> ADAPTER = ProtoAdapter.newEnumAdapter(TransIdentity.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TransIdentity fromValue(int i) {
        if (i == 0) {
            return OTHER;
        }
        if (i == 1) {
            return SENDER;
        }
        if (i == 2) {
            return RECEIVER;
        }
        if (i != 3) {
            return null;
        }
        return WAITING_RECEIVER;
    }

    private TransIdentity(int i) {
        this.value = i;
    }
}
