package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CallStatus implements WireEnum {
    CALL_UNKNOWN(0),
    CALL_ACCEPTED(1),
    CALL_CANCELED(2);
    
    public static final ProtoAdapter<CallStatus> ADAPTER = ProtoAdapter.newEnumAdapter(CallStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CallStatus fromValue(int i) {
        if (i == 0) {
            return CALL_UNKNOWN;
        }
        if (i == 1) {
            return CALL_ACCEPTED;
        }
        if (i != 2) {
            return null;
        }
        return CALL_CANCELED;
    }

    private CallStatus(int i) {
        this.value = i;
    }
}
