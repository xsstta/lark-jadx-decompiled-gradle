package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MeetingStatus implements WireEnum {
    MEETING_UNKNOWN(0),
    MEETING_CALLING(1),
    MEETING_ON_THE_CALL(2),
    MEETING_END(3);
    
    public static final ProtoAdapter<MeetingStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MeetingStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MeetingStatus fromValue(int i) {
        if (i == 0) {
            return MEETING_UNKNOWN;
        }
        if (i == 1) {
            return MEETING_CALLING;
        }
        if (i == 2) {
            return MEETING_ON_THE_CALL;
        }
        if (i != 3) {
            return null;
        }
        return MEETING_END;
    }

    private MeetingStatus(int i) {
        this.value = i;
    }
}
