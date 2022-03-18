package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum LoginUserType implements WireEnum {
    LoginUserType_Unknown(0),
    LoginUserType_LarkUser(1),
    LoginUserType_Room(2),
    LoginUserType_DocUser(3),
    LoginUserType_NeoUser(4),
    LoginUserType_NeoGuestUser(5),
    LoginUserType_PSTN(6),
    LoginUserType_SIP(7),
    LoginUserType_Says(59),
    LoginUserType_Guest(99),
    LoginUserType_AutoDetect(100);
    
    public static final ProtoAdapter<LoginUserType> ADAPTER = ProtoAdapter.newEnumAdapter(LoginUserType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static LoginUserType fromValue(int i) {
        if (i == 59) {
            return LoginUserType_Says;
        }
        if (i == 99) {
            return LoginUserType_Guest;
        }
        if (i == 100) {
            return LoginUserType_AutoDetect;
        }
        switch (i) {
            case 0:
                return LoginUserType_Unknown;
            case 1:
                return LoginUserType_LarkUser;
            case 2:
                return LoginUserType_Room;
            case 3:
                return LoginUserType_DocUser;
            case 4:
                return LoginUserType_NeoUser;
            case 5:
                return LoginUserType_NeoGuestUser;
            case 6:
                return LoginUserType_PSTN;
            case 7:
                return LoginUserType_SIP;
            default:
                return null;
        }
    }

    private LoginUserType(int i) {
        this.value = i;
    }
}
