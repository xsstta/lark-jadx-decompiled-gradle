package com.bytedance.lark.pb.im.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TranslateScopeMask implements WireEnum {
    UNKNOWN_TRANSLATE_SCOPE_MASK(0),
    LARK_MESSAGE_MASK(1),
    DOC_BODY_MASK(2),
    DOC_COMMENT_MASK(4),
    WEB_XML(8),
    DOC_MASK(16),
    EMAIL(32);
    
    public static final ProtoAdapter<TranslateScopeMask> ADAPTER = ProtoAdapter.newEnumAdapter(TranslateScopeMask.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static TranslateScopeMask fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_TRANSLATE_SCOPE_MASK;
        }
        if (i == 1) {
            return LARK_MESSAGE_MASK;
        }
        if (i == 2) {
            return DOC_BODY_MASK;
        }
        if (i == 4) {
            return DOC_COMMENT_MASK;
        }
        if (i == 8) {
            return WEB_XML;
        }
        if (i == 16) {
            return DOC_MASK;
        }
        if (i != 32) {
            return null;
        }
        return EMAIL;
    }

    private TranslateScopeMask(int i) {
        this.value = i;
    }
}
