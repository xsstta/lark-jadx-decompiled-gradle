package com.ss.android.lark.calendar.impl.features.calendarview.entity;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.HashMap;

public class ListEventChipViewData extends EventChipViewData {
    private static final long serialVersionUID = 1;
    int currentDay;
    int eventTotalDays;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public String getEventLocation() {
        String eventLocation = super.getEventLocation();
        String a = C32646c.m125250a(getStartTime() * 1000, getEndTime() * 1000, isAllDay(), this.eventTotalDays, this.currentDay, true);
        if (TextUtils.isEmpty(eventLocation)) {
            return a;
        }
        return a + " " + eventLocation;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public String getEventTitle() {
        String eventTitle = super.getEventTitle();
        if (this.eventTotalDays <= 1) {
            return eventTitle;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("day", Integer.toString(this.currentDay));
        hashMap.put("total", Integer.toString(this.eventTotalDays));
        return eventTitle + C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_View_AlldayInfo, hashMap);
    }

    public ListEventChipViewData(EventChipViewData eventChipViewData) {
        super(eventChipViewData);
    }

    public void setCurrentDay(int i) {
        this.currentDay = i;
    }

    public void setEventTotalDays(int i) {
        this.eventTotalDays = i;
    }

    public ListEventChipViewData(CalendarEventInstance calendarEventInstance) {
        super(calendarEventInstance);
    }
}
