package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DayRange;", "", "startDay", "", "endDay", "(II)V", "getEndDay", "()I", "getStartDay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.a */
public final class DayRange {

    /* renamed from: a */
    private final int f77435a;

    /* renamed from: b */
    private final int f77436b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayRange)) {
            return false;
        }
        DayRange aVar = (DayRange) obj;
        return this.f77435a == aVar.f77435a && this.f77436b == aVar.f77436b;
    }

    public int hashCode() {
        return (this.f77435a * 31) + this.f77436b;
    }

    public String toString() {
        return "DayRange(startDay=" + this.f77435a + ", endDay=" + this.f77436b + ")";
    }

    /* renamed from: a */
    public final int mo111472a() {
        return this.f77435a;
    }

    /* renamed from: b */
    public final int mo111473b() {
        return this.f77436b;
    }

    public DayRange(int i, int i2) {
        this.f77435a = i;
        this.f77436b = i2;
    }
}
