package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ClientExtraAction implements WireEnum {
    UNKNOWN_ACTION(0),
    START_SHARE_SCREEN(1);
    
    public static final ProtoAdapter<ClientExtraAction> ADAPTER = ProtoAdapter.newEnumAdapter(ClientExtraAction.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ClientExtraAction fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_ACTION;
        }
        if (i != 1) {
            return null;
        }
        return START_SHARE_SCREEN;
    }

    private ClientExtraAction(int i) {
        this.value = i;
    }
}
