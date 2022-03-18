package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CollaborationType implements WireEnum {
    DEFAULT(0),
    BLOCKED(1),
    REQUEST_NEEDED(2),
    EXECUTIVE_MODE(3),
    BE_BLOCKED(4);
    
    public static final ProtoAdapter<CollaborationType> ADAPTER = ProtoAdapter.newEnumAdapter(CollaborationType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CollaborationType fromValue(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return BLOCKED;
        }
        if (i == 2) {
            return REQUEST_NEEDED;
        }
        if (i == 3) {
            return EXECUTIVE_MODE;
        }
        if (i != 4) {
            return null;
        }
        return BE_BLOCKED;
    }

    private CollaborationType(int i) {
        this.value = i;
    }
}
