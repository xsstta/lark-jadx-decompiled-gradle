package com.ss.android.lark.calendar.impl.features.calendarview.widget.lunar.entity;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/lunar/entity/YearAndIndex;", "", "year", "", "index", "(II)V", "getIndex", "()I", "setIndex", "(I)V", "getYear", "setYear", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.a.a.a */
public final class YearAndIndex {

    /* renamed from: a */
    private int f78542a;

    /* renamed from: b */
    private int f78543b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearAndIndex)) {
            return false;
        }
        YearAndIndex aVar = (YearAndIndex) obj;
        return this.f78542a == aVar.f78542a && this.f78543b == aVar.f78543b;
    }

    public int hashCode() {
        return (this.f78542a * 31) + this.f78543b;
    }

    public String toString() {
        return "YearAndIndex(year=" + this.f78542a + ", index=" + this.f78543b + ")";
    }

    public YearAndIndex(int i, int i2) {
        this.f78542a = i;
        this.f78543b = i2;
    }
}
