package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum PlatformType implements WireEnum {
    PlatformIPhone(1),
    PlatformAndroid(2),
    PlatformWebAdmin(3),
    PlatformWebOther(4),
    PlatformWindows(5),
    PlatformMac(6),
    PlatformPassport(7),
    PlatformIpad(8);
    
    public static final ProtoAdapter<PlatformType> ADAPTER = ProtoAdapter.newEnumAdapter(PlatformType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static PlatformType fromValue(int i) {
        switch (i) {
            case 1:
                return PlatformIPhone;
            case 2:
                return PlatformAndroid;
            case 3:
                return PlatformWebAdmin;
            case 4:
                return PlatformWebOther;
            case 5:
                return PlatformWindows;
            case 6:
                return PlatformMac;
            case 7:
                return PlatformPassport;
            case 8:
                return PlatformIpad;
            default:
                return null;
        }
    }

    private PlatformType(int i) {
        this.value = i;
    }
}
