package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FollowDataType implements WireEnum {
    FOLLOW_DATA_UNKNOWN(0),
    FOLLOW_WEB_DATA(1);
    
    public static final ProtoAdapter<FollowDataType> ADAPTER = ProtoAdapter.newEnumAdapter(FollowDataType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FollowDataType fromValue(int i) {
        if (i == 0) {
            return FOLLOW_DATA_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return FOLLOW_WEB_DATA;
    }

    private FollowDataType(int i) {
        this.value = i;
    }
}
