package com.bytedance.lark.pb.onboarding.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FlowPlatformType implements WireEnum {
    UNKNOWN(0),
    IPHONE(1),
    ANDROID(2),
    WEB_ADMIN(3),
    WEB_OTHER(4),
    WINDOWS(5),
    MAC(6),
    PASSPORT(7),
    IPAD(8);
    
    public static final ProtoAdapter<FlowPlatformType> ADAPTER = ProtoAdapter.newEnumAdapter(FlowPlatformType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FlowPlatformType fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return IPHONE;
            case 2:
                return ANDROID;
            case 3:
                return WEB_ADMIN;
            case 4:
                return WEB_OTHER;
            case 5:
                return WINDOWS;
            case 6:
                return MAC;
            case 7:
                return PASSPORT;
            case 8:
                return IPAD;
            default:
                return null;
        }
    }

    private FlowPlatformType(int i) {
        this.value = i;
    }
}
