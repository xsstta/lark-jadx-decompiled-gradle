package com.bytedance.lark.pb.url.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum UrlPreviewSourceType implements WireEnum {
    CHAT_ANNOUNCEMENT(1),
    PERSONAL_SIG(10);
    
    public static final ProtoAdapter<UrlPreviewSourceType> ADAPTER = ProtoAdapter.newEnumAdapter(UrlPreviewSourceType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static UrlPreviewSourceType fromValue(int i) {
        if (i == 1) {
            return CHAT_ANNOUNCEMENT;
        }
        if (i != 10) {
            return null;
        }
        return PERSONAL_SIG;
    }

    private UrlPreviewSourceType(int i) {
        this.value = i;
    }
}
