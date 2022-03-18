package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum IconStyle implements WireEnum {
    RECTANGLE(0),
    CIRCLE(1);
    
    public static final ProtoAdapter<IconStyle> ADAPTER = ProtoAdapter.newEnumAdapter(IconStyle.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static IconStyle fromValue(int i) {
        if (i == 0) {
            return RECTANGLE;
        }
        if (i != 1) {
            return null;
        }
        return CIRCLE;
    }

    private IconStyle(int i) {
        this.value = i;
    }
}
