package com.ss.android.lark.doc.entity;

public enum DocType {
    UNKNOWN_DOC_TYPE(0),
    DOC(1),
    SHEET(2),
    BITABLE(3),
    MINDNOTE(4),
    FILE(5),
    SLIDE(6),
    WIKI(7),
    DOCX(8);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static DocType forNumber(int i) {
        switch (i) {
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
                return WIKI;
            case 8:
                return DOCX;
            default:
                return UNKNOWN_DOC_TYPE;
        }
    }

    private DocType(int i) {
        this.value = i;
    }
}
