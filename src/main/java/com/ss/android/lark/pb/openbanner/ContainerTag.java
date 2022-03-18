package com.ss.android.lark.pb.openbanner;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ContainerTag implements WireEnum {
    ChatFooterBanner(1);
    
    public static final ProtoAdapter<ContainerTag> ADAPTER = ProtoAdapter.newEnumAdapter(ContainerTag.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ContainerTag fromValue(int i) {
        if (i != 1) {
            return null;
        }
        return ChatFooterBanner;
    }

    private ContainerTag(int i) {
        this.value = i;
    }
}
