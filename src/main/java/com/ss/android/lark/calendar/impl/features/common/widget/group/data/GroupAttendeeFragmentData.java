package com.ss.android.lark.calendar.impl.features.common.widget.group.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupAttendeeFragmentData;", "", "eventCalendarId", "", "eventKey", "eventOriginTime", "", "groupAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "firstScreenData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;", "(Ljava/lang/String;Ljava/lang/String;JLcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;)V", "getEventCalendarId", "()Ljava/lang/String;", "getEventKey", "getEventOriginTime", "()J", "getFirstScreenData", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;", "getGroupAttendee", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.data.a */
public final class GroupAttendeeFragmentData {

    /* renamed from: a */
    private final String f78913a;

    /* renamed from: b */
    private final String f78914b;

    /* renamed from: c */
    private final long f78915c;

    /* renamed from: d */
    private final CalendarEventAttendee f78916d;

    /* renamed from: e */
    private final GroupMemberPageData f78917e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupAttendeeFragmentData)) {
            return false;
        }
        GroupAttendeeFragmentData aVar = (GroupAttendeeFragmentData) obj;
        return Intrinsics.areEqual(this.f78913a, aVar.f78913a) && Intrinsics.areEqual(this.f78914b, aVar.f78914b) && this.f78915c == aVar.f78915c && Intrinsics.areEqual(this.f78916d, aVar.f78916d) && Intrinsics.areEqual(this.f78917e, aVar.f78917e);
    }

    public int hashCode() {
        String str = this.f78913a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78914b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.f78915c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        CalendarEventAttendee calendarEventAttendee = this.f78916d;
        int hashCode3 = (i2 + (calendarEventAttendee != null ? calendarEventAttendee.hashCode() : 0)) * 31;
        GroupMemberPageData bVar = this.f78917e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "GroupAttendeeFragmentData(eventCalendarId=" + this.f78913a + ", eventKey=" + this.f78914b + ", eventOriginTime=" + this.f78915c + ", groupAttendee=" + this.f78916d + ", firstScreenData=" + this.f78917e + ")";
    }

    /* renamed from: a */
    public final String mo113172a() {
        return this.f78913a;
    }

    /* renamed from: b */
    public final String mo113173b() {
        return this.f78914b;
    }

    /* renamed from: c */
    public final long mo113174c() {
        return this.f78915c;
    }

    /* renamed from: d */
    public final CalendarEventAttendee mo113175d() {
        return this.f78916d;
    }

    /* renamed from: e */
    public final GroupMemberPageData mo113176e() {
        return this.f78917e;
    }

    public GroupAttendeeFragmentData(String str, String str2, long j, CalendarEventAttendee calendarEventAttendee, GroupMemberPageData bVar) {
        Intrinsics.checkParameterIsNotNull(str, "eventCalendarId");
        Intrinsics.checkParameterIsNotNull(str2, "eventKey");
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "groupAttendee");
        this.f78913a = str;
        this.f78914b = str2;
        this.f78915c = j;
        this.f78916d = calendarEventAttendee;
        this.f78917e = bVar;
    }
}
