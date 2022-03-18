package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FollowAssociateType implements WireEnum {
    FOLLOW_ASSOCIATE_TYPE_UNKNOWN(0),
    FOLLOW_ASSOCIATE_TYPE_MEETING(1),
    FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING(2);
    
    public static final ProtoAdapter<FollowAssociateType> ADAPTER = ProtoAdapter.newEnumAdapter(FollowAssociateType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FollowAssociateType fromValue(int i) {
        if (i == 0) {
            return FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return FOLLOW_ASSOCIATE_TYPE_MEETING;
        }
        if (i != 2) {
            return null;
        }
        return FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING;
    }

    private FollowAssociateType(int i) {
        this.value = i;
    }
}
