package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TranslateSource implements WireEnum {
    UNKNOWN_TRANSLATE_SOURCE(0),
    MANUAL_TRANSLATE(1),
    AUTO_TRANSLATE(2);
    
    public static final ProtoAdapter<TranslateSource> ADAPTER = ProtoAdapter.newEnumAdapter(TranslateSource.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TranslateSource fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_TRANSLATE_SOURCE;
        }
        if (i == 1) {
            return MANUAL_TRANSLATE;
        }
        if (i != 2) {
            return null;
        }
        return AUTO_TRANSLATE;
    }

    private TranslateSource(int i) {
        this.value = i;
    }
}
