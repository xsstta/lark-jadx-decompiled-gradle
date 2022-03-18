package com.bytedance.lark.pb.search.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ResultSourceType implements WireEnum {
    DEFAULT(0),
    LOCAL(1),
    NET(2);
    
    public static final ProtoAdapter<ResultSourceType> ADAPTER = ProtoAdapter.newEnumAdapter(ResultSourceType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ResultSourceType fromValue(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return LOCAL;
        }
        if (i != 2) {
            return null;
        }
        return NET;
    }

    private ResultSourceType(int i) {
        this.value = i;
    }
}
