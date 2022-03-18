package com.ss.android.lark.chat.entity.sticker;

public enum StickerSetType {
    UNKNOWN_STICKER_SET_TYPE(0),
    FREE(1);
    
    private int mValue;

    public int getNumber() {
        return this.mValue;
    }

    public static StickerSetType valueOf(int i) {
        return forNumber(i);
    }

    public static StickerSetType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STICKER_SET_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return FREE;
    }

    private StickerSetType(int i) {
        this.mValue = i;
    }
}
