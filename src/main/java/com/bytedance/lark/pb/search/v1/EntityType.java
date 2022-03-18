package com.bytedance.lark.pb.search.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum EntityType implements WireEnum {
    CHATTER(1),
    CHAT(2),
    MESSAGE(3),
    BEARDOC(4),
    EMAIL(5),
    OPEN_APP(6),
    ONCALL_ENTITY(7);
    
    public static final ProtoAdapter<EntityType> ADAPTER = ProtoAdapter.newEnumAdapter(EntityType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static EntityType fromValue(int i) {
        switch (i) {
            case 1:
                return CHATTER;
            case 2:
                return CHAT;
            case 3:
                return MESSAGE;
            case 4:
                return BEARDOC;
            case 5:
                return EMAIL;
            case 6:
                return OPEN_APP;
            case 7:
                return ONCALL_ENTITY;
            default:
                return null;
        }
    }

    private EntityType(int i) {
        this.value = i;
    }
}
