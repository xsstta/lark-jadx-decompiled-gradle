package com.ss.android.lark.calendar.impl.features.calendars.detail.p1448b;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"buildCalendarMemberInfo", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "member", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.f */
public final class C30244f {
    /* renamed from: a */
    public static final CalendarMemberInfo m112361a(Calendar calendar, CalendarMember calendarMember) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(calendarMember, "member");
        return new CalendarMemberInfo(C30237a.m112298b(calendarMember), C30237a.m112290a(calendarMember), calendarMember.avatar_key, calendarMember.access_role, Intrinsics.areEqual(calendar.calendar_owner_id, calendarMember.user_id));
    }
}
