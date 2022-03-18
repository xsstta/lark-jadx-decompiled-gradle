package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum InvitationSource implements WireEnum {
    HOME_SCHOOL_CONTACT(1),
    HOME_SCHOOL_CHAT(2);
    
    public static final ProtoAdapter<InvitationSource> ADAPTER = ProtoAdapter.newEnumAdapter(InvitationSource.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static InvitationSource fromValue(int i) {
        if (i == 1) {
            return HOME_SCHOOL_CONTACT;
        }
        if (i != 2) {
            return null;
        }
        return HOME_SCHOOL_CHAT;
    }

    private InvitationSource(int i) {
        this.value = i;
    }
}
