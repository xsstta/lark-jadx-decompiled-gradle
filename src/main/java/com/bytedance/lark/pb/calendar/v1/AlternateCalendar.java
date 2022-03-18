package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum AlternateCalendar implements WireEnum {
    NONE_CALENDAR(0),
    CHINESE_LUNAR_CALENDAR(1);
    
    public static final ProtoAdapter<AlternateCalendar> ADAPTER = ProtoAdapter.newEnumAdapter(AlternateCalendar.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static AlternateCalendar fromValue(int i) {
        if (i == 0) {
            return NONE_CALENDAR;
        }
        if (i != 1) {
            return null;
        }
        return CHINESE_LUNAR_CALENDAR;
    }

    private AlternateCalendar(int i) {
        this.value = i;
    }
}
