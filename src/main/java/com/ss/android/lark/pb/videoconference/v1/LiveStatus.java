package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum LiveStatus implements WireEnum {
    UNKNOWN(0),
    EDITING(1),
    LIVING(2),
    PREVIEWING(3);
    
    public static final ProtoAdapter<LiveStatus> ADAPTER = ProtoAdapter.newEnumAdapter(LiveStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static LiveStatus fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return EDITING;
        }
        if (i == 2) {
            return LIVING;
        }
        if (i != 3) {
            return null;
        }
        return PREVIEWING;
    }

    private LiveStatus(int i) {
        this.value = i;
    }
}
