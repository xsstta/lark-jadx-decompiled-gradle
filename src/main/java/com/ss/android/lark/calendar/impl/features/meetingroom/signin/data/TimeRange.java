package com.ss.android.lark.calendar.impl.features.meetingroom.signin.data;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/TimeRange;", "", "startTime", "", "endTime", "(JJ)V", "getEndTime", "()J", "setEndTime", "(J)V", "getStartTime", "setStartTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.b */
public final class TimeRange {

    /* renamed from: a */
    private long f82222a;

    /* renamed from: b */
    private long f82223b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeRange)) {
            return false;
        }
        TimeRange bVar = (TimeRange) obj;
        return this.f82222a == bVar.f82222a && this.f82223b == bVar.f82223b;
    }

    public int hashCode() {
        long j = this.f82222a;
        long j2 = this.f82223b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "TimeRange(startTime=" + this.f82222a + ", endTime=" + this.f82223b + ")";
    }

    /* renamed from: a */
    public final long mo117447a() {
        return this.f82222a;
    }

    /* renamed from: b */
    public final long mo117448b() {
        return this.f82223b;
    }

    public TimeRange(long j, long j2) {
        this.f82222a = j;
        this.f82223b = j2;
    }
}
