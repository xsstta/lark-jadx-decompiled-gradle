package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/FetchCalendarData;", "Ljava/io/Serializable;", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "calendarMembers", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "calendarTenantInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "(Lcom/bytedance/lark/pb/calendar/v1/Calendar;Ljava/util/List;Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;)V", "getCalendar", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "setCalendar", "(Lcom/bytedance/lark/pb/calendar/v1/Calendar;)V", "getCalendarMembers", "()Ljava/util/List;", "setCalendarMembers", "(Ljava/util/List;)V", "getCalendarTenantInfo", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "setCalendarTenantInfo", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FetchCalendarData implements Serializable {
    private Calendar calendar;
    private List<CalendarMember> calendarMembers;
    private CalendarTenantInfo calendarTenantInfo;

    public FetchCalendarData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.rustadapter.doentity.FetchCalendarData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchCalendarData copy$default(FetchCalendarData fetchCalendarData, Calendar calendar2, List list, CalendarTenantInfo calendarTenantInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            calendar2 = fetchCalendarData.calendar;
        }
        if ((i & 2) != 0) {
            list = fetchCalendarData.calendarMembers;
        }
        if ((i & 4) != 0) {
            calendarTenantInfo2 = fetchCalendarData.calendarTenantInfo;
        }
        return fetchCalendarData.copy(calendar2, list, calendarTenantInfo2);
    }

    public final Calendar component1() {
        return this.calendar;
    }

    public final List<CalendarMember> component2() {
        return this.calendarMembers;
    }

    public final CalendarTenantInfo component3() {
        return this.calendarTenantInfo;
    }

    public final FetchCalendarData copy(Calendar calendar2, List<CalendarMember> list, CalendarTenantInfo calendarTenantInfo2) {
        Intrinsics.checkParameterIsNotNull(list, "calendarMembers");
        return new FetchCalendarData(calendar2, list, calendarTenantInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchCalendarData)) {
            return false;
        }
        FetchCalendarData fetchCalendarData = (FetchCalendarData) obj;
        return Intrinsics.areEqual(this.calendar, fetchCalendarData.calendar) && Intrinsics.areEqual(this.calendarMembers, fetchCalendarData.calendarMembers) && Intrinsics.areEqual(this.calendarTenantInfo, fetchCalendarData.calendarTenantInfo);
    }

    public int hashCode() {
        Calendar calendar2 = this.calendar;
        int i = 0;
        int hashCode = (calendar2 != null ? calendar2.hashCode() : 0) * 31;
        List<CalendarMember> list = this.calendarMembers;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        CalendarTenantInfo calendarTenantInfo2 = this.calendarTenantInfo;
        if (calendarTenantInfo2 != null) {
            i = calendarTenantInfo2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "FetchCalendarData(calendar=" + this.calendar + ", calendarMembers=" + this.calendarMembers + ", calendarTenantInfo=" + this.calendarTenantInfo + ")";
    }

    public final Calendar getCalendar() {
        return this.calendar;
    }

    public final List<CalendarMember> getCalendarMembers() {
        return this.calendarMembers;
    }

    public final CalendarTenantInfo getCalendarTenantInfo() {
        return this.calendarTenantInfo;
    }

    public final void setCalendar(Calendar calendar2) {
        this.calendar = calendar2;
    }

    public final void setCalendarTenantInfo(CalendarTenantInfo calendarTenantInfo2) {
        this.calendarTenantInfo = calendarTenantInfo2;
    }

    public final void setCalendarMembers(List<CalendarMember> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.calendarMembers = list;
    }

    public FetchCalendarData(Calendar calendar2, List<CalendarMember> list, CalendarTenantInfo calendarTenantInfo2) {
        Intrinsics.checkParameterIsNotNull(list, "calendarMembers");
        this.calendar = calendar2;
        this.calendarMembers = list;
        this.calendarTenantInfo = calendarTenantInfo2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchCalendarData(Calendar calendar2, List list, CalendarTenantInfo calendarTenantInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : calendar2, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : calendarTenantInfo2);
    }
}
