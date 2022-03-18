package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "", "calendarId", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getStatus", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "setStatus", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.y */
public final class SimpleMember {

    /* renamed from: a */
    private String f83683a;

    /* renamed from: b */
    private CalendarEventAttendee.Status f83684b;

    public SimpleMember() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleMember)) {
            return false;
        }
        SimpleMember yVar = (SimpleMember) obj;
        return Intrinsics.areEqual(this.f83683a, yVar.f83683a) && Intrinsics.areEqual(this.f83684b, yVar.f83684b);
    }

    public int hashCode() {
        String str = this.f83683a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        CalendarEventAttendee.Status status = this.f83684b;
        if (status != null) {
            i = status.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SimpleMember(calendarId=" + this.f83683a + ", status=" + this.f83684b + ")";
    }

    /* renamed from: a */
    public final String mo120249a() {
        return this.f83683a;
    }

    /* renamed from: b */
    public final CalendarEventAttendee.Status mo120252b() {
        return this.f83684b;
    }

    /* renamed from: a */
    public final void mo120250a(CalendarEventAttendee.Status status) {
        Intrinsics.checkParameterIsNotNull(status, "<set-?>");
        this.f83684b = status;
    }

    /* renamed from: a */
    public final void mo120251a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83683a = str;
    }

    public SimpleMember(String str, CalendarEventAttendee.Status status) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        this.f83683a = str;
        this.f83684b = status;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleMember(String str, CalendarEventAttendee.Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CalendarEventAttendee.Status.NEEDS_ACTION : status);
    }
}
