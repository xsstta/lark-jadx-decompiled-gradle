package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ThreadSecurityLevel implements WireEnum {
    UNKNOWN(0),
    SPOOF(1),
    PHISHING(2);
    
    public static final ProtoAdapter<ThreadSecurityLevel> ADAPTER = ProtoAdapter.newEnumAdapter(ThreadSecurityLevel.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ThreadSecurityLevel fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SPOOF;
        }
        if (i != 2) {
            return null;
        }
        return PHISHING;
    }

    private ThreadSecurityLevel(int i) {
        this.value = i;
    }
}
