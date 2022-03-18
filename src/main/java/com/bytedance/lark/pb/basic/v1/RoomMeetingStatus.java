package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum RoomMeetingStatus implements WireEnum {
    VIEW_ROOM_UNKNOWN(0),
    VIEW_ROOM_IDLE(1),
    VIEW_ROOM_BUSY(2),
    VIEW_ROOM_IN_MEETING(3);
    
    public static final ProtoAdapter<RoomMeetingStatus> ADAPTER = ProtoAdapter.newEnumAdapter(RoomMeetingStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static RoomMeetingStatus fromValue(int i) {
        if (i == 0) {
            return VIEW_ROOM_UNKNOWN;
        }
        if (i == 1) {
            return VIEW_ROOM_IDLE;
        }
        if (i == 2) {
            return VIEW_ROOM_BUSY;
        }
        if (i != 3) {
            return null;
        }
        return VIEW_ROOM_IN_MEETING;
    }

    private RoomMeetingStatus(int i) {
        this.value = i;
    }
}
