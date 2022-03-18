package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ErrorType implements WireEnum {
    UNKNOWN_TYPE(0),
    STOPPED_FEATURE(1),
    SESSION_ERROR(2),
    PERMISSION_ERROR(3),
    PARAM_ERROR(4),
    CONTENT_ERROR(5),
    NOT_SUFFICIENT_FUNDS(6);
    
    public static final ProtoAdapter<ErrorType> ADAPTER = ProtoAdapter.newEnumAdapter(ErrorType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ErrorType fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return STOPPED_FEATURE;
            case 2:
                return SESSION_ERROR;
            case 3:
                return PERMISSION_ERROR;
            case 4:
                return PARAM_ERROR;
            case 5:
                return CONTENT_ERROR;
            case 6:
                return NOT_SUFFICIENT_FUNDS;
            default:
                return null;
        }
    }

    private ErrorType(int i) {
        this.value = i;
    }
}
