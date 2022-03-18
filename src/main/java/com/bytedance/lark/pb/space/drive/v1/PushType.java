package com.bytedance.lark.pb.space.drive.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum PushType implements WireEnum {
    RECENT_LIST(0),
    FOLDER(1);
    
    public static final ProtoAdapter<PushType> ADAPTER = ProtoAdapter.newEnumAdapter(PushType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static PushType fromValue(int i) {
        if (i == 0) {
            return RECENT_LIST;
        }
        if (i != 1) {
            return null;
        }
        return FOLDER;
    }

    private PushType(int i) {
        this.value = i;
    }
}
