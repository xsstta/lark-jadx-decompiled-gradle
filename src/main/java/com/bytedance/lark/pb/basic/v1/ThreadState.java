package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ThreadState implements WireEnum {
    UNKNOWN_STATE(0),
    OPEN(1),
    CLOSED(2);
    
    public static final ProtoAdapter<ThreadState> ADAPTER = ProtoAdapter.newEnumAdapter(ThreadState.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ThreadState fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i != 2) {
            return null;
        }
        return CLOSED;
    }

    private ThreadState(int i) {
        this.value = i;
    }
}
