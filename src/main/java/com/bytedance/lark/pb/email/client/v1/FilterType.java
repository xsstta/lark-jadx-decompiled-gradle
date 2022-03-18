package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FilterType implements WireEnum {
    FILTER_UNKNOWN(0),
    UNREAD(1),
    ALL_MAIL(2);
    
    public static final ProtoAdapter<FilterType> ADAPTER = ProtoAdapter.newEnumAdapter(FilterType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FilterType fromValue(int i) {
        if (i == 0) {
            return FILTER_UNKNOWN;
        }
        if (i == 1) {
            return UNREAD;
        }
        if (i != 2) {
            return null;
        }
        return ALL_MAIL;
    }

    private FilterType(int i) {
        this.value = i;
    }
}
