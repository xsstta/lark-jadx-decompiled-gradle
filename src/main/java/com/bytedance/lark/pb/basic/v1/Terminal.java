package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum Terminal implements WireEnum {
    UNKNOWN_TERMINAL(0),
    PC(1),
    WEB(2),
    ANDROID(3),
    IOS(4);
    
    public static final ProtoAdapter<Terminal> ADAPTER = ProtoAdapter.newEnumAdapter(Terminal.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static Terminal fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_TERMINAL;
        }
        if (i == 1) {
            return PC;
        }
        if (i == 2) {
            return WEB;
        }
        if (i == 3) {
            return ANDROID;
        }
        if (i != 4) {
            return null;
        }
        return IOS;
    }

    private Terminal(int i) {
        this.value = i;
    }
}
