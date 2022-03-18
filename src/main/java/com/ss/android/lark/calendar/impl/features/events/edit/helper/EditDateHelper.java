package com.ss.android.lark.calendar.impl.features.events.edit.helper;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/EditDateHelper;", "", "()V", "getEventMeetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "calendarBuildingName", "", "getLocalTimeZoneEventStartDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "eventStartTime", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.d */
public final class EditDateHelper {

    /* renamed from: a */
    public static final EditDateHelper f79932a = new EditDateHelper();

    private EditDateHelper() {
    }

    /* renamed from: a */
    public final CalendarDate mo114613a(long j) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setTimeInSeconds(j);
        return calendarDate;
    }

    /* renamed from: a */
    public final EventMeetingRoomData mo114615a(CalendarResource calendarResource, String str) {
        if (calendarResource == null || str == null) {
            return null;
        }
        EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
        eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(str);
        eventMeetingRoomData.setCalendarResource(calendarResource);
        eventMeetingRoomData.setMCalendarId$calendar_impl_release(calendarResource.getCalendarId());
        eventMeetingRoomData.buildDisPlayText();
        return eventMeetingRoomData;
    }

    @Deprecated(message = "use getEventMeetingRoomData(CalendarResource?, String?)")
    /* renamed from: a */
    public final EventMeetingRoomData mo114614a(CalendarResource calendarResource, CalendarBuilding calendarBuilding) {
        if (calendarResource == null || calendarBuilding == null) {
            return null;
        }
        EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
        eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(calendarBuilding.getName());
        eventMeetingRoomData.setCalendarResource(calendarResource);
        eventMeetingRoomData.setMCalendarId$calendar_impl_release(calendarResource.getCalendarId());
        eventMeetingRoomData.buildDisPlayText();
        return eventMeetingRoomData;
    }
}
