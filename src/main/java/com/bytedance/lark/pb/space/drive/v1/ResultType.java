package com.bytedance.lark.pb.space.drive.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ResultType implements WireEnum {
    ResultType_SUCCESS(0),
    ResultType_FAIL(1),
    ResultType_PARAM_ERROR(2),
    ResultType_SYSTEM_WRONG(100),
    ResultType_NO_ACCESS_ITEM(101),
    ResultType_SIGN_NOT_FOUND(102);
    
    public static final ProtoAdapter<ResultType> ADAPTER = ProtoAdapter.newEnumAdapter(ResultType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ResultType fromValue(int i) {
        if (i == 0) {
            return ResultType_SUCCESS;
        }
        if (i == 1) {
            return ResultType_FAIL;
        }
        if (i == 2) {
            return ResultType_PARAM_ERROR;
        }
        switch (i) {
            case 100:
                return ResultType_SYSTEM_WRONG;
            case 101:
                return ResultType_NO_ACCESS_ITEM;
            case 102:
                return ResultType_SIGN_NOT_FOUND;
            default:
                return null;
        }
    }

    private ResultType(int i) {
        this.value = i;
    }
}
