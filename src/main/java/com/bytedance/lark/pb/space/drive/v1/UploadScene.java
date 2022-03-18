package com.bytedance.lark.pb.space.drive.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum UploadScene implements WireEnum {
    DRIVE(0),
    LARGE_EMAIL(1),
    UNKNOWN(2),
    WIKI(3);
    
    public static final ProtoAdapter<UploadScene> ADAPTER = ProtoAdapter.newEnumAdapter(UploadScene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static UploadScene fromValue(int i) {
        if (i == 0) {
            return DRIVE;
        }
        if (i == 1) {
            return LARGE_EMAIL;
        }
        if (i == 2) {
            return UNKNOWN;
        }
        if (i != 3) {
            return null;
        }
        return WIKI;
    }

    private UploadScene(int i) {
        this.value = i;
    }
}
