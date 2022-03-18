package com.bytedance.lark.pb.settings.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum NavigationPlatform implements WireEnum {
    NAV_PC(1),
    NAV_MOBILE(2),
    NAV_IPAD(3);
    
    public static final ProtoAdapter<NavigationPlatform> ADAPTER = ProtoAdapter.newEnumAdapter(NavigationPlatform.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static NavigationPlatform fromValue(int i) {
        if (i == 1) {
            return NAV_PC;
        }
        if (i == 2) {
            return NAV_MOBILE;
        }
        if (i != 3) {
            return null;
        }
        return NAV_IPAD;
    }

    private NavigationPlatform(int i) {
        this.value = i;
    }
}
