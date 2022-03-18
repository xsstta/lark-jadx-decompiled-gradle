package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TenantTag implements WireEnum {
    STANDARD(0),
    UNDEFINED(1),
    SIMPLE(2);
    
    public static final ProtoAdapter<TenantTag> ADAPTER = ProtoAdapter.newEnumAdapter(TenantTag.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TenantTag fromValue(int i) {
        if (i == 0) {
            return STANDARD;
        }
        if (i == 1) {
            return UNDEFINED;
        }
        if (i != 2) {
            return null;
        }
        return SIMPLE;
    }

    private TenantTag(int i) {
        this.value = i;
    }
}
