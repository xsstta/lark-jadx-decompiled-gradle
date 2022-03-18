package com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/DailySecondTime;", "", "startSecond", "", "endSecond", "(II)V", "getEndSecond", "()I", "setEndSecond", "(I)V", "getStartSecond", "setStartSecond", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b.a */
public final class DailySecondTime {

    /* renamed from: a */
    private int f80420a;

    /* renamed from: b */
    private int f80421b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailySecondTime)) {
            return false;
        }
        DailySecondTime aVar = (DailySecondTime) obj;
        return this.f80420a == aVar.f80420a && this.f80421b == aVar.f80421b;
    }

    public int hashCode() {
        return (this.f80420a * 31) + this.f80421b;
    }

    public String toString() {
        return "DailySecondTime(startSecond=" + this.f80420a + ", endSecond=" + this.f80421b + ")";
    }

    /* renamed from: a */
    public final int mo115294a() {
        return this.f80420a;
    }

    /* renamed from: b */
    public final int mo115295b() {
        return this.f80421b;
    }

    public DailySecondTime(int i, int i2) {
        this.f80420a = i;
        this.f80421b = i2;
    }
}
