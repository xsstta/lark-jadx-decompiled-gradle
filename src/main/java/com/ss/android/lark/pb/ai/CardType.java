package com.ss.android.lark.pb.ai;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CardType implements WireEnum {
    Entity(1),
    NotFound(2),
    MineWord(3),
    RichTextEntity(4);
    
    public static final ProtoAdapter<CardType> ADAPTER = ProtoAdapter.newEnumAdapter(CardType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CardType fromValue(int i) {
        if (i == 1) {
            return Entity;
        }
        if (i == 2) {
            return NotFound;
        }
        if (i == 3) {
            return MineWord;
        }
        if (i != 4) {
            return null;
        }
        return RichTextEntity;
    }

    private CardType(int i) {
        this.value = i;
    }
}
