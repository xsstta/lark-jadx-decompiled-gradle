package com.bytedance.lark.pb.calendar.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DayOfWeek implements WireEnum {
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);
    
    public static final ProtoAdapter<DayOfWeek> ADAPTER = ProtoAdapter.newEnumAdapter(DayOfWeek.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static DayOfWeek fromValue(int i) {
        switch (i) {
            case 0:
                return SUNDAY;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            default:
                return null;
        }
    }

    private DayOfWeek(int i) {
        this.value = i;
    }
}
