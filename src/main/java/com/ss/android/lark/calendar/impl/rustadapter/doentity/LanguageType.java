package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.huawei.hms.android.HwBuildEx;

public enum LanguageType {
    UNKNOWN_LANGUAGE(0),
    ZH_CN(1),
    EN_US(2),
    JA_JP(3),
    RW(4),
    ES_ES(5),
    IT_IT(6),
    DE_DE(7),
    FR_FR(8),
    PT_BR(9),
    ID_ID(10),
    VI_VN(11),
    TH_TH(12),
    KO_KR(13),
    RU_RU(14),
    HI_IN(15),
    ZH_HK(16),
    ZH_TW(17);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static LanguageType valueOf(int i) {
        return forNumber(i);
    }

    public static LanguageType forNumber(int i) {
        switch (i) {
            case 1:
                return ZH_CN;
            case 2:
                return EN_US;
            case 3:
                return JA_JP;
            case 4:
                return RW;
            case 5:
                return ES_ES;
            case 6:
                return IT_IT;
            case 7:
                return DE_DE;
            case 8:
                return FR_FR;
            case 9:
                return PT_BR;
            case 10:
                return ID_ID;
            case 11:
                return VI_VN;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return TH_TH;
            case 13:
                return KO_KR;
            case 14:
                return RU_RU;
            case 15:
                return HI_IN;
            case 16:
                return ZH_HK;
            case 17:
                return ZH_TW;
            default:
                return UNKNOWN_LANGUAGE;
        }
    }

    private LanguageType(int i) {
        this.value = i;
    }
}
