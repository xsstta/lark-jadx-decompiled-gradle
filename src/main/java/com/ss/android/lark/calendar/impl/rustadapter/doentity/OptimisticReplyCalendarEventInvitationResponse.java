package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OptimisticReplyCalendarEventInvitationResponse;", "", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "chatId", "", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "setEvent", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.s */
public final class OptimisticReplyCalendarEventInvitationResponse {

    /* renamed from: a */
    private CalendarEvent f83665a;

    /* renamed from: b */
    private String f83666b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptimisticReplyCalendarEventInvitationResponse)) {
            return false;
        }
        OptimisticReplyCalendarEventInvitationResponse sVar = (OptimisticReplyCalendarEventInvitationResponse) obj;
        return Intrinsics.areEqual(this.f83665a, sVar.f83665a) && Intrinsics.areEqual(this.f83666b, sVar.f83666b);
    }

    public int hashCode() {
        CalendarEvent calendarEvent = this.f83665a;
        int i = 0;
        int hashCode = (calendarEvent != null ? calendarEvent.hashCode() : 0) * 31;
        String str = this.f83666b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OptimisticReplyCalendarEventInvitationResponse(event=" + this.f83665a + ", chatId=" + this.f83666b + ")";
    }

    /* renamed from: a */
    public final CalendarEvent mo120208a() {
        return this.f83665a;
    }

    /* renamed from: b */
    public final String mo120209b() {
        return this.f83666b;
    }

    public OptimisticReplyCalendarEventInvitationResponse(CalendarEvent calendarEvent, String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f83665a = calendarEvent;
        this.f83666b = str;
    }
}
