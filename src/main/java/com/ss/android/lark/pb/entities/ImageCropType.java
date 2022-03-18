package com.ss.android.lark.pb.entities;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ImageCropType implements WireEnum {
    ORIGIN(1),
    MIDDLE(2),
    THUMB(3),
    MIDDLE_WEBP(4),
    THUMB_WEBP(5),
    MIDDLE_MP4(6),
    COVER(7),
    INTACT(8);
    
    public static final ProtoAdapter<ImageCropType> ADAPTER = ProtoAdapter.newEnumAdapter(ImageCropType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static ImageCropType fromValue(int i) {
        switch (i) {
            case 1:
                return ORIGIN;
            case 2:
                return MIDDLE;
            case 3:
                return THUMB;
            case 4:
                return MIDDLE_WEBP;
            case 5:
                return THUMB_WEBP;
            case 6:
                return MIDDLE_MP4;
            case 7:
                return COVER;
            case 8:
                return INTACT;
            default:
                return null;
        }
    }

    private ImageCropType(int i) {
        this.value = i;
    }
}
