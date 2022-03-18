package com.ss.android.lark.calendar.impl.features.events.edit.helper;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005J\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/CalendarEventHelper;", "", "()V", "getDuration", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "isRepeatOrExceptionEvent", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.a */
public final class CalendarEventHelper {

    /* renamed from: a */
    public static final CalendarEventHelper f79926a = new CalendarEventHelper();

    private CalendarEventHelper() {
    }

    /* renamed from: a */
    public final long mo114597a(CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "$this$getDuration");
        return calendarEvent.getEndTime() - calendarEvent.getStartTime();
    }
}
