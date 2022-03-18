package com.bytedance.lark.pb.im.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum StickerSetType implements WireEnum {
    UNKNOWN_STICKER_SET_TYPE(0),
    FREE(1);
    
    public static final ProtoAdapter<StickerSetType> ADAPTER = ProtoAdapter.newEnumAdapter(StickerSetType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static StickerSetType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_STICKER_SET_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return FREE;
    }

    private StickerSetType(int i) {
        this.value = i;
    }
}
