package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum NavigationAppType implements WireEnum {
    APP_TYPE_NATIVE(1),
    APP_TYPE_MINI(2),
    APP_TYPE_WEB(3);
    
    public static final ProtoAdapter<NavigationAppType> ADAPTER = ProtoAdapter.newEnumAdapter(NavigationAppType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static NavigationAppType fromValue(int i) {
        if (i == 1) {
            return APP_TYPE_NATIVE;
        }
        if (i == 2) {
            return APP_TYPE_MINI;
        }
        if (i != 3) {
            return null;
        }
        return APP_TYPE_WEB;
    }

    private NavigationAppType(int i) {
        this.value = i;
    }
}
