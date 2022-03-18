package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeetingEventInfo;", "", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "startEndTime", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoStartEndTime;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoStartEndTime;)V", "getEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getStartEndTime", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoStartEndTime;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.g */
public final class DoVideoMeetingEventInfo {

    /* renamed from: a */
    private final CalendarEvent f83604a;

    /* renamed from: b */
    private final DoStartEndTime f83605b;

    /* renamed from: a */
    public final CalendarEvent mo120087a() {
        return this.f83604a;
    }

    /* renamed from: b */
    public final DoStartEndTime mo120088b() {
        return this.f83605b;
    }

    public DoVideoMeetingEventInfo(CalendarEvent calendarEvent, DoStartEndTime fVar) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        this.f83604a = calendarEvent;
        this.f83605b = fVar;
    }
}
