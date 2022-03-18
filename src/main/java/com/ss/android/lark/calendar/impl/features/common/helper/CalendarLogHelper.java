package com.ss.android.lark.calendar.impl.features.common.helper;

import com.bytedance.lark.sdk.Sdk;
import com.google.gson.Gson;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J(\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0002J$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0013\u001a\u00020\nJ\u001c\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bJ\u0016\u0010\u0017\u001a\u00020\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/helper/CalendarLogHelper;", "", "()V", "addCalendarLogData", "", "calendarItem", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "thirdPartyCalendars", "", "", "", "getCalendarMemberLogData", "", "calendarMembers", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "logCalendarEventOnScreenShot", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "currentMeetingRoom", "scenario", "logCalendarManager", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "logCalendarSelectorData", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.c.d */
public final class CalendarLogHelper {

    /* renamed from: a */
    public static final CalendarLogHelper f78612a = new CalendarLogHelper();

    private CalendarLogHelper() {
    }

    /* renamed from: b */
    private final List<Map<String, String>> m116174b(List<CalendarMember> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String calendarId = t.getCalendarId();
            if (calendarId == null) {
                calendarId = "";
            }
            linkedHashMap.put("calendar_id", calendarId);
            linkedHashMap.put("member_type", t.getMemberType().toString());
            linkedHashMap.put("access_role", t.getAccessRole().toString());
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo112732a(List<? extends DataListItem> list) {
        boolean z;
        List<? extends DataListItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165389i("CalendarScreenShotLog", "current show calendar is empty");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DataListItem dataListItem = (DataListItem) list.get(i);
                if (dataListItem.mo109833r() == DataListItem.TYPE.CELL) {
                    if (!dataListItem.mo109838w()) {
                        if (!dataListItem.mo109839x()) {
                            if (dataListItem.mo109836u()) {
                                m116173a(dataListItem, arrayList4);
                            } else if (dataListItem.mo109831p()) {
                                m116173a(dataListItem, arrayList);
                            } else {
                                m116173a(dataListItem, arrayList2);
                            }
                        }
                    }
                    m116173a(dataListItem, arrayList3);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("scenario", "calendar_tab");
            linkedHashMap.put("my_calendars", arrayList);
            linkedHashMap.put("subscribed_calendars", arrayList2);
            linkedHashMap.put("third_party_calendars", arrayList3);
            linkedHashMap.put("local_calendars", arrayList4);
            String str = "user screenshot accompanying infos:" + new Gson().toJson(linkedHashMap);
            Log.m165389i("CalendarScreenShotLog", C32673y.m125378d(str));
            Sdk.log("", str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private final void m116173a(DataListItem dataListItem, List<Map<String, String>> list) {
        if (dataListItem.mo109832q()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String a = dataListItem.mo109806a();
            String str = "";
            if (a == null) {
                a = str;
            }
            linkedHashMap.put("caclendar_id", a);
            String valueOf = String.valueOf(dataListItem.mo109816c());
            if (valueOf != null) {
                str = valueOf;
            }
            linkedHashMap.put("visibility_property", str);
            list.add(linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo112730a(Calendar calendar, List<CalendarMember> list) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(list, "calendarMembers");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("scenario", "calendar_config");
            String serverId = calendar.getServerId();
            if (serverId == null) {
                serverId = "";
            }
            linkedHashMap.put("calendar_id", serverId);
            linkedHashMap.put(ShareHitPoint.f121869d, calendar.getType());
            linkedHashMap.put("is_visible", Boolean.valueOf(calendar.isVisible()));
            linkedHashMap.put("is_public", Boolean.valueOf(calendar.isPublic()));
            linkedHashMap.put("is_active", Boolean.valueOf(calendar.isActive()));
            linkedHashMap.put("self_access_role", calendar.getSelfAccessRole());
            linkedHashMap.put("members", f78612a.m116174b(list));
            String str = "user screenshot accompanying infos:" + new Gson().toJson(linkedHashMap);
            Log.m165389i("CalendarScreenShotLog", C32673y.m125378d(str));
            Sdk.log("", str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo112731a(CalendarEvent calendarEvent, List<String> list, String str) {
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(list, "currentMeetingRoom");
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject put = jSONObject.put("scenario", str).put("calendar_id", calendarEvent.getCalendarId()).put("Key", calendarEvent.getKey()).put("original_time", calendarEvent.getOriginalTime()).put("dirty_type", calendarEvent.getDirtyType()).put("needUpdate", calendarEvent.isNeedUpdate()).put("isAllDay", calendarEvent.isAllDay()).put("startTime", calendarEvent.getStartTime()).put("startTimezone", calendarEvent.getStartTimeZone()).put("endTime", calendarEvent.getEndTime()).put("endTimezone", calendarEvent.getEndTimeZone());
            CalendarEventAttendee creator = calendarEvent.getCreator();
            String str4 = null;
            if (creator != null) {
                str2 = creator.getAttendeeCalendarId();
            } else {
                str2 = null;
            }
            JSONObject put2 = put.put("creator_calendar_id", str2);
            CalendarEventAttendee successor = calendarEvent.getSuccessor();
            if (successor != null) {
                str3 = successor.getAttendeeCalendarId();
            } else {
                str3 = null;
            }
            JSONObject put3 = put2.put("successor_calendar_id", str3);
            CalendarEventAttendee organizer = calendarEvent.getOrganizer();
            if (organizer != null) {
                str4 = organizer.getAttendeeCalendarId();
            }
            put3.put("organizer_calendar_id", str4).put("resource_calendar_ids", list);
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
            Log.m165389i("CalendarScreenShotLog", C32673y.m125378d(jSONObject2));
            Sdk.log("", "user screenshot accompanying infos: " + jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
