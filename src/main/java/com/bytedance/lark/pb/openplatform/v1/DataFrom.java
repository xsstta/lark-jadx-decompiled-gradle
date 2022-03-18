package com.bytedance.lark.pb.openplatform.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DataFrom implements WireEnum {
    Local(1),
    Net(2);
    
    public static final ProtoAdapter<DataFrom> ADAPTER = ProtoAdapter.newEnumAdapter(DataFrom.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DataFrom fromValue(int i) {
        if (i == 1) {
            return Local;
        }
        if (i != 2) {
            return null;
        }
        return Net;
    }

    private DataFrom(int i) {
        this.value = i;
    }
}
