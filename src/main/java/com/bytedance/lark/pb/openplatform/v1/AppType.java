package com.bytedance.lark.pb.openplatform.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum AppType implements WireEnum {
    UNKNOWN(0),
    LINK(1),
    APP(2),
    H5(3),
    MINA(4),
    ONCALL(5),
    APPSTORE(6),
    SYS_BYTEDANCE_APP(21),
    SYS_BYTEDANCE_VAPP(22),
    SYS_EXTERNAL_APP(41),
    SYS_EXTERNAL_VAPP(42),
    SYS_ALL_APP(61),
    SYS_ALL_VAPP(62);
    
    public static final ProtoAdapter<AppType> ADAPTER = ProtoAdapter.newEnumAdapter(AppType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static AppType fromValue(int i) {
        if (i == 21) {
            return SYS_BYTEDANCE_APP;
        }
        if (i == 22) {
            return SYS_BYTEDANCE_VAPP;
        }
        if (i == 41) {
            return SYS_EXTERNAL_APP;
        }
        if (i == 42) {
            return SYS_EXTERNAL_VAPP;
        }
        if (i == 61) {
            return SYS_ALL_APP;
        }
        if (i == 62) {
            return SYS_ALL_VAPP;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return LINK;
            case 2:
                return APP;
            case 3:
                return H5;
            case 4:
                return MINA;
            case 5:
                return ONCALL;
            case 6:
                return APPSTORE;
            default:
                return null;
        }
    }

    private AppType(int i) {
        this.value = i;
    }
}
