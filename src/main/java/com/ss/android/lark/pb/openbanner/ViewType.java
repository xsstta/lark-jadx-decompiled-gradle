package com.ss.android.lark.pb.openbanner;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ViewType implements WireEnum {
    BannerResource(1);
    
    public static final ProtoAdapter<ViewType> ADAPTER = ProtoAdapter.newEnumAdapter(ViewType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ViewType fromValue(int i) {
        if (i != 1) {
            return null;
        }
        return BannerResource;
    }

    private ViewType(int i) {
        this.value = i;
    }
}
