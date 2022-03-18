package com.ss.android.lark.pb.videochat;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ParticipantRole implements WireEnum {
    UNKNOW_ROLE(0),
    INTERVIEWER(1),
    INTERVIEWEE(2);
    
    public static final ProtoAdapter<ParticipantRole> ADAPTER = ProtoAdapter.newEnumAdapter(ParticipantRole.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ParticipantRole fromValue(int i) {
        if (i == 0) {
            return UNKNOW_ROLE;
        }
        if (i == 1) {
            return INTERVIEWER;
        }
        if (i != 2) {
            return null;
        }
        return INTERVIEWEE;
    }

    private ParticipantRole(int i) {
        this.value = i;
    }
}
