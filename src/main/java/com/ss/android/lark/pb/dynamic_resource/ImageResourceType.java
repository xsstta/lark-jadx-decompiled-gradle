package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ImageResourceType implements WireEnum {
    UnknownType(0),
    RawBytes(1),
    EncryptedBytes(2),
    RawCdnUrl(3),
    EncryptedCdnUrl(4),
    ConstantKey(5),
    RawText(6),
    RawHtml(7);
    
    public static final ProtoAdapter<ImageResourceType> ADAPTER = ProtoAdapter.newEnumAdapter(ImageResourceType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ImageResourceType fromValue(int i) {
        switch (i) {
            case 0:
                return UnknownType;
            case 1:
                return RawBytes;
            case 2:
                return EncryptedBytes;
            case 3:
                return RawCdnUrl;
            case 4:
                return EncryptedCdnUrl;
            case 5:
                return ConstantKey;
            case 6:
                return RawText;
            case 7:
                return RawHtml;
            default:
                return null;
        }
    }

    private ImageResourceType(int i) {
        this.value = i;
    }
}
