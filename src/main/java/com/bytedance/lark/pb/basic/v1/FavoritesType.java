package com.bytedance.lark.pb.basic.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FavoritesType implements WireEnum {
    FAVORITES_UNKNOWN(0),
    FAVORITES_MESSAGE(1),
    FAVORITES_MERGE_FAVORITE(2);
    
    public static final ProtoAdapter<FavoritesType> ADAPTER = ProtoAdapter.newEnumAdapter(FavoritesType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FavoritesType fromValue(int i) {
        if (i == 0) {
            return FAVORITES_UNKNOWN;
        }
        if (i == 1) {
            return FAVORITES_MESSAGE;
        }
        if (i != 2) {
            return null;
        }
        return FAVORITES_MERGE_FAVORITE;
    }

    private FavoritesType(int i) {
        this.value = i;
    }
}
