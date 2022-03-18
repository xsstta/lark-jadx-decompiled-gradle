package com.bytedance.lark.pb.ai.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TranslationScene implements WireEnum {
    MESSAGE(1),
    IMAGE(2),
    HYPER(3),
    DOCS(4),
    EMAIL(5);
    
    public static final ProtoAdapter<TranslationScene> ADAPTER = ProtoAdapter.newEnumAdapter(TranslationScene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TranslationScene fromValue(int i) {
        if (i == 1) {
            return MESSAGE;
        }
        if (i == 2) {
            return IMAGE;
        }
        if (i == 3) {
            return HYPER;
        }
        if (i == 4) {
            return DOCS;
        }
        if (i != 5) {
            return null;
        }
        return EMAIL;
    }

    private TranslationScene(int i) {
        this.value = i;
    }
}
