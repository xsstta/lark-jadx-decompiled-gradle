package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DocType implements WireEnum {
    UNKNOWN_DOC_TYPE(0),
    DOC(1),
    SHEET(2),
    BITABLE(3),
    MINDNOTE(4),
    FILE(5),
    SLIDE(6),
    WIKI(7),
    DOCX(8),
    FOLDER(9);
    
    public static final ProtoAdapter<DocType> ADAPTER = ProtoAdapter.newEnumAdapter(DocType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DocType fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DOC_TYPE;
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
            case 9:
                return FOLDER;
            default:
                return null;
        }
    }

    private DocType(int i) {
        this.value = i;
    }
}
