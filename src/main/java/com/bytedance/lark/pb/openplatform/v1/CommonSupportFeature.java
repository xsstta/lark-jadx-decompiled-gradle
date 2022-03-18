package com.bytedance.lark.pb.openplatform.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum CommonSupportFeature implements WireEnum {
    Mobile(1),
    Pc(2);
    
    public static final ProtoAdapter<CommonSupportFeature> ADAPTER = ProtoAdapter.newEnumAdapter(CommonSupportFeature.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static CommonSupportFeature fromValue(int i) {
        if (i == 1) {
            return Mobile;
        }
        if (i != 2) {
            return null;
        }
        return Pc;
    }

    private CommonSupportFeature(int i) {
        this.value = i;
    }
}
