package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;

public class NormalState extends BaseEventChipViewAttribute {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBorderColor() {
        return C32634ae.m125178a(R.color.bg_body);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getLogoColor() {
        if (CalendarSkinColorTool.SkinType.DARK.equals(C30022a.f74884c.mo108456c().getSkinType())) {
            return -1;
        }
        return CalendarSkinColorTool.m124929c(this.eventColor);
    }

    public NormalState(int i, int i2, int i3) {
        super(i, i2, i3);
        this.state = 1;
    }
}
