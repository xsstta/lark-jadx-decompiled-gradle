package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.C30803a;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.C31106b;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.C31107c;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;

public abstract class BaseEventChipViewAttribute implements EventChipViewAttribute {
    private static final long serialVersionUID = 1;
    int calendarColor;
    int eventColor;
    int state;
    int textColor;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public Drawable getStripBgDrawable(int i, int i2) {
        return null;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int[] getStripColorsWithAlpha() {
        return null;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean showAppendStr() {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean showEventStr() {
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean textSTRIKE() {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getTextColor() {
        return this.textColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public String appendStr() {
        return C32634ae.m125182b(R.string.Calendar_Edit_addEventNamedTitle);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getHighlightColor() {
        return CalendarSkinColorTool.m124919a(this.eventColor);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getBackGroundColor() {
        return C32658j.m125333a(this.eventColor, (double) C30803a.m114896g());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public boolean needDrawCalendar() {
        if (this.eventColor != this.calendarColor) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getCalendarColor() {
        if (CalendarSkinColorTool.SkinType.LIGHT.equals(C30022a.f74884c.mo108456c().getSkinType())) {
            return CalendarSkinColorTool.m124929c(this.calendarColor);
        }
        return this.calendarColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public int getDragColor() {
        if (CalendarSkinColorTool.SkinType.DARK.equals(C30022a.f74884c.mo108456c().getSkinType())) {
            return this.eventColor;
        }
        return this.textColor;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public Drawable getBaseBgDrawable(int i) {
        float f = (float) i;
        return ao.m125218a(C32634ae.m125178a(R.color.bg_body), new float[]{f, f, f, f}, 0, 0);
    }

    public boolean isSame(BaseEventChipViewAttribute baseEventChipViewAttribute) {
        if (this.state == baseEventChipViewAttribute.state && this.eventColor == baseEventChipViewAttribute.eventColor && this.calendarColor == baseEventChipViewAttribute.calendarColor && this.textColor == baseEventChipViewAttribute.textColor) {
            return true;
        }
        return false;
    }

    public BaseEventChipViewAttribute(int i, int i2, int i3) {
        this.eventColor = i;
        this.calendarColor = i2;
        this.textColor = i3;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public Drawable getColorBgWithBorderDrawable(int i, int i2, boolean z) {
        int borderColor = getBorderColor();
        if (z) {
            borderColor = getDragColor();
        }
        float f = (float) i;
        return ao.m125218a(getBackGroundColor(), new float[]{f, f, f, f}, i2, borderColor);
    }

    /* access modifiers changed from: package-private */
    public Drawable generateStripeDrawable(int[] iArr, float[] fArr, int i, int i2) {
        if (C30022a.f74883b.mo112714v()) {
            return new C31106b(new int[]{C32658j.m125333a(iArr[0], (double) fArr[0]), C32658j.m125333a(iArr[1], (double) fArr[1])}, new float[]{15.0f, 15.0f}, i, i2);
        }
        return new C31107c(new int[]{C32658j.m125333a(iArr[0], (double) fArr[0]), C32658j.m125333a(iArr[1], (double) fArr[1])}, new float[]{15.0f, 15.0f}, 45.0f, i, i2);
    }
}
