package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWithMembers;", "", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "calendarMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;Ljava/util/List;)V", "getCalendar", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "setCalendar", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;)V", "getCalendarMembers", "()Ljava/util/List;", "setCalendarMembers", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.c */
public final class CalendarWithMembers {

    /* renamed from: a */
    private Calendar f83592a;

    /* renamed from: b */
    private List<CalendarMember> f83593b;

    public CalendarWithMembers() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarWithMembers)) {
            return false;
        }
        CalendarWithMembers cVar = (CalendarWithMembers) obj;
        return Intrinsics.areEqual(this.f83592a, cVar.f83592a) && Intrinsics.areEqual(this.f83593b, cVar.f83593b);
    }

    public int hashCode() {
        Calendar calendar = this.f83592a;
        int i = 0;
        int hashCode = (calendar != null ? calendar.hashCode() : 0) * 31;
        List<CalendarMember> list = this.f83593b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CalendarWithMembers(calendar=" + this.f83592a + ", calendarMembers=" + this.f83593b + ")";
    }

    /* renamed from: a */
    public final Calendar mo120065a() {
        return this.f83592a;
    }

    /* renamed from: b */
    public final List<CalendarMember> mo120068b() {
        return this.f83593b;
    }

    /* renamed from: a */
    public final void mo120066a(Calendar calendar) {
        this.f83592a = calendar;
    }

    /* renamed from: a */
    public final void mo120067a(List<CalendarMember> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f83593b = list;
    }

    public CalendarWithMembers(Calendar calendar, List<CalendarMember> list) {
        Intrinsics.checkParameterIsNotNull(list, "calendarMembers");
        this.f83592a = calendar;
        this.f83593b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarWithMembers(Calendar calendar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : calendar, (i & 2) != 0 ? new ArrayList() : list);
    }
}
