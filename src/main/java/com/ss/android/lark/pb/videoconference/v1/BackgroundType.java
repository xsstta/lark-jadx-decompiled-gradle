package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BackgroundType implements WireEnum {
    All(0),
    Add(1),
    Update(2),
    Delete(3),
    HasSyncFailer(4),
    HasCountLimit(5);
    
    public static final ProtoAdapter<BackgroundType> ADAPTER = ProtoAdapter.newEnumAdapter(BackgroundType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static BackgroundType fromValue(int i) {
        if (i == 0) {
            return All;
        }
        if (i == 1) {
            return Add;
        }
        if (i == 2) {
            return Update;
        }
        if (i == 3) {
            return Delete;
        }
        if (i == 4) {
            return HasSyncFailer;
        }
        if (i != 5) {
            return null;
        }
        return HasCountLimit;
    }

    private BackgroundType(int i) {
        this.value = i;
    }
}
