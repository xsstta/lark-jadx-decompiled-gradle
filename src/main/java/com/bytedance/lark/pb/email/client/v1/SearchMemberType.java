package com.bytedance.lark.pb.email.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SearchMemberType implements WireEnum {
    MEMBER_GROUP(1),
    MEMBER_USER(2);
    
    public static final ProtoAdapter<SearchMemberType> ADAPTER = ProtoAdapter.newEnumAdapter(SearchMemberType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static SearchMemberType fromValue(int i) {
        if (i == 1) {
            return MEMBER_GROUP;
        }
        if (i != 2) {
            return null;
        }
        return MEMBER_USER;
    }

    private SearchMemberType(int i) {
        this.value = i;
    }
}
