package com.bytedance.lark.pb.email.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ThreadChangeSource implements WireEnum {
    DEFAULT(0),
    NEW_MAIL(1);
    
    public static final ProtoAdapter<ThreadChangeSource> ADAPTER = ProtoAdapter.newEnumAdapter(ThreadChangeSource.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ThreadChangeSource fromValue(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return NEW_MAIL;
    }

    private ThreadChangeSource(int i) {
        this.value = i;
    }
}
