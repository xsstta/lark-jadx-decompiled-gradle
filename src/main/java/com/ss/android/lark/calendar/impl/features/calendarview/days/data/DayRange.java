package com.ss.android.lark.calendar.impl.features.calendarview.days.data;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "", "startDay", "", "endDay", "(II)V", "getEndDay", "()I", "getStartDay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.d */
public final class DayRange {

    /* renamed from: a */
    private final int f77028a;

    /* renamed from: b */
    private final int f77029b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayRange)) {
            return false;
        }
        DayRange dVar = (DayRange) obj;
        return this.f77028a == dVar.f77028a && this.f77029b == dVar.f77029b;
    }

    public int hashCode() {
        return (this.f77028a * 31) + this.f77029b;
    }

    /* renamed from: a */
    public final int mo110954a() {
        return this.f77028a;
    }

    /* renamed from: b */
    public final int mo110955b() {
        return this.f77029b;
    }

    public String toString() {
        return '[' + this.f77028a + ", " + this.f77029b + ']';
    }

    public DayRange(int i, int i2) {
        this.f77028a = i;
        this.f77029b = i2;
    }
}
