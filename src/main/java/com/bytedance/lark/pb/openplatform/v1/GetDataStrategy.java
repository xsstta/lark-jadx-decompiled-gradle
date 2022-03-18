package com.bytedance.lark.pb.openplatform.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum GetDataStrategy implements WireEnum {
    LocalOnly(1),
    NetOnly(2);
    
    public static final ProtoAdapter<GetDataStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(GetDataStrategy.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static GetDataStrategy fromValue(int i) {
        if (i == 1) {
            return LocalOnly;
        }
        if (i != 2) {
            return null;
        }
        return NetOnly;
    }

    private GetDataStrategy(int i) {
        this.value = i;
    }
}
