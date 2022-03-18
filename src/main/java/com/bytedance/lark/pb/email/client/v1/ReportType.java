package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ReportType implements WireEnum {
    UNKNOWN_TYPE(0),
    SPAM(1),
    HAM(2),
    CLOSED(3);
    
    public static final ProtoAdapter<ReportType> ADAPTER = ProtoAdapter.newEnumAdapter(ReportType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ReportType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return SPAM;
        }
        if (i == 2) {
            return HAM;
        }
        if (i != 3) {
            return null;
        }
        return CLOSED;
    }

    private ReportType(int i) {
        this.value = i;
    }
}
