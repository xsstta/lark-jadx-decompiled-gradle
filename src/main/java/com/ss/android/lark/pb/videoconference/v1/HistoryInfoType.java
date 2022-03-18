package com.ss.android.lark.pb.videoconference.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum HistoryInfoType implements WireEnum {
    HistoryInfoType_UNKNOWN(0),
    HistoryInfoType_VIDEO_CONFERENCE(1),
    HistoryInfoType_ENTERPRISE_PHONE(2);
    
    public static final ProtoAdapter<HistoryInfoType> ADAPTER = ProtoAdapter.newEnumAdapter(HistoryInfoType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static HistoryInfoType fromValue(int i) {
        if (i == 0) {
            return HistoryInfoType_UNKNOWN;
        }
        if (i == 1) {
            return HistoryInfoType_VIDEO_CONFERENCE;
        }
        if (i != 2) {
            return null;
        }
        return HistoryInfoType_ENTERPRISE_PHONE;
    }

    private HistoryInfoType(int i) {
        this.value = i;
    }
}
