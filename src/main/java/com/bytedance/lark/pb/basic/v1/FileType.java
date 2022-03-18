package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FileType implements WireEnum {
    DEFAULT(1),
    DOC(2),
    PDF(3),
    PPT(4),
    XLS(5),
    ZIP(6),
    PSD(7),
    AI(8),
    SKETCH(9);
    
    public static final ProtoAdapter<FileType> ADAPTER = ProtoAdapter.newEnumAdapter(FileType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FileType fromValue(int i) {
        switch (i) {
            case 1:
                return DEFAULT;
            case 2:
                return DOC;
            case 3:
                return PDF;
            case 4:
                return PPT;
            case 5:
                return XLS;
            case 6:
                return ZIP;
            case 7:
                return PSD;
            case 8:
                return AI;
            case 9:
                return SKETCH;
            default:
                return null;
        }
    }

    private FileType(int i) {
        this.value = i;
    }
}
