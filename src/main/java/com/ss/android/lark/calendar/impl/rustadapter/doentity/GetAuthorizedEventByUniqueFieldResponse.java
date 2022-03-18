package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse;", "", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "eventSource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse$EventSource;", "fixedStartTime", "", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse$EventSource;J)V", "getCalendarEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "setCalendarEvent", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "getEventSource", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse$EventSource;", "setEventSource", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse$EventSource;)V", "getFixedStartTime", "()J", "setFixedStartTime", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "EventSource", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GetAuthorizedEventByUniqueFieldResponse {

    /* renamed from: a */
    private CalendarEvent f83571a;

    /* renamed from: b */
    private EventSource f83572b;

    /* renamed from: c */
    private long f83573c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse$EventSource;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "Server", "Local", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum EventSource {
        Server(1),
        Local(2);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse$EventSource$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse$EventSource;", "value", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.GetAuthorizedEventByUniqueFieldResponse$EventSource$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final EventSource mo119863a(int i) {
                if (i == 1) {
                    return EventSource.Server;
                }
                if (i != 2) {
                    return EventSource.Server;
                }
                return EventSource.Local;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private EventSource(int i) {
            this.number = i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthorizedEventByUniqueFieldResponse)) {
            return false;
        }
        GetAuthorizedEventByUniqueFieldResponse getAuthorizedEventByUniqueFieldResponse = (GetAuthorizedEventByUniqueFieldResponse) obj;
        return Intrinsics.areEqual(this.f83571a, getAuthorizedEventByUniqueFieldResponse.f83571a) && Intrinsics.areEqual(this.f83572b, getAuthorizedEventByUniqueFieldResponse.f83572b) && this.f83573c == getAuthorizedEventByUniqueFieldResponse.f83573c;
    }

    public int hashCode() {
        CalendarEvent calendarEvent = this.f83571a;
        int i = 0;
        int hashCode = (calendarEvent != null ? calendarEvent.hashCode() : 0) * 31;
        EventSource eventSource = this.f83572b;
        if (eventSource != null) {
            i = eventSource.hashCode();
        }
        long j = this.f83573c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "GetAuthorizedEventByUniqueFieldResponse(calendarEvent=" + this.f83571a + ", eventSource=" + this.f83572b + ", fixedStartTime=" + this.f83573c + ")";
    }

    /* renamed from: a */
    public final CalendarEvent mo119856a() {
        return this.f83571a;
    }

    /* renamed from: b */
    public final EventSource mo119857b() {
        return this.f83572b;
    }

    /* renamed from: c */
    public final long mo119858c() {
        return this.f83573c;
    }

    public GetAuthorizedEventByUniqueFieldResponse(CalendarEvent calendarEvent, EventSource eventSource, long j) {
        Intrinsics.checkParameterIsNotNull(eventSource, "eventSource");
        this.f83571a = calendarEvent;
        this.f83572b = eventSource;
        this.f83573c = j;
    }
}
