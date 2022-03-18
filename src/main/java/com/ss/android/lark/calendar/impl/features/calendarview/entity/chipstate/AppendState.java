package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.C30803a;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import com.ss.android.lark.calendar.impl.utils.ao;

public class AppendState extends BaseEventChipViewAttribute {
    static int appendColor = C32634ae.m125178a(R.color.primary_pri_500);
    static int appendTextColor = C32634ae.m125178a(R.color.primary_pri_500);

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getLogoColor() {
        return 0;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean needDrawCalendar() {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean showAppendStr() {
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean showEventStr() {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBorderColor() {
        return this.eventColor;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppendState() {
        /*
            r2 = this;
            int r0 = com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState.appendColor
            int r1 = com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState.appendTextColor
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState.<init>():void");
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public String appendStr() {
        return C32634ae.m125182b(R.string.Calendar_Edit_addEventNamedTitle);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBackGroundColor() {
        return C32658j.m125333a(this.eventColor, (double) C30803a.m114895f());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public Drawable getBaseBgDrawable(int i) {
        float f = (float) i;
        return ao.m125218a(C32658j.m125333a(C32634ae.m125178a(R.color.ud_N00), (double) C30803a.m114894e()), new float[]{f, f, f, f}, 0, 0);
    }
}
