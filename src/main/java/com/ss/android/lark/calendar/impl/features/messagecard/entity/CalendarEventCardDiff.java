package com.ss.android.lark.calendar.impl.features.messagecard.entity;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\fHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarEventCardDiff;", "Ljava/io/Serializable;", "startTime", "", "endTime", "rrule", "", "isAllDay", "", "description", "location", "meetingRooms", "", "(JJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getEndTime", "()J", "()Z", "getLocation", "getMeetingRooms", "()Ljava/util/List;", "getRrule", "getStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarEventCardDiff implements Serializable {
    private final String description;
    private final long endTime;
    private final boolean isAllDay;
    private final String location;
    private final List<String> meetingRooms;
    private final String rrule;
    private final long startTime;

    public static /* synthetic */ CalendarEventCardDiff copy$default(CalendarEventCardDiff calendarEventCardDiff, long j, long j2, String str, boolean z, String str2, String str3, List list, int i, Object obj) {
        return calendarEventCardDiff.copy((i & 1) != 0 ? calendarEventCardDiff.startTime : j, (i & 2) != 0 ? calendarEventCardDiff.endTime : j2, (i & 4) != 0 ? calendarEventCardDiff.rrule : str, (i & 8) != 0 ? calendarEventCardDiff.isAllDay : z, (i & 16) != 0 ? calendarEventCardDiff.description : str2, (i & 32) != 0 ? calendarEventCardDiff.location : str3, (i & 64) != 0 ? calendarEventCardDiff.meetingRooms : list);
    }

    public final long component1() {
        return this.startTime;
    }

    public final long component2() {
        return this.endTime;
    }

    public final String component3() {
        return this.rrule;
    }

    public final boolean component4() {
        return this.isAllDay;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.location;
    }

    public final List<String> component7() {
        return this.meetingRooms;
    }

    public final CalendarEventCardDiff copy(long j, long j2, String str, boolean z, String str2, String str3, List<String> list) {
        Intrinsics.checkParameterIsNotNull(str, "rrule");
        Intrinsics.checkParameterIsNotNull(str2, "description");
        Intrinsics.checkParameterIsNotNull(str3, "location");
        Intrinsics.checkParameterIsNotNull(list, "meetingRooms");
        return new CalendarEventCardDiff(j, j2, str, z, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarEventCardDiff)) {
            return false;
        }
        CalendarEventCardDiff calendarEventCardDiff = (CalendarEventCardDiff) obj;
        return this.startTime == calendarEventCardDiff.startTime && this.endTime == calendarEventCardDiff.endTime && Intrinsics.areEqual(this.rrule, calendarEventCardDiff.rrule) && this.isAllDay == calendarEventCardDiff.isAllDay && Intrinsics.areEqual(this.description, calendarEventCardDiff.description) && Intrinsics.areEqual(this.location, calendarEventCardDiff.location) && Intrinsics.areEqual(this.meetingRooms, calendarEventCardDiff.meetingRooms);
    }

    public int hashCode() {
        long j = this.startTime;
        long j2 = this.endTime;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.rrule;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isAllDay;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.description;
        int hashCode2 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.location;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.meetingRooms;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "CalendarEventCardDiff(startTime=" + this.startTime + ", endTime=" + this.endTime + ", rrule=" + this.rrule + ", isAllDay=" + this.isAllDay + ", description=" + this.description + ", location=" + this.location + ", meetingRooms=" + this.meetingRooms + ")";
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getLocation() {
        return this.location;
    }

    public final List<String> getMeetingRooms() {
        return this.meetingRooms;
    }

    public final String getRrule() {
        return this.rrule;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean isAllDay() {
        return this.isAllDay;
    }

    public CalendarEventCardDiff(long j, long j2, String str, boolean z, String str2, String str3, List<String> list) {
        Intrinsics.checkParameterIsNotNull(str, "rrule");
        Intrinsics.checkParameterIsNotNull(str2, "description");
        Intrinsics.checkParameterIsNotNull(str3, "location");
        Intrinsics.checkParameterIsNotNull(list, "meetingRooms");
        this.startTime = j;
        this.endTime = j2;
        this.rrule = str;
        this.isAllDay = z;
        this.description = str2;
        this.location = str3;
        this.meetingRooms = list;
    }
}
