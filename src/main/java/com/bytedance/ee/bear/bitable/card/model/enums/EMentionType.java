package com.bytedance.ee.bear.bitable.card.model.enums;

import android.util.SparseArray;

public enum EMentionType {
    UNKNOWN(-1),
    USER(0),
    FILE(1),
    FOLDER(2),
    SHEET(3),
    SHEET_DOC(4),
    CHAT(5),
    GROUP(6),
    BLOCK(7),
    BITABLE(8),
    TABLE(9),
    INLINE_BLOCK(10),
    MINDNOTE(11),
    BOX(12),
    SLIDE(15),
    WIKI(16);
    
    private static final SparseArray<EMentionType> mapValues = new SparseArray<>();
    public int value;

    static {
        EMentionType[] values = values();
        for (EMentionType eMentionType : values) {
            mapValues.put(eMentionType.value, eMentionType);
        }
    }

    public static EMentionType valueOf(int i) {
        return mapValues.get(i, UNKNOWN);
    }

    private EMentionType(int i) {
        this.value = i;
    }
}
