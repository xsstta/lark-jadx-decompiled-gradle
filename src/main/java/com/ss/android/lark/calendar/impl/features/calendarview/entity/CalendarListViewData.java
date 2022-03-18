package com.ss.android.lark.calendar.impl.features.calendarview.entity;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class CalendarListViewData implements AbstractC26248b<CalendarListViewData>, Serializable {
    private static final long serialVersionUID = 1;
    CalendarDate date;
    int dateJulian;
    ListEventChipViewData eventChipViewData;
    boolean isDayFirstInstance;
    boolean isDayLastInstance;
    boolean isTempData;
    int viewTye;

    public ListEventChipViewData getEventChipViewData() {
        return this.eventChipViewData;
    }

    public int getJulianDay() {
        return this.dateJulian;
    }

    public CalendarDate getViewDate() {
        return this.date;
    }

    public int getViewType() {
        return this.viewTye;
    }

    public boolean isDayFirstInstance() {
        return this.isDayFirstInstance;
    }

    public boolean isDayLastInstance() {
        return this.isDayLastInstance;
    }

    public boolean isTempData() {
        return this.isTempData;
    }

    public int getMonthDay() {
        return this.date.getMonthDay();
    }

    public String getMonthShortString() {
        return C32646c.m125259a(this.date, true);
    }

    public String getWeekDay() {
        return C32634ae.m125183c(R.array.weeks_short)[this.date.getWeekDay() - 1];
    }

    public boolean isCurrentDay() {
        if (this.date.getJulianDay() == new CalendarDate().getJulianDay()) {
            return true;
        }
        return false;
    }

    public int getTimeTextColor() {
        CalendarDate calendarDate = new CalendarDate();
        int julianDay = this.date.getJulianDay();
        int julianDay2 = calendarDate.getJulianDay();
        if (julianDay - julianDay2 > 0) {
            return C32634ae.m125178a(R.color.text_title);
        }
        if (julianDay == julianDay2) {
            return C32634ae.m125178a(R.color.lkui_B500);
        }
        return C32634ae.m125178a(R.color.lkui_N400);
    }

    public String getMonthString() {
        LengthType lengthType;
        CalendarDate calendarDate = new CalendarDate();
        Options aVar = new Options();
        aVar.mo191595a(this.date.getTimeZone().getID());
        aVar.mo191591a(DatePreciseness.MONTH);
        if (calendarDate.getYear() != this.date.getYear()) {
            lengthType = LengthType.LONG;
        } else {
            lengthType = LengthType.SHORT;
        }
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        return TimeFormatUtils.m219289e(C32634ae.m125179a(), new Date(this.date.getTimeInMilliSeconds()), aVar);
    }

    public void setIsDayFirstInstance(boolean z) {
        this.isDayFirstInstance = z;
    }

    public void setIsDayLastInstance(boolean z) {
        this.isDayLastInstance = z;
    }

    public void setTempData(boolean z) {
        this.isTempData = z;
    }

    public static String ordinal(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            return i + "st";
        } else if (i2 == 2) {
            return i + "nd";
        } else if (i2 == 3) {
            return i + "rd";
        } else {
            return i + "th";
        }
    }

    public String getYearWeekStr(CalendarSetting.DayOfWeek dayOfWeek) {
        int yearWeek = this.date.getYearWeek(dayOfWeek);
        CalendarDate addDay = this.date.addDay(6);
        Options aVar = new Options();
        aVar.mo191595a(this.date.getTimeZone().getID());
        aVar.mo191593a(LengthType.SHORT);
        String b = TimeFormatUtils.m219284b(C32634ae.m125179a(), new Date(this.date.getTimeInMilliSeconds()), new Date(addDay.getTimeInMilliSeconds()), aVar);
        String valueOf = String.valueOf(yearWeek);
        HashMap hashMap = new HashMap();
        hashMap.put("number", valueOf);
        hashMap.put("dateRange", b);
        return C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_StandardTime_WeekDateRangeCombineFormat, hashMap);
    }

    public boolean isContentSame(CalendarListViewData calendarListViewData) {
        if (this.viewTye != calendarListViewData.getViewType()) {
            return false;
        }
        if (getViewType() != 0) {
            return true;
        }
        try {
            if (isDayFirstInstance() != calendarListViewData.isDayFirstInstance() || isDayLastInstance() != calendarListViewData.isDayLastInstance()) {
                return false;
            }
            ListEventChipViewData eventChipViewData2 = getEventChipViewData();
            ListEventChipViewData eventChipViewData3 = calendarListViewData.getEventChipViewData();
            if (eventChipViewData2.getCalendarEventInstance().getEventType().equals(eventChipViewData3.getCalendarEventInstance().getEventType()) && eventChipViewData2.getEventTitle().equals(eventChipViewData3.getEventTitle()) && eventChipViewData2.getEventLocation().equals(eventChipViewData3.getEventLocation()) && eventChipViewData2.getAttribute().isSame(eventChipViewData3.getAttribute())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public boolean isItemSame(CalendarListViewData calendarListViewData) {
        if (this == calendarListViewData) {
            return true;
        }
        if (getJulianDay() != calendarListViewData.getJulianDay()) {
            return false;
        }
        if (!((this.isDayFirstInstance && calendarListViewData.isDayFirstInstance) || this.viewTye == 3 || calendarListViewData.getViewType() == 3)) {
            if (this.viewTye != calendarListViewData.getViewType()) {
                return false;
            }
            if (getViewType() == 0) {
                ListEventChipViewData eventChipViewData2 = getEventChipViewData();
                ListEventChipViewData eventChipViewData3 = calendarListViewData.getEventChipViewData();
                if (!(eventChipViewData2 == null || eventChipViewData3 == null)) {
                    try {
                        return eventChipViewData2.getCalendarEventInstance().getEventServerId().equals(eventChipViewData3.getCalendarEventInstance().getEventServerId());
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public CalendarListViewData(CalendarDate calendarDate, int i, CalendarDate calendarDate2) {
        this.date = calendarDate;
        this.dateJulian = calendarDate.getJulianDay();
        this.viewTye = i;
    }

    public CalendarListViewData(CalendarDate calendarDate, ListEventChipViewData listEventChipViewData, CalendarDate calendarDate2) {
        this.date = calendarDate;
        this.dateJulian = calendarDate.getJulianDay();
        this.viewTye = 0;
        this.eventChipViewData = listEventChipViewData;
    }
}
