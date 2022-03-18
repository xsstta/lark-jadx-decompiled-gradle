package com.ss.android.lark.calendar.impl.rustadapter.p1575c;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstanceUnit;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SearchMeetingRoom;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.g */
public interface AbstractC32595g {
    /* renamed from: a */
    void mo119031a(long j, long j2, String str, int i, String str2, boolean z, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<SearchMeetingRoom> iGetDataCallback);

    /* renamed from: a */
    void mo119033a(long j, long j2, List<String> list, String str, boolean z, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<Map<String, CalendarResource>> iGetDataCallback);

    /* renamed from: a */
    void mo119034a(IGetDataCallback<Map<String, Calendar>> iGetDataCallback);

    /* renamed from: a */
    void mo119035a(IGetDataCallback<CalendarSetting> iGetDataCallback, CalendarSetting calendarSetting);

    /* renamed from: a */
    void mo119037a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo119038a(List<String> list, long j, long j2, String str, List<String> list2, IGetDataCallback<CalendarEventInstanceUnit> iGetDataCallback);

    /* renamed from: a */
    void mo119039a(List<String> list, IGetDataCallback<List<Calendar>> iGetDataCallback);

    /* renamed from: b */
    void mo119041b(IGetDataCallback<Map<String, CalendarBuilding>> iGetDataCallback);

    /* renamed from: b */
    void mo119042b(List<String> list, IGetDataCallback<Map<String, AbstractC30026d>> iGetDataCallback);

    /* renamed from: c */
    CalendarSetting mo119043c();

    /* renamed from: c */
    void mo119044c(IGetDataCallback<CalendarSetting> iGetDataCallback);

    /* renamed from: c */
    void mo119045c(List<String> list, IGetDataCallback<Map<String, CalendarEventAttendee>> iGetDataCallback);

    /* renamed from: d */
    void mo119046d(IGetDataCallback<Calendar> iGetDataCallback);

    /* renamed from: d */
    void mo119047d(List<String> list, IGetDataCallback<Map<String, CalendarEventAttendee>> iGetDataCallback);
}
