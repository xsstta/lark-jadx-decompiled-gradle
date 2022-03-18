package com.bytedance.lark.pb.media.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DownloadFileScene implements WireEnum {
    UNKNOWN(0),
    CHAT(1),
    FAVORITE(2),
    TODO(3);
    
    public static final ProtoAdapter<DownloadFileScene> ADAPTER = ProtoAdapter.newEnumAdapter(DownloadFileScene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DownloadFileScene fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CHAT;
        }
        if (i == 2) {
            return FAVORITE;
        }
        if (i != 3) {
            return null;
        }
        return TODO;
    }

    private DownloadFileScene(int i) {
        this.value = i;
    }
}
