package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum IconType implements WireEnum {
    UNKNOWN_ICON_TYPE(0),
    EMOJI(1),
    IMAGE(2);
    
    public static final ProtoAdapter<IconType> ADAPTER = ProtoAdapter.newEnumAdapter(IconType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static IconType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_ICON_TYPE;
        }
        if (i == 1) {
            return EMOJI;
        }
        if (i != 2) {
            return null;
        }
        return IMAGE;
    }

    private IconType(int i) {
        this.value = i;
    }
}
