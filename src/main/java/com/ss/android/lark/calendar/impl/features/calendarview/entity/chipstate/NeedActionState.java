package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.C30803a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;

public class NeedActionState extends BaseEventChipViewAttribute {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBackGroundColor() {
        return 0;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBorderColor() {
        return this.textColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getLogoColor() {
        return CalendarSkinColorTool.m124929c(this.eventColor);
    }

    /* access modifiers changed from: protected */
    public float[] getStripeAlphas() {
        return new float[]{C30803a.m114893d(), C30803a.m114892c()};
    }

    /* access modifiers changed from: protected */
    public int[] getStripeColors() {
        return new int[]{C32634ae.m125178a(R.color.bg_body), this.eventColor};
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int[] getStripColorsWithAlpha() {
        return new int[]{C32658j.m125333a(C32634ae.m125178a(R.color.bg_body), (double) C30803a.m114893d()), C32658j.m125333a(this.eventColor, (double) C30803a.m114892c())};
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public Drawable getStripBgDrawable(int i, int i2) {
        return generateStripeDrawable(getStripeColors(), getStripeAlphas(), i, i2);
    }

    public NeedActionState(int i, int i2, int i3) {
        super(i, i2, i3);
        this.state = 4;
    }
}
