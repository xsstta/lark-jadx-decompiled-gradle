package com.bytedance.lark.pb.basic.v1;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ActionType implements WireEnum {
    UNKNOWN_ACTION(0),
    CREATE_P2P_CHAT(1),
    INVITE_SAME_CHAT(2),
    SEND_URGENT(3),
    SEND_MESSAGE(4),
    MAKE_PHONE_CALL(5),
    CRATE_P2P_CRYPTO_CHAT(6),
    VIEW_PERSONAL_STATUS(7),
    INVITE_SAME_CRYPTO_CHAT(18),
    SHARE_MESSAGE_SELECT_USER(19),
    VOIP_CALL(8),
    CREATE_SINGLE_VIDEOCHAT(9),
    INVITE_VIDEO_CHAT(10),
    SHARE_VIDEO_CHAT(11),
    INVITE_EVENT(12),
    SHARE_EVENT(13),
    TRANSFER_EVENT(14),
    CCM_SEND_MESSAGE(15),
    CCM_BOT_MESSAGE(16),
    CCM_FEED_MESSAGE(17),
    DOC_SHARE_OR_CREATE(20),
    SHARE_NAME_CARD(21),
    CALENDAR_PRIVATE_CHECK(22),
    ADD_CONTACT(23),
    JOIN_CHAT_VIA_SHARE(24),
    INVITE_SAME_CROSS_TENANT_CHAT(25),
    BLOCK(30),
    COOPERATION(31);
    
    public static final ProtoAdapter<ActionType> ADAPTER = ProtoAdapter.newEnumAdapter(ActionType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ActionType fromValue(int i) {
        if (i == 30) {
            return BLOCK;
        }
        if (i == 31) {
            return COOPERATION;
        }
        switch (i) {
            case 0:
                return UNKNOWN_ACTION;
            case 1:
                return CREATE_P2P_CHAT;
            case 2:
                return INVITE_SAME_CHAT;
            case 3:
                return SEND_URGENT;
            case 4:
                return SEND_MESSAGE;
            case 5:
                return MAKE_PHONE_CALL;
            case 6:
                return CRATE_P2P_CRYPTO_CHAT;
            case 7:
                return VIEW_PERSONAL_STATUS;
            case 8:
                return VOIP_CALL;
            case 9:
                return CREATE_SINGLE_VIDEOCHAT;
            case 10:
                return INVITE_VIDEO_CHAT;
            case 11:
                return SHARE_VIDEO_CHAT;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return INVITE_EVENT;
            case 13:
                return SHARE_EVENT;
            case 14:
                return TRANSFER_EVENT;
            case 15:
                return CCM_SEND_MESSAGE;
            case 16:
                return CCM_BOT_MESSAGE;
            case 17:
                return CCM_FEED_MESSAGE;
            case 18:
                return INVITE_SAME_CRYPTO_CHAT;
            case 19:
                return SHARE_MESSAGE_SELECT_USER;
            case 20:
                return DOC_SHARE_OR_CREATE;
            case 21:
                return SHARE_NAME_CARD;
            case 22:
                return CALENDAR_PRIVATE_CHECK;
            case 23:
                return ADD_CONTACT;
            case 24:
                return JOIN_CHAT_VIA_SHARE;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                return INVITE_SAME_CROSS_TENANT_CHAT;
            default:
                return null;
        }
    }

    private ActionType(int i) {
        this.value = i;
    }
}
