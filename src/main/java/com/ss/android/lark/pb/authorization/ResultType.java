package com.ss.android.lark.pb.authorization;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ResultType implements WireEnum {
    RESULT_TYPE_UNKNOWN(0),
    Deny(1),
    Allow(2),
    Null(3);
    
    public static final ProtoAdapter<ResultType> ADAPTER = ProtoAdapter.newEnumAdapter(ResultType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ResultType fromValue(int i) {
        if (i == 0) {
            return RESULT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return Deny;
        }
        if (i == 2) {
            return Allow;
        }
        if (i != 3) {
            return null;
        }
        return Null;
    }

    private ResultType(int i) {
        this.value = i;
    }
}
