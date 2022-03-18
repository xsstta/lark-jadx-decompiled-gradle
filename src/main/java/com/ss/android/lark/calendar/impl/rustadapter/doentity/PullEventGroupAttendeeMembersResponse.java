package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "", "hasMore", "", "pageOffset", "", "groupMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(ZLjava/lang/String;Ljava/util/List;)V", "getGroupMembers", "()Ljava/util/List;", "getHasMore", "()Z", "getPageOffset", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.v */
public final class PullEventGroupAttendeeMembersResponse {

    /* renamed from: a */
    private final boolean f83674a;

    /* renamed from: b */
    private final String f83675b;

    /* renamed from: c */
    private final List<CalendarEventAttendee> f83676c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullEventGroupAttendeeMembersResponse)) {
            return false;
        }
        PullEventGroupAttendeeMembersResponse vVar = (PullEventGroupAttendeeMembersResponse) obj;
        return this.f83674a == vVar.f83674a && Intrinsics.areEqual(this.f83675b, vVar.f83675b) && Intrinsics.areEqual(this.f83676c, vVar.f83676c);
    }

    public int hashCode() {
        boolean z = this.f83674a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f83675b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        List<CalendarEventAttendee> list = this.f83676c;
        if (list != null) {
            i5 = list.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        return "PullEventGroupAttendeeMembersResponse(hasMore=" + this.f83674a + ", pageOffset=" + this.f83675b + ", groupMembers=" + this.f83676c + ")";
    }

    /* renamed from: a */
    public final boolean mo120232a() {
        return this.f83674a;
    }

    /* renamed from: b */
    public final String mo120233b() {
        return this.f83675b;
    }

    /* renamed from: c */
    public final List<CalendarEventAttendee> mo120234c() {
        return this.f83676c;
    }

    public PullEventGroupAttendeeMembersResponse(boolean z, String str, List<CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(str, "pageOffset");
        Intrinsics.checkParameterIsNotNull(list, "groupMembers");
        this.f83674a = z;
        this.f83675b = str;
        this.f83676c = list;
    }
}
