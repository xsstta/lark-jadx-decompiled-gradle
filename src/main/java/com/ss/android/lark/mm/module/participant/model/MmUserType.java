package com.ss.android.lark.mm.module.participant.model;

public enum MmUserType {
    UNKNOWN_USER(0),
    LARK_USE(1),
    ROOM(2),
    DOC_USER(3),
    NEO_USER(4),
    NEO_GUEST_USER(5),
    PSTN(6),
    SIP(7);
    
    public final int value;

    static MmUserType valueOf(int i) {
        switch (i) {
            case 1:
                return LARK_USE;
            case 2:
                return ROOM;
            case 3:
                return DOC_USER;
            case 4:
                return NEO_USER;
            case 5:
                return NEO_GUEST_USER;
            case 6:
                return PSTN;
            case 7:
                return SIP;
            default:
                return UNKNOWN_USER;
        }
    }

    private MmUserType(int i) {
        this.value = i;
    }
}
