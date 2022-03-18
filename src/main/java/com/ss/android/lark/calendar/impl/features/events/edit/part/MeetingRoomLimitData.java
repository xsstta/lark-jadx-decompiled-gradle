package com.ss.android.lark.calendar.impl.features.events.edit.part;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/MeetingRoomLimitData;", "", "meetingRoomLimitDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "limitMeetingRoomName", "", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;Ljava/lang/String;)V", "getLimitMeetingRoomName", "()Ljava/lang/String;", "setLimitMeetingRoomName", "(Ljava/lang/String;)V", "getMeetingRoomLimitDate", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "setMeetingRoomLimitDate", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.i */
public final class MeetingRoomLimitData {

    /* renamed from: a */
    private CalendarDate f81367a;

    /* renamed from: b */
    private String f81368b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomLimitData)) {
            return false;
        }
        MeetingRoomLimitData iVar = (MeetingRoomLimitData) obj;
        return Intrinsics.areEqual(this.f81367a, iVar.f81367a) && Intrinsics.areEqual(this.f81368b, iVar.f81368b);
    }

    public int hashCode() {
        CalendarDate calendarDate = this.f81367a;
        int i = 0;
        int hashCode = (calendarDate != null ? calendarDate.hashCode() : 0) * 31;
        String str = this.f81368b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MeetingRoomLimitData(meetingRoomLimitDate=" + this.f81367a + ", limitMeetingRoomName=" + this.f81368b + ")";
    }

    /* renamed from: a */
    public final CalendarDate mo116397a() {
        return this.f81367a;
    }

    /* renamed from: b */
    public final String mo116398b() {
        return this.f81368b;
    }

    public MeetingRoomLimitData(CalendarDate calendarDate, String str) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "meetingRoomLimitDate");
        Intrinsics.checkParameterIsNotNull(str, "limitMeetingRoomName");
        this.f81367a = calendarDate;
        this.f81368b = str;
    }
}
