package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MeetingRoomStatus implements WireEnum {
    CAN_NOT_RESERVE(0),
    IN_USE(1),
    CAN_RESERVE(2);
    
    public static final ProtoAdapter<MeetingRoomStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MeetingRoomStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MeetingRoomStatus fromValue(int i) {
        if (i == 0) {
            return CAN_NOT_RESERVE;
        }
        if (i == 1) {
            return IN_USE;
        }
        if (i != 2) {
            return null;
        }
        return CAN_RESERVE;
    }

    private MeetingRoomStatus(int i) {
        this.value = i;
    }
}
