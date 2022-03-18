package com.ss.android.vc.entity;

import com.huawei.hms.android.HwBuildEx;

public enum VcDocType {
    UNKNOWN(0),
    DOC(1),
    SHEET(2),
    BITABLE(3),
    MINDNOTE(4),
    FILE(5),
    SLIDE(6),
    FOLDER(7),
    DUSTBIN(8),
    PERSONAL_FOLDER(9),
    SHAREWITHME_FOLDER(10),
    SHARE_FOLDER(11),
    LINK(12),
    DEMONSTRATION(13),
    WIKI(14),
    DOCX(15);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static VcDocType valueOf(int i) {
        return forNumber(i);
    }

    public static VcDocType forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DOC;
            case 2:
                return SHEET;
            case 3:
                return BITABLE;
            case 4:
                return MINDNOTE;
            case 5:
                return FILE;
            case 6:
                return SLIDE;
            case 7:
                return FOLDER;
            case 8:
                return DUSTBIN;
            case 9:
                return PERSONAL_FOLDER;
            case 10:
                return SHAREWITHME_FOLDER;
            case 11:
                return SHARE_FOLDER;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return LINK;
            case 13:
                return DEMONSTRATION;
            case 14:
                return WIKI;
            case 15:
                return DOCX;
            default:
                return UNKNOWN;
        }
    }

    private VcDocType(int i) {
        this.value = i;
    }
}
