package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ConstantKeyImageType implements WireEnum {
    UnknownConstantKeyImageType(0),
    AppName(1),
    AppIcon(2),
    UserName(3),
    TenantName(4),
    UserAvatar(5),
    TenantAvatar(6),
    PersonalContactQr(7),
    TeamCodeQr(8),
    QRCodeStr(9),
    TccTextResource(255);
    
    public static final ProtoAdapter<ConstantKeyImageType> ADAPTER = ProtoAdapter.newEnumAdapter(ConstantKeyImageType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ConstantKeyImageType fromValue(int i) {
        if (i == 255) {
            return TccTextResource;
        }
        switch (i) {
            case 0:
                return UnknownConstantKeyImageType;
            case 1:
                return AppName;
            case 2:
                return AppIcon;
            case 3:
                return UserName;
            case 4:
                return TenantName;
            case 5:
                return UserAvatar;
            case 6:
                return TenantAvatar;
            case 7:
                return PersonalContactQr;
            case 8:
                return TeamCodeQr;
            case 9:
                return QRCodeStr;
            default:
                return null;
        }
    }

    private ConstantKeyImageType(int i) {
        this.value = i;
    }
}
