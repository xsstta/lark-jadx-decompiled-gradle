package com.bytedance.lark.pb.search.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SuggestionType implements WireEnum {
    UNKNOWN_SUGGESTION(0),
    SIDE_CARD(1),
    RESOURCE_TAG(2),
    JUMP_TAB(3),
    SERVICE_CARD(4);
    
    public static final ProtoAdapter<SuggestionType> ADAPTER = ProtoAdapter.newEnumAdapter(SuggestionType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SuggestionType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_SUGGESTION;
        }
        if (i == 1) {
            return SIDE_CARD;
        }
        if (i == 2) {
            return RESOURCE_TAG;
        }
        if (i == 3) {
            return JUMP_TAB;
        }
        if (i != 4) {
            return null;
        }
        return SERVICE_CARD;
    }

    private SuggestionType(int i) {
        this.value = i;
    }
}
