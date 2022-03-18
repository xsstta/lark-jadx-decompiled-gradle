package com.bytedance.lark.pb.basic.v1;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum Tag implements WireEnum {
    UNKNOWN_TAG(0),
    OFFICIAL(1),
    ON_CALL(2),
    BOT(3),
    MEETING(4),
    APPROVAL(5),
    SECRET_CHAT(6),
    WHOLE(7),
    DEPARTMENT(8),
    EXTERNAL(9),
    PUBLIC(10),
    GROUP_ADMIN(11),
    SUPERVISOR(12),
    STOPPED(13),
    OFFLINE(14),
    DELETED(15),
    UNACTIVATED(16),
    EDU(17),
    FROZEN(18),
    ONCALL_OFFLINE(100);
    
    public static final ProtoAdapter<Tag> ADAPTER = ProtoAdapter.newEnumAdapter(Tag.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static Tag fromValue(int i) {
        if (i == 100) {
            return ONCALL_OFFLINE;
        }
        switch (i) {
            case 0:
                return UNKNOWN_TAG;
            case 1:
                return OFFICIAL;
            case 2:
                return ON_CALL;
            case 3:
                return BOT;
            case 4:
                return MEETING;
            case 5:
                return APPROVAL;
            case 6:
                return SECRET_CHAT;
            case 7:
                return WHOLE;
            case 8:
                return DEPARTMENT;
            case 9:
                return EXTERNAL;
            case 10:
                return PUBLIC;
            case 11:
                return GROUP_ADMIN;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return SUPERVISOR;
            case 13:
                return STOPPED;
            case 14:
                return OFFLINE;
            case 15:
                return DELETED;
            case 16:
                return UNACTIVATED;
            case 17:
                return EDU;
            case 18:
                return FROZEN;
            default:
                return null;
        }
    }

    private Tag(int i) {
        this.value = i;
    }
}
