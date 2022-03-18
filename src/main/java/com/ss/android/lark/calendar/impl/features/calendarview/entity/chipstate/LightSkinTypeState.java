package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/chipstate/LightSkinTypeState;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/chipstate/NormalState;", "eventColor", "", "calendarColor", "textColor", "(III)V", "getBackGroundColor", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LightSkinTypeState extends NormalState {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBackGroundColor() {
        return this.eventColor;
    }

    public LightSkinTypeState(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
