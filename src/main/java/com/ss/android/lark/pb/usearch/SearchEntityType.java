package com.ss.android.lark.pb.usearch;

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
    DOC(7),
    WIKI(8),
    APP(9),
    ONCALL(10),
    THREAD(11),
    QA_CARD(12),
    URL(13),
    DEPARTMENT(14),
    PANO(15),
    SLASH_COMMAND(16),
    SECTION(17),
    RESOURCE(18),
    CUSTOMIZATION(19),
    FACILITY(20),
    MAIL_CONTACT(21),
    CHAMELEON(22);
    
    public static final ProtoAdapter<SearchEntityType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchEntityType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SearchEntityType fromValue(int i) {
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
            default:
                return null;
            case 7:
                return DOC;
            case 8:
                return WIKI;
            case 9:
                return APP;
            case 10:
                return ONCALL;
            case 11:
                return THREAD;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return QA_CARD;
            case 13:
                return URL;
            case 14:
                return DEPARTMENT;
            case 15:
                return PANO;
            case 16:
                return SLASH_COMMAND;
            case 17:
                return SECTION;
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
        }
    }

    private SearchEntityType(int i) {
        this.value = i;
    }
}
