package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TopicGroupRole implements WireEnum {
    UNKNOWN_ROLE(0),
    UNAUTHORIZED_USER(1),
    MEMBER(2),
    PARTICIPANT(3);
    
    public static final ProtoAdapter<TopicGroupRole> ADAPTER = ProtoAdapter.newEnumAdapter(TopicGroupRole.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TopicGroupRole fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_ROLE;
        }
        if (i == 1) {
            return UNAUTHORIZED_USER;
        }
        if (i == 2) {
            return MEMBER;
        }
        if (i != 3) {
            return null;
        }
        return PARTICIPANT;
    }

    private TopicGroupRole(int i) {
        this.value = i;
    }
}
