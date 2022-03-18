package com.bytedance.lark.pb.sync.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SubscribeStatusCode implements WireEnum {
    SUCCESS(0),
    AUTH_FAIL(1),
    SERVER_ERROR(2);
    
    public static final ProtoAdapter<SubscribeStatusCode> ADAPTER = ProtoAdapter.newEnumAdapter(SubscribeStatusCode.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SubscribeStatusCode fromValue(int i) {
        if (i == 0) {
            return SUCCESS;
        }
        if (i == 1) {
            return AUTH_FAIL;
        }
        if (i != 2) {
            return null;
        }
        return SERVER_ERROR;
    }

    private SubscribeStatusCode(int i) {
        this.value = i;
    }
}
