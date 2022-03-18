package com.ss.android.lark.mail.impl.widget.time;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/TimeData;", "Ljava/io/Serializable;", "startTime", "", "endTime", "isAllDay", "", "timeZoneId", "", "(JJZLjava/lang/String;)V", "getEndTime", "()J", "setEndTime", "(J)V", "()Z", "setAllDay", "(Z)V", "getStartTime", "setStartTime", "getTimeZoneId", "()Ljava/lang/String;", "setTimeZoneId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeData implements Serializable {
    private long endTime;
    private boolean isAllDay;
    private long startTime;
    private String timeZoneId;

    public static /* synthetic */ TimeData copy$default(TimeData timeData, long j, long j2, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeData.startTime;
        }
        if ((i & 2) != 0) {
            j2 = timeData.endTime;
        }
        if ((i & 4) != 0) {
            z = timeData.isAllDay;
        }
        if ((i & 8) != 0) {
            str = timeData.timeZoneId;
        }
        return timeData.copy(j, j2, z, str);
    }

    public final long component1() {
        return this.startTime;
    }

    public final long component2() {
        return this.endTime;
    }

    public final boolean component3() {
        return this.isAllDay;
    }

    public final String component4() {
        return this.timeZoneId;
    }

    public final TimeData copy(long j, long j2, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        return new TimeData(j, j2, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeData)) {
            return false;
        }
        TimeData timeData = (TimeData) obj;
        return this.startTime == timeData.startTime && this.endTime == timeData.endTime && this.isAllDay == timeData.isAllDay && Intrinsics.areEqual(this.timeZoneId, timeData.timeZoneId);
    }

    public int hashCode() {
        long j = this.startTime;
        long j2 = this.endTime;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.isAllDay;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        String str = this.timeZoneId;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TimeData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", isAllDay=" + this.isAllDay + ", timeZoneId=" + this.timeZoneId + ")";
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final boolean isAllDay() {
        return this.isAllDay;
    }

    public final void setAllDay(boolean z) {
        this.isAllDay = z;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTimeZoneId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.timeZoneId = str;
    }

    public TimeData(long j, long j2, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        this.startTime = j;
        this.endTime = j2;
        this.isAllDay = z;
        this.timeZoneId = str;
    }
}
