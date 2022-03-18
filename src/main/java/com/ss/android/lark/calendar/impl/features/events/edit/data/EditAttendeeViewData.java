package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EditAttendeeViewData;", "", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "isLoading", "", "groupMembers", "", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;ZLjava/util/List;)V", "getAttendee", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getGroupMembers", "()Ljava/util/List;", "setGroupMembers", "(Ljava/util/List;)V", "()Z", "setLoading", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.c */
public final class EditAttendeeViewData {

    /* renamed from: a */
    private final CalendarEventAttendee f80196a;

    /* renamed from: b */
    private boolean f80197b;

    /* renamed from: c */
    private List<CalendarEventAttendee> f80198c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAttendeeViewData)) {
            return false;
        }
        EditAttendeeViewData cVar = (EditAttendeeViewData) obj;
        return Intrinsics.areEqual(this.f80196a, cVar.f80196a) && this.f80197b == cVar.f80197b && Intrinsics.areEqual(this.f80198c, cVar.f80198c);
    }

    public int hashCode() {
        CalendarEventAttendee calendarEventAttendee = this.f80196a;
        int i = 0;
        int hashCode = (calendarEventAttendee != null ? calendarEventAttendee.hashCode() : 0) * 31;
        boolean z = this.f80197b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        List<CalendarEventAttendee> list = this.f80198c;
        if (list != null) {
            i = list.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "EditAttendeeViewData(attendee=" + this.f80196a + ", isLoading=" + this.f80197b + ", groupMembers=" + this.f80198c + ")";
    }

    /* renamed from: a */
    public final CalendarEventAttendee mo115078a() {
        return this.f80196a;
    }

    /* renamed from: b */
    public final boolean mo115081b() {
        return this.f80197b;
    }

    /* renamed from: c */
    public final List<CalendarEventAttendee> mo115082c() {
        return this.f80198c;
    }

    /* renamed from: a */
    public final void mo115079a(List<CalendarEventAttendee> list) {
        this.f80198c = list;
    }

    /* renamed from: a */
    public final void mo115080a(boolean z) {
        this.f80197b = z;
    }

    public EditAttendeeViewData(CalendarEventAttendee calendarEventAttendee, boolean z, List<CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        this.f80196a = calendarEventAttendee;
        this.f80197b = z;
        this.f80198c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAttendeeViewData(CalendarEventAttendee calendarEventAttendee, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendarEventAttendee, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : list);
    }
}
