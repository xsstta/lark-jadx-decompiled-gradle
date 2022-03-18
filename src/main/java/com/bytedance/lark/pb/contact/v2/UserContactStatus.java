package com.bytedance.lark.pb.contact.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum UserContactStatus implements WireEnum {
    CONTACT_STATUS_NOT_FRIEND(0),
    CONTACT_POINT_FRIEND(1),
    CONTACT_STATUS_REQUEST(2),
    CONTACT_STATUS_REQUEST_EXPIRED(3),
    CONTACT_STATUS_RECEIVE(4);
    
    public static final ProtoAdapter<UserContactStatus> ADAPTER = ProtoAdapter.newEnumAdapter(UserContactStatus.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static UserContactStatus fromValue(int i) {
        if (i == 0) {
            return CONTACT_STATUS_NOT_FRIEND;
        }
        if (i == 1) {
            return CONTACT_POINT_FRIEND;
        }
        if (i == 2) {
            return CONTACT_STATUS_REQUEST;
        }
        if (i == 3) {
            return CONTACT_STATUS_REQUEST_EXPIRED;
        }
        if (i != 4) {
            return null;
        }
        return CONTACT_STATUS_RECEIVE;
    }

    private UserContactStatus(int i) {
        this.value = i;
    }
}
