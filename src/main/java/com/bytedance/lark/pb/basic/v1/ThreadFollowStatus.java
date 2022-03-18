package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ThreadFollowStatus implements WireEnum {
    UNKNOWN_STATUS(0),
    NOT_FOLLOWING(1),
    FOLLOWING(2),
    LOADING(3);
    
    public static final ProtoAdapter<ThreadFollowStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ThreadFollowStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ThreadFollowStatus fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return NOT_FOLLOWING;
        }
        if (i == 2) {
            return FOLLOWING;
        }
        if (i != 3) {
            return null;
        }
        return LOADING;
    }

    private ThreadFollowStatus(int i) {
        this.value = i;
    }
}
