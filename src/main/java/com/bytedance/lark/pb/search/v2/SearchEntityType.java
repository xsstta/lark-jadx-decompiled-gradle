package com.bytedance.lark.pb.search.v2;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SearchEntityType implements WireEnum {
    UNKNOWN(0),
    USER(1),
    BOT(2),
    GROUP_CHAT(3),
    CRYPTO_P2P_CHAT(4),
    MESSAGE(5),
    DOC(6),
    WIKI(7),
    APP(8),
    ONCALL(9),
    THREAD(10),
    QA_CARD(11),
    URL(12),
    DEPARTMENT(13),
    PANO(14),
    SLASH_COMMAND(15),
    SECTION(16),
    RESOURCE(18),
    CUSTOMIZATION(19),
    FACILITY(20),
    MAIL_CONTACT(21),
    CHAMELEON(22),
    MAX(100);
    
    public static final ProtoAdapter<SearchEntityType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchEntityType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SearchEntityType fromValue(int i) {
        if (i == 100) {
            return MAX;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return USER;
            case 2:
                return BOT;
            case 3:
                return GROUP_CHAT;
            case 4:
                return CRYPTO_P2P_CHAT;
            case 5:
                return MESSAGE;
            case 6:
                return DOC;
            case 7:
                return WIKI;
            case 8:
                return APP;
            case 9:
                return ONCALL;
            case 10:
                return THREAD;
            case 11:
                return QA_CARD;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return URL;
            case 13:
                return DEPARTMENT;
            case 14:
                return PANO;
            case 15:
                return SLASH_COMMAND;
            case 16:
                return SECTION;
            default:
                switch (i) {
                    case 18:
                        return RESOURCE;
                    case 19:
                        return CUSTOMIZATION;
                    case 20:
                        return FACILITY;
                    case 21:
                        return MAIL_CONTACT;
                    case 22:
                        return CHAMELEON;
                    default:
                        return null;
                }
        }
    }

    private SearchEntityType(int i) {
        this.value = i;
    }
}
