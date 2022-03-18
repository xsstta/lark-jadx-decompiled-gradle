package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum VCSecuritySetting implements WireEnum {
    PUBLIC(0),
    SAME_TENANT(1),
    ONLY_CALENDAR_GUEST(2);
    
    public static final ProtoAdapter<VCSecuritySetting> ADAPTER = ProtoAdapter.newEnumAdapter(VCSecuritySetting.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static VCSecuritySetting fromValue(int i) {
        if (i == 0) {
            return PUBLIC;
        }
        if (i == 1) {
            return SAME_TENANT;
        }
        if (i != 2) {
            return null;
        }
        return ONLY_CALENDAR_GUEST;
    }

    private VCSecuritySetting(int i) {
        this.value = i;
    }
}
