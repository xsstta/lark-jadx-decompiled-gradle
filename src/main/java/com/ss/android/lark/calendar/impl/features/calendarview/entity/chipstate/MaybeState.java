package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.C30803a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import com.ss.android.lark.calendar.p1430a.C30022a;

public class MaybeState extends BaseEventChipViewAttribute {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBackGroundColor() {
        return this.eventColor;
    }

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

    /* access modifiers changed from: protected */
    public float[] getStripeAlphas() {
        return new float[]{C30803a.m114890a(), C30803a.m114891b()};
    }

    /* access modifiers changed from: protected */
    public int[] getStripeColors() {
        return new int[]{C32634ae.m125178a(R.color.bg_base), C32634ae.m125178a(R.color.bg_base)};
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int[] getStripColorsWithAlpha() {
        return new int[]{C32658j.m125333a(C32634ae.m125178a(R.color.bg_base), (double) C30803a.m114890a()), C32658j.m125333a(C32634ae.m125178a(R.color.bg_base), (double) C30803a.m114891b())};
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public Drawable getStripBgDrawable(int i, int i2) {
        return generateStripeDrawable(getStripeColors(), getStripeAlphas(), i, i2);
    }

    public MaybeState(int i, int i2, int i3) {
        super(i, i2, i3);
        this.state = 3;
    }
}
