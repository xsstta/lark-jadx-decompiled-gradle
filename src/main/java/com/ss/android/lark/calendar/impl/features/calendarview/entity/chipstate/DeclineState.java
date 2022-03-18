package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;

public class DeclineState extends BaseEventChipViewAttribute {
    int declineColor = C32634ae.m125178a(R.color.text_placeholder);
    int declineHighlightColor = C32634ae.m125178a(R.color.ud_N200);

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBackGroundColor() {
        return 0;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean needDrawCalendar() {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean textSTRIKE() {
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBorderColor() {
        return this.declineColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getDragColor() {
        return this.declineColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getHighlightColor() {
        return this.declineHighlightColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getLogoColor() {
        return this.declineColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getTextColor() {
        return this.declineColor;
    }

    public DeclineState(int i, int i2, int i3) {
        super(i, i2, i3);
        this.state = 2;
    }
}
