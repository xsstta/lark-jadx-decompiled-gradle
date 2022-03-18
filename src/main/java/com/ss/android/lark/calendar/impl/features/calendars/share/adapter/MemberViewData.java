package com.ss.android.lark.calendar.impl.features.calendars.share.adapter;

import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/MemberViewData;", "", "calendarMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;)V", "getCalendarMember", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.d */
public final class MemberViewData {

    /* renamed from: a */
    private final CalendarMember f76227a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MemberViewData) && Intrinsics.areEqual(this.f76227a, ((MemberViewData) obj).f76227a);
        }
        return true;
    }

    public int hashCode() {
        CalendarMember calendarMember = this.f76227a;
        if (calendarMember != null) {
            return calendarMember.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MemberViewData(calendarMember=" + this.f76227a + ")";
    }

    /* renamed from: a */
    public final CalendarMember mo109905a() {
        return this.f76227a;
    }

    public MemberViewData(CalendarMember calendarMember) {
        Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
        this.f76227a = calendarMember;
    }
}
