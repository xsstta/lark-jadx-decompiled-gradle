package com.bytedance.lark.pb.contact.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MsgType implements WireEnum {
    MSG_TYPE_UNKNOWN(0),
    MSG_TYPE_All(1),
    MSG_TYPE_ALL_Except_Doc(2),
    MSG_TYPE_Contact(3);
    
    public static final ProtoAdapter<MsgType> ADAPTER = ProtoAdapter.newEnumAdapter(MsgType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static MsgType fromValue(int i) {
        if (i == 0) {
            return MSG_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return MSG_TYPE_All;
        }
        if (i == 2) {
            return MSG_TYPE_ALL_Except_Doc;
        }
        if (i != 3) {
            return null;
        }
        return MSG_TYPE_Contact;
    }

    private MsgType(int i) {
        this.value = i;
    }
}
