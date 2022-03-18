package com.ss.android.lark.pb.videoconference.v1;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ParticipantType implements WireEnum {
    UNKNOW(0),
    LARK_USER(1),
    ROOM(2),
    DOC_USER(3),
    NEO_USER(4),
    NEO_GUEST_USER(5),
    PSTN_USER(6),
    SIP_USER(7),
    RESERVED_USER_1(8),
    RESERVED_USER_2(9),
    RESERVED_USER_3(10),
    RESERVED_USER_4(11),
    RESERVED_USER_5(12),
    RESERVED_USER_6(13),
    RESERVED_USER_7(14),
    RESERVED_USER_8(15),
    RESERVED_USER_9(16),
    RESERVED_USER_10(17),
    RESERVED_USER_11(18),
    RESERVED_USER_12(19),
    RESERVED_USER_13(20),
    RESERVED_USER_14(21),
    RESERVED_USER_15(22),
    RESERVED_USER_16(23),
    RESERVED_USER_17(24),
    RESERVED_USER_18(25),
    RESERVED_USER_19(26),
    RESERVED_USER_20(27);
    
    public static final ProtoAdapter<ParticipantType> ADAPTER = ProtoAdapter.newEnumAdapter(ParticipantType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ParticipantType fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOW;
            case 1:
                return LARK_USER;
            case 2:
                return ROOM;
            case 3:
                return DOC_USER;
            case 4:
                return NEO_USER;
            case 5:
                return NEO_GUEST_USER;
            case 6:
                return PSTN_USER;
            case 7:
                return SIP_USER;
            case 8:
                return RESERVED_USER_1;
            case 9:
                return RESERVED_USER_2;
            case 10:
                return RESERVED_USER_3;
            case 11:
                return RESERVED_USER_4;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return RESERVED_USER_5;
            case 13:
                return RESERVED_USER_6;
            case 14:
                return RESERVED_USER_7;
            case 15:
                return RESERVED_USER_8;
            case 16:
                return RESERVED_USER_9;
            case 17:
                return RESERVED_USER_10;
            case 18:
                return RESERVED_USER_11;
            case 19:
                return RESERVED_USER_12;
            case 20:
                return RESERVED_USER_13;
            case 21:
                return RESERVED_USER_14;
            case 22:
                return RESERVED_USER_15;
            case 23:
                return RESERVED_USER_16;
            case 24:
                return RESERVED_USER_17;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                return RESERVED_USER_18;
            case 26:
                return RESERVED_USER_19;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                return RESERVED_USER_20;
            default:
                return null;
        }
    }

    private ParticipantType(int i) {
        this.value = i;
    }
}
