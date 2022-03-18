package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TeamChatType implements WireEnum {
    TEAM_CHAT_TYPE_UNKNOWN(0),
    TEAM_CHAT_TYPE_DEFAULT(1),
    TEAM_CHAT_TYPE_PUBLIC(2),
    TEAM_CHAT_TYPE_PRIVATE(3);
    
    public static final ProtoAdapter<TeamChatType> ADAPTER = ProtoAdapter.newEnumAdapter(TeamChatType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TeamChatType fromValue(int i) {
        if (i == 0) {
            return TEAM_CHAT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return TEAM_CHAT_TYPE_DEFAULT;
        }
        if (i == 2) {
            return TEAM_CHAT_TYPE_PUBLIC;
        }
        if (i != 3) {
            return null;
        }
        return TEAM_CHAT_TYPE_PRIVATE;
    }

    private TeamChatType(int i) {
        this.value = i;
    }
}
