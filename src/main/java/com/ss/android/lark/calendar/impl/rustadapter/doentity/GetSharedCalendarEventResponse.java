package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetSharedCalendarEventResponse;", "", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "isJoinable", "", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;Ljava/lang/Boolean;)V", "getCalendarEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;Ljava/lang/Boolean;)Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetSharedCalendarEventResponse;", "equals", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.l */
public final class GetSharedCalendarEventResponse {

    /* renamed from: a */
    private final CalendarEvent f83620a;

    /* renamed from: b */
    private final Boolean f83621b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSharedCalendarEventResponse)) {
            return false;
        }
        GetSharedCalendarEventResponse lVar = (GetSharedCalendarEventResponse) obj;
        return Intrinsics.areEqual(this.f83620a, lVar.f83620a) && Intrinsics.areEqual(this.f83621b, lVar.f83621b);
    }

    public int hashCode() {
        CalendarEvent calendarEvent = this.f83620a;
        int i = 0;
        int hashCode = (calendarEvent != null ? calendarEvent.hashCode() : 0) * 31;
        Boolean bool = this.f83621b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetSharedCalendarEventResponse(calendarEvent=" + this.f83620a + ", isJoinable=" + this.f83621b + ")";
    }

    /* renamed from: a */
    public final CalendarEvent mo120121a() {
        return this.f83620a;
    }

    /* renamed from: b */
    public final Boolean mo120122b() {
        return this.f83621b;
    }

    public GetSharedCalendarEventResponse(CalendarEvent calendarEvent, Boolean bool) {
        this.f83620a = calendarEvent;
        this.f83621b = bool;
    }
}
