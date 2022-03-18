package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum RedirectType implements WireEnum {
    NONE_REDIRECT(0),
    TO(1),
    CC(2),
    BCC(3);
    
    public static final ProtoAdapter<RedirectType> ADAPTER = ProtoAdapter.newEnumAdapter(RedirectType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static RedirectType fromValue(int i) {
        if (i == 0) {
            return NONE_REDIRECT;
        }
        if (i == 1) {
            return TO;
        }
        if (i == 2) {
            return CC;
        }
        if (i != 3) {
            return null;
        }
        return BCC;
    }

    private RedirectType(int i) {
        this.value = i;
    }
}
