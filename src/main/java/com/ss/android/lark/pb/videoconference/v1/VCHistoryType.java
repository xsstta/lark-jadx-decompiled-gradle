package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum VCHistoryType implements WireEnum {
    ALL(0),
    CALL(1),
    MEETING(2),
    EVENT(3);
    
    public static final ProtoAdapter<VCHistoryType> ADAPTER = ProtoAdapter.newEnumAdapter(VCHistoryType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static VCHistoryType fromValue(int i) {
        if (i == 0) {
            return ALL;
        }
        if (i == 1) {
            return CALL;
        }
        if (i == 2) {
            return MEETING;
        }
        if (i != 3) {
            return null;
        }
        return EVENT;
    }

    private VCHistoryType(int i) {
        this.value = i;
    }
}
