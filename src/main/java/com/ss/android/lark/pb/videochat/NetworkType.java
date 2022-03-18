package com.ss.android.lark.pb.videochat;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum NetworkType implements WireEnum {
    NetworkType_UNKNOWN(0),
    NetworkType_WIRED(1),
    NetworkType_WIRELESS(2),
    NetworkType_2G(3),
    NetworkType_3G(4),
    NetworkType_4G(5),
    NetworkType_5G(6),
    NetworkType_CELLULAR(7);
    
    public static final ProtoAdapter<NetworkType> ADAPTER = ProtoAdapter.newEnumAdapter(NetworkType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static NetworkType fromValue(int i) {
        switch (i) {
            case 0:
                return NetworkType_UNKNOWN;
            case 1:
                return NetworkType_WIRED;
            case 2:
                return NetworkType_WIRELESS;
            case 3:
                return NetworkType_2G;
            case 4:
                return NetworkType_3G;
            case 5:
                return NetworkType_4G;
            case 6:
                return NetworkType_5G;
            case 7:
                return NetworkType_CELLULAR;
            default:
                return null;
        }
    }

    private NetworkType(int i) {
        this.value = i;
    }
}
