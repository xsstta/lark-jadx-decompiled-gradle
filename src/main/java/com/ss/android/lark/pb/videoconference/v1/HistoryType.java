package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum HistoryType implements WireEnum {
    HISTORY_UNKNOWN(0),
    HISTORY_JOIN(1),
    HISTORY_CALL(2),
    HISTORY_BE_CALLED(3),
    HISTORY_LEAVE(4);
    
    public static final ProtoAdapter<HistoryType> ADAPTER = ProtoAdapter.newEnumAdapter(HistoryType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static HistoryType fromValue(int i) {
        if (i == 0) {
            return HISTORY_UNKNOWN;
        }
        if (i == 1) {
            return HISTORY_JOIN;
        }
        if (i == 2) {
            return HISTORY_CALL;
        }
        if (i == 3) {
            return HISTORY_BE_CALLED;
        }
        if (i != 4) {
            return null;
        }
        return HISTORY_LEAVE;
    }

    private HistoryType(int i) {
        this.value = i;
    }
}
