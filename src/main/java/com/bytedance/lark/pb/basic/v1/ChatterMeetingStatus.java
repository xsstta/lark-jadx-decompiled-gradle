package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ChatterMeetingStatus implements WireEnum {
    UNKOWN(0),
    IDLE(1),
    BUSY(2),
    INMEETING(3),
    RINGING(4);
    
    public static final ProtoAdapter<ChatterMeetingStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ChatterMeetingStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ChatterMeetingStatus fromValue(int i) {
        if (i == 0) {
            return UNKOWN;
        }
        if (i == 1) {
            return IDLE;
        }
        if (i == 2) {
            return BUSY;
        }
        if (i == 3) {
            return INMEETING;
        }
        if (i != 4) {
            return null;
        }
        return RINGING;
    }

    private ChatterMeetingStatus(int i) {
        this.value = i;
    }
}
