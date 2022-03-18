package com.bytedance.lark.pb.im.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ContentType implements WireEnum {
    UNKNOWN_CONTENT_TYPE(0),
    WEB_XML_CONTENT_TYPE(1),
    TEXT_CONTENT_TYPE(2);
    
    public static final ProtoAdapter<ContentType> ADAPTER = ProtoAdapter.newEnumAdapter(ContentType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ContentType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_CONTENT_TYPE;
        }
        if (i == 1) {
            return WEB_XML_CONTENT_TYPE;
        }
        if (i != 2) {
            return null;
        }
        return TEXT_CONTENT_TYPE;
    }

    private ContentType(int i) {
        this.value = i;
    }
}
