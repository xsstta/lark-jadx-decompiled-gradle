package com.ss.android.lark.calendar.impl.features.meetingroom.append.p1539b;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0001¨\u0006\u0007"}, d2 = {"transfer2AppendResourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "buildingName", "", "transfer2CalendarEventAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.b.a */
public final class C32002a {
    /* renamed from: a */
    public static final CalendarEventAttendee m121827a(AppendResourceData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$transfer2CalendarEventAttendee");
        CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
        CalendarResource b = aVar.mo116888b();
        String str = b.calendar_id;
        if (str == null) {
            str = "";
        }
        calendarEventAttendee.setAttendeeCalendarId(str);
        calendarEventAttendee.setDisplayName(aVar.mo116887a());
        calendarEventAttendee.setLocalizedDisplayName(aVar.mo116887a());
        calendarEventAttendee.setSchemaCollection(C32514b.m124522a(b.resource_schema));
        calendarEventAttendee.setSchemaExtraData(C32514b.m124535a(b.schema_extra_data));
        String str2 = b.tenant_id;
        if (str2 == null) {
            str2 = "";
        }
        calendarEventAttendee.setTenantId(str2);
        calendarEventAttendee.setId("");
        calendarEventAttendee.setOriginalTime(0);
        calendarEventAttendee.setIsOptional(false);
        calendarEventAttendee.setIsOrganizer(false);
        calendarEventAttendee.setIsResource(true);
        calendarEventAttendee.setDeletable(true);
        calendarEventAttendee.setDisabled(false);
        calendarEventAttendee.setIsEditable(true);
        calendarEventAttendee.setStatus(CalendarEventAttendee.Status.NEEDS_ACTION);
        return calendarEventAttendee;
    }
}
