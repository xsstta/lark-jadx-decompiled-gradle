package com.ss.android.lark.calendar.impl.features.meetingroom.base.helper;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;", "", "startTime", "", "endTime", "attendeeList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(JJLjava/util/List;)V", "getAttendeeList", "()Ljava/util/List;", "getEndTime", "()J", "getStartTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.b */
public final class OriginalEventData {

    /* renamed from: a */
    public static final Companion f81971a = new Companion(null);

    /* renamed from: b */
    private final long f81972b;

    /* renamed from: c */
    private final long f81973c;

    /* renamed from: d */
    private final List<CalendarEventAttendee> f81974d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalEventData)) {
            return false;
        }
        OriginalEventData bVar = (OriginalEventData) obj;
        return this.f81972b == bVar.f81972b && this.f81973c == bVar.f81973c && Intrinsics.areEqual(this.f81974d, bVar.f81974d);
    }

    public int hashCode() {
        long j = this.f81972b;
        long j2 = this.f81973c;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<CalendarEventAttendee> list = this.f81974d;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "OriginalEventData(startTime=" + this.f81972b + ", endTime=" + this.f81973c + ", attendeeList=" + this.f81974d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData$Companion;", "", "()V", "getOriginalEventData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;", "originalEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OriginalEventData mo117025a(CalendarEvent calendarEvent) {
            if (calendarEvent != null) {
                return new OriginalEventData(calendarEvent.getStartTime(), calendarEvent.getEndTime(), calendarEvent.getAttendees());
            }
            return null;
        }
    }

    /* renamed from: a */
    public final long mo117019a() {
        return this.f81972b;
    }

    /* renamed from: b */
    public final long mo117020b() {
        return this.f81973c;
    }

    /* renamed from: c */
    public final List<CalendarEventAttendee> mo117021c() {
        return this.f81974d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    public OriginalEventData(long j, long j2, List<? extends CalendarEventAttendee> list) {
        this.f81972b = j;
        this.f81973c = j2;
        this.f81974d = list;
    }
}
