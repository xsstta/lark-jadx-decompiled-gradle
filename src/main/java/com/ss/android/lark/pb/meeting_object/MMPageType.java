package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MMPageType implements WireEnum {
    MMPageType_Unknown(0),
    MMPageType_Detail(1),
    MMPageType_Space(2);
    
    public static final ProtoAdapter<MMPageType> ADAPTER = ProtoAdapter.newEnumAdapter(MMPageType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MMPageType fromValue(int i) {
        if (i == 0) {
            return MMPageType_Unknown;
        }
        if (i == 1) {
            return MMPageType_Detail;
        }
        if (i != 2) {
            return null;
        }
        return MMPageType_Space;
    }

    private MMPageType(int i) {
        this.value = i;
    }
}
