package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DeniedReason implements WireEnum {
    UNKNOWN_REASON(0),
    BE_BLOCKED(1),
    CROSS_TENANT_DENY(2),
    SAME_TENANT_DENY(3),
    CRYPTO_CHAT_DENY(4),
    BLOCKED(5),
    NO_FRIENDSHIP(6),
    PRIVACY_SETTING(7),
    TARGET_PRIVACY_SETTING(8),
    PRIVATE_CALENDAR(9),
    EXTERNAL_COORDINATE_CTL(10),
    TARGET_EXTERNAL_COORDINATE_CTL(11);
    
    public static final ProtoAdapter<DeniedReason> ADAPTER = ProtoAdapter.newEnumAdapter(DeniedReason.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DeniedReason fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REASON;
            case 1:
                return BE_BLOCKED;
            case 2:
                return CROSS_TENANT_DENY;
            case 3:
                return SAME_TENANT_DENY;
            case 4:
                return CRYPTO_CHAT_DENY;
            case 5:
                return BLOCKED;
            case 6:
                return NO_FRIENDSHIP;
            case 7:
                return PRIVACY_SETTING;
            case 8:
                return TARGET_PRIVACY_SETTING;
            case 9:
                return PRIVATE_CALENDAR;
            case 10:
                return EXTERNAL_COORDINATE_CTL;
            case 11:
                return TARGET_EXTERNAL_COORDINATE_CTL;
            default:
                return null;
        }
    }

    private DeniedReason(int i) {
        this.value = i;
    }
}
