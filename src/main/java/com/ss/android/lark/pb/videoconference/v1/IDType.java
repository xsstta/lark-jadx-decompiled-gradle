package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum IDType implements WireEnum {
    UNKNOWN_ID_TYPE(0),
    GROUP_ID(1),
    MEETING_ID(2),
    UNIQUE_ID(3),
    INTERVIEW_UID(4),
    RESERVATION_ID(5);
    
    public static final ProtoAdapter<IDType> ADAPTER = ProtoAdapter.newEnumAdapter(IDType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static IDType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_ID_TYPE;
        }
        if (i == 1) {
            return GROUP_ID;
        }
        if (i == 2) {
            return MEETING_ID;
        }
        if (i == 3) {
            return UNIQUE_ID;
        }
        if (i == 4) {
            return INTERVIEW_UID;
        }
        if (i != 5) {
            return null;
        }
        return RESERVATION_ID;
    }

    private IDType(int i) {
        this.value = i;
    }
}
