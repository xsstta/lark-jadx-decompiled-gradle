package com.bytedance.lark.pb.moments.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum Visibility implements WireEnum {
    ALL(0),
    SELF(1);
    
    public static final ProtoAdapter<Visibility> ADAPTER = ProtoAdapter.newEnumAdapter(Visibility.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static Visibility fromValue(int i) {
        if (i == 0) {
            return ALL;
        }
        if (i != 1) {
            return null;
        }
        return SELF;
    }

    private Visibility(int i) {
        this.value = i;
    }
}
