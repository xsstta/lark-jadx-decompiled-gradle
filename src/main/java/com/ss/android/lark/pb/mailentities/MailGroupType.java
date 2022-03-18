package com.ss.android.lark.pb.mailentities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MailGroupType implements WireEnum {
    CHAT_MAIL_GROUP(0),
    NORMAL_MAIL_GROUP(1);
    
    public static final ProtoAdapter<MailGroupType> ADAPTER = ProtoAdapter.newEnumAdapter(MailGroupType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MailGroupType fromValue(int i) {
        if (i == 0) {
            return CHAT_MAIL_GROUP;
        }
        if (i != 1) {
            return null;
        }
        return NORMAL_MAIL_GROUP;
    }

    private MailGroupType(int i) {
        this.value = i;
    }
}
