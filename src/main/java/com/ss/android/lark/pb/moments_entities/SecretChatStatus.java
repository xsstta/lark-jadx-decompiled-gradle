package com.ss.android.lark.pb.moments_entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SecretChatStatus implements WireEnum {
    UNKNOWN_STATUS(0),
    NOT_ASKED(1),
    ALREADY_ASKED(2),
    ALREADY_ACCEPTED(3),
    NOT_ALLOWED(4);
    
    public static final ProtoAdapter<SecretChatStatus> ADAPTER = ProtoAdapter.newEnumAdapter(SecretChatStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SecretChatStatus fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return NOT_ASKED;
        }
        if (i == 2) {
            return ALREADY_ASKED;
        }
        if (i == 3) {
            return ALREADY_ACCEPTED;
        }
        if (i != 4) {
            return null;
        }
        return NOT_ALLOWED;
    }

    private SecretChatStatus(int i) {
        this.value = i;
    }
}
