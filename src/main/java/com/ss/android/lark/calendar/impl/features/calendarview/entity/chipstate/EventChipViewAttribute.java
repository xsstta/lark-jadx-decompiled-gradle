package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import android.graphics.drawable.Drawable;
import java.io.Serializable;

public interface EventChipViewAttribute extends Serializable {
    String appendStr();

    int getBackGroundColor();

    Drawable getBaseBgDrawable(int i);

    int getBorderColor();

    int getCalendarColor();

    Drawable getColorBgWithBorderDrawable(int i, int i2, boolean z);

    int getDragColor();

    int getHighlightColor();

    int getLogoColor();

    Drawable getStripBgDrawable(int i, int i2);

    int[] getStripColorsWithAlpha();

    int getTextColor();

    boolean needDrawCalendar();

    boolean showAppendStr();

    boolean showEventStr();

    boolean textSTRIKE();
}
