package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum InvitationPlatformType implements WireEnum {
    PlatformIPhone(1),
    PlatformAndroid(2),
    PlatformWebAdmin(3),
    PlatformWebOther(4),
    PlatformWindows(5),
    PlatformMac(6);
    
    public static final ProtoAdapter<InvitationPlatformType> ADAPTER = ProtoAdapter.newEnumAdapter(InvitationPlatformType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static InvitationPlatformType fromValue(int i) {
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
            default:
                return null;
        }
    }

    private InvitationPlatformType(int i) {
        this.value = i;
    }
}
