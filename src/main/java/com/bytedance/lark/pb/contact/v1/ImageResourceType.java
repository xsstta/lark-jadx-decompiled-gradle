package com.bytedance.lark.pb.contact.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ImageResourceType implements WireEnum {
    UnknownType(0),
    DecryptedRawBytes(1),
    DecryptedRawCdnUrl(2),
    ConstantKey(3),
    RawText(4),
    RawHtml(5);
    
    public static final ProtoAdapter<ImageResourceType> ADAPTER = ProtoAdapter.newEnumAdapter(ImageResourceType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ImageResourceType fromValue(int i) {
        if (i == 0) {
            return UnknownType;
        }
        if (i == 1) {
            return DecryptedRawBytes;
        }
        if (i == 2) {
            return DecryptedRawCdnUrl;
        }
        if (i == 3) {
            return ConstantKey;
        }
        if (i == 4) {
            return RawText;
        }
        if (i != 5) {
            return null;
        }
        return RawHtml;
    }

    private ImageResourceType(int i) {
        this.value = i;
    }
}
