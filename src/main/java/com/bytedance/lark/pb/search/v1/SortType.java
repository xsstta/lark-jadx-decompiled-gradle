package com.bytedance.lark.pb.search.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SortType implements WireEnum {
    DEFAULT(0),
    DESC_BY_TAG_CREATE_TIME(1),
    ASC_BY_TAG_CREATE_TIME(2),
    DESC_BY_TAG_UPDATE_TIME(3),
    ASC_BY_TAG_UPDATE_TIME(4),
    DESC_BY_ENTITY_CREATE_TIME(5),
    ASC_BY_ENTITY_CREATE_TIME(6),
    DESC_BY_ENTITY_UPDATE_TIME(7),
    ASC_BY_ENTITY_UPDATE_TIME(8);
    
    public static final ProtoAdapter<SortType> ADAPTER = ProtoAdapter.newEnumAdapter(SortType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SortType fromValue(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return DESC_BY_TAG_CREATE_TIME;
            case 2:
                return ASC_BY_TAG_CREATE_TIME;
            case 3:
                return DESC_BY_TAG_UPDATE_TIME;
            case 4:
                return ASC_BY_TAG_UPDATE_TIME;
            case 5:
                return DESC_BY_ENTITY_CREATE_TIME;
            case 6:
                return ASC_BY_ENTITY_CREATE_TIME;
            case 7:
                return DESC_BY_ENTITY_UPDATE_TIME;
            case 8:
                return ASC_BY_ENTITY_UPDATE_TIME;
            default:
                return null;
        }
    }

    private SortType(int i) {
        this.value = i;
    }
}
