package com.ss.android.lark.calendar.impl.features.calendarview.entity;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.search.EventHighLight;
import com.ss.android.lark.calendar.impl.features.search.HighLightTag;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventContent;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.SimpleTimeZone;

public class SearchEventChipViewData extends ListEventChipViewData {
    public SearchCalendarEventContent content;
    public SearchCalendarEventInstance instance;
    private String mAttendee;
    private String mDescription;
    private ArrayList<EventHighLight> mHighlights = new ArrayList<>();

    public String getAttendee() {
        return this.mAttendee;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public ArrayList<EventHighLight> getHighlights() {
        return this.mHighlights;
    }

    public String getRawLocation() {
        return getEventLocationActual();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public boolean needShowThirdLind() {
        if (!TextUtils.isEmpty(this.mAttendee) || !TextUtils.isEmpty(this.mDescription)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public int getCalendarColor() {
        return CalendarSkinColorTool.m124922a(String.valueOf(this.content.mo118176n()), C30022a.f74884c.mo108456c().getSkinType()).getBgColorBySkin(this.content.mo118174l());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public int getEventColor() {
        return CalendarSkinColorTool.m124922a(String.valueOf(this.content.mo118175m()), C30022a.f74884c.mo108456c().getSkinType()).getBgColorBySkin(this.content.mo118174l());
    }

    public String getTimeStrBeforeLocation() {
        String a = C32646c.m125250a(getStartTime() * 1000, getEndTime() * 1000, isAllDay(), this.eventTotalDays, this.currentDay, true);
        return a + " ";
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public int getTitleColor() {
        return CalendarSkinColorTool.m124922a(String.valueOf(this.content.mo118175m()), C30022a.f74884c.mo108456c().getSkinType()).getTitleColorBySkin(this.content.mo118174l());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public boolean needDrawEventFinishedMask() {
        if (this.mIsNeedForbidMask || !C30022a.f74884c.mo108456c().isShowPastEventsMask()) {
            return false;
        }
        SearchCalendarEventContent dVar = this.content;
        if (dVar == null || !dVar.mo118177o()) {
            long j = 0;
            SearchCalendarEventInstance eVar = this.instance;
            if (eVar != null) {
                j = eVar.mo118181c();
            }
            if (j * 1000 < System.currentTimeMillis()) {
                return true;
            }
            return false;
        } else if (new CalendarDate(new Date((this.instance.mo118181c() * 1000) - 1000), new SimpleTimeZone(0, "UTC")).getJulianDay() < new CalendarDate().getJulianDay()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public EventChipViewData.C30802a getThirdLineData() {
        boolean z;
        String str;
        String str2;
        String eventTitle = getEventTitle();
        String rawLocation = getRawLocation();
        String timeStrBeforeLocation = getTimeStrBeforeLocation();
        String attendee = getAttendee();
        String description = getDescription();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        EventChipView.C31086a aVar = new EventChipView.C31086a(-1, -1);
        EventChipView.C31086a aVar2 = new EventChipView.C31086a(-1, -1);
        EventChipView.C31086a aVar3 = new EventChipView.C31086a(-1, -1);
        EventChipView.C31086a aVar4 = new EventChipView.C31086a(-1, -1);
        for (Iterator<EventHighLight> it = getHighlights().iterator(); it.hasNext(); it = it) {
            EventHighLight next = it.next();
            if (next.getTag() == HighLightTag.SUMMARY) {
                arrayList.addAll(next.getHighlights());
                findFirstMatchIndex(next.getHighlights(), eventTitle, aVar);
            } else if (next.getTag() == HighLightTag.LOCATION || next.getTag() == HighLightTag.MEETING_ROOM) {
                arrayList2.addAll(next.getHighlights());
                findFirstMatchIndex(next.getHighlights(), rawLocation, aVar2);
            } else if (next.getTag() == HighLightTag.ATTENDEE || next.getTag() == HighLightTag.CHAT) {
                arrayList3.addAll(next.getHighlights());
                findFirstMatchIndex(next.getHighlights(), attendee, aVar3);
            } else if (next.getTag() == HighLightTag.DESCRIPTION) {
                arrayList4.addAll(next.getHighlights());
                findFirstMatchIndex(next.getHighlights(), description, aVar4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        EventChipView.C31086a aVar5 = new EventChipView.C31086a(-1, -1);
        if (!TextUtils.isEmpty(description) && (TextUtils.isEmpty(attendee) || (!arrayList4.isEmpty() && arrayList3.isEmpty()))) {
            str = C32634ae.m125182b(R.string.Calendar_Edit_Description) + ": ";
            str2 = getDescription();
            arrayList5 = arrayList4;
            aVar5 = aVar4;
        } else if (!TextUtils.isEmpty(attendee)) {
            str2 = getAttendee();
            arrayList5 = arrayList3;
            aVar5 = aVar3;
            str = "";
        } else {
            str2 = "";
            str = str2;
            z = false;
            return new EventChipViewData.C30802a(eventTitle, rawLocation, timeStrBeforeLocation, str2, str, aVar, aVar2, aVar5, arrayList, arrayList2, arrayList5, z);
        }
        z = true;
        return new EventChipViewData.C30802a(eventTitle, rawLocation, timeStrBeforeLocation, str2, str, aVar, aVar2, aVar5, arrayList, arrayList2, arrayList5, z);
    }

    public void setAttendee(String str) {
        this.mAttendee = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setHighlights(ArrayList<EventHighLight> arrayList) {
        this.mHighlights = arrayList;
    }

    public SearchEventChipViewData(SearchCalendarEventInstance eVar, SearchCalendarEventContent dVar) {
        super(convertToEventInstance(eVar, dVar));
        this.instance = eVar;
        this.content = dVar;
        this.mIsTitleShowCalendarName = true;
        if (!TextUtils.isEmpty(dVar.mo118168f())) {
            setAttendee(C32634ae.m125182b(R.string.Calendar_Detail_Organizer) + ": " + dVar.mo118168f());
        } else if (!TextUtils.isEmpty(dVar.mo118169g())) {
            setAttendee(C32634ae.m125182b(R.string.Calendar_Detail_Creator) + ": " + dVar.mo118169g());
        } else if (!TextUtils.isEmpty(dVar.mo118167e())) {
            setAttendee(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Common_Includes, "itemName", dVar.mo118167e()));
        }
        setDescription(dVar.mo118172j());
        setHighlights(dVar.mo118173k());
    }

    public static CalendarEventInstance convertToEventInstance(SearchCalendarEventInstance eVar, SearchCalendarEventContent dVar) {
        CalendarEventInstance calendarEventInstance = new CalendarEventInstance();
        CalendarDate calendarDate = CalendarDate.getCalendarDate(eVar.mo118180b() * 1000);
        CalendarDate calendarDate2 = CalendarDate.getCalendarDate(eVar.mo118181c() * 1000);
        CalendarDate calendarDate3 = CalendarDate.getCalendarDate(eVar.mo118184f() * 1000);
        CalendarDate calendarDate4 = CalendarDate.getCalendarDate(eVar.mo118185g() * 1000);
        if (eVar.mo118183e() > 1) {
            calendarEventInstance.setStartDay(calendarDate3.getJulianDay());
            calendarEventInstance.setEndDay(calendarDate4.getJulianDay());
        } else {
            calendarEventInstance.setStartDay(calendarDate.getJulianDay());
            calendarEventInstance.setEndDay(calendarDate2.getJulianDay());
        }
        calendarEventInstance.setStartMinute(calendarDate.getMinute());
        calendarEventInstance.setEndMinute(calendarDate2.getMinute());
        calendarEventInstance.setIsAllDay(dVar.mo118177o());
        calendarEventInstance.setStartTime(eVar.mo118180b());
        calendarEventInstance.setEndTime(eVar.mo118181c());
        calendarEventInstance.setEventId(eVar.mo118179a());
        calendarEventInstance.setKey(dVar.mo118164b());
        calendarEventInstance.setCalendarId(dVar.mo118163a());
        calendarEventInstance.setOriginalTime(dVar.mo118165c());
        calendarEventInstance.setDisplayType(CalendarEvent.DisplayType.FULL);
        calendarEventInstance.setSelfAttendeeStatus(dVar.mo118174l());
        calendarEventInstance.setSummary(dVar.mo118166d());
        calendarEventInstance.setImportanceScore("");
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.mo118170h());
        calendarEventInstance.setMeetingRooms(arrayList);
        CalendarLocation calendarLocation = new CalendarLocation();
        calendarLocation.setLocation(dVar.mo118171i());
        calendarEventInstance.setCalendarLocation(calendarLocation);
        return calendarEventInstance;
    }

    private void findFirstMatchIndex(ArrayList<String> arrayList, String str, EventChipView.C31086a aVar) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    int indexOf = lowerCase.indexOf(next.toLowerCase());
                    if ((aVar.f78454a == -1 && indexOf != -1) || (aVar.f78454a != -1 && indexOf < aVar.f78454a)) {
                        aVar.f78454a = indexOf;
                        aVar.f78455b = indexOf + next.length();
                    }
                }
            }
        }
    }
}
