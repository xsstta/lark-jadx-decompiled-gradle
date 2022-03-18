package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ChannelDataScene implements WireEnum {
    FIRST_SCREEN(1),
    SPECIFIED_POSITION(2),
    PREVIOUS_PAGE(3),
    NEXT_PAGE(4);
    
    public static final ProtoAdapter<ChannelDataScene> ADAPTER = ProtoAdapter.newEnumAdapter(ChannelDataScene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ChannelDataScene fromValue(int i) {
        if (i == 1) {
            return FIRST_SCREEN;
        }
        if (i == 2) {
            return SPECIFIED_POSITION;
        }
        if (i == 3) {
            return PREVIOUS_PAGE;
        }
        if (i != 4) {
            return null;
        }
        return NEXT_PAGE;
    }

    private ChannelDataScene(int i) {
        this.value = i;
    }
}
