package com.ss.android.lark.pb.authorization;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum EntityType implements WireEnum {
    ENTITY_TYPE_UNKNOWN(0),
    ANY(1),
    USER(2),
    IM_IMAGE(3),
    IM_VIDEO(4),
    IM_FILE(5),
    CCM_DOC(6),
    CCM_SHEET(7),
    CCM_BITABLE(8),
    CCM_MINDNOTE(9),
    CCM_FILE(10),
    CCM_SLIDE(11);
    
    public static final ProtoAdapter<EntityType> ADAPTER = ProtoAdapter.newEnumAdapter(EntityType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static EntityType fromValue(int i) {
        switch (i) {
            case 0:
                return ENTITY_TYPE_UNKNOWN;
            case 1:
                return ANY;
            case 2:
                return USER;
            case 3:
                return IM_IMAGE;
            case 4:
                return IM_VIDEO;
            case 5:
                return IM_FILE;
            case 6:
                return CCM_DOC;
            case 7:
                return CCM_SHEET;
            case 8:
                return CCM_BITABLE;
            case 9:
                return CCM_MINDNOTE;
            case 10:
                return CCM_FILE;
            case 11:
                return CCM_SLIDE;
            default:
                return null;
        }
    }

    private EntityType(int i) {
        this.value = i;
    }
}
