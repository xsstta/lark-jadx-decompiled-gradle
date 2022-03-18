package com.bytedance.lark.pb.space.drive.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DownloadScene implements WireEnum {
    drive(0),
    large_email(1),
    unknown(2),
    wiki(3);
    
    public static final ProtoAdapter<DownloadScene> ADAPTER = ProtoAdapter.newEnumAdapter(DownloadScene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DownloadScene fromValue(int i) {
        if (i == 0) {
            return drive;
        }
        if (i == 1) {
            return large_email;
        }
        if (i == 2) {
            return unknown;
        }
        if (i != 3) {
            return null;
        }
        return wiki;
    }

    private DownloadScene(int i) {
        this.value = i;
    }
}
