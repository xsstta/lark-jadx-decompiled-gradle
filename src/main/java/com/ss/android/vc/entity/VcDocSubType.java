package com.ss.android.vc.entity;

import com.huawei.hms.android.HwBuildEx;

public enum VcDocSubType {
    UNKNOWN_DOC_SUBTYPE(0),
    PHOTO(1),
    PDF(2),
    TXT(3),
    WORD(4),
    EXCEL(5),
    PPT(6),
    VIDEO(7),
    AUDIO(8),
    ZIP(9),
    PSD(10),
    APK(11),
    SKETCH(12),
    AE(13),
    KEYNOTE(14);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static VcDocSubType valueOf(int i) {
        return forNumber(i);
    }

    public static VcDocSubType forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DOC_SUBTYPE;
            case 1:
                return PHOTO;
            case 2:
                return PDF;
            case 3:
                return TXT;
            case 4:
                return WORD;
            case 5:
                return EXCEL;
            case 6:
                return PPT;
            case 7:
                return VIDEO;
            case 8:
                return AUDIO;
            case 9:
                return ZIP;
            case 10:
                return PSD;
            case 11:
                return APK;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return SKETCH;
            case 13:
                return AE;
            case 14:
                return KEYNOTE;
            default:
                return UNKNOWN_DOC_SUBTYPE;
        }
    }

    private VcDocSubType(int i) {
        this.value = i;
    }
}
