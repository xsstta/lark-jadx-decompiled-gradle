package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneInstance;", "", "startDayMinute", "", "endDayMinute", "instanceColor", "(III)V", "getEndDayMinute", "()I", "getInstanceColor", "getStartDayMinute", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.h */
public final class OneInstance {

    /* renamed from: a */
    private final int f78275a;

    /* renamed from: b */
    private final int f78276b;

    /* renamed from: c */
    private final int f78277c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneInstance)) {
            return false;
        }
        OneInstance hVar = (OneInstance) obj;
        return this.f78275a == hVar.f78275a && this.f78276b == hVar.f78276b && this.f78277c == hVar.f78277c;
    }

    public int hashCode() {
        return (((this.f78275a * 31) + this.f78276b) * 31) + this.f78277c;
    }

    public String toString() {
        return "OneInstance(startDayMinute=" + this.f78275a + ", endDayMinute=" + this.f78276b + ", instanceColor=" + this.f78277c + ")";
    }

    /* renamed from: a */
    public final int mo112386a() {
        return this.f78275a;
    }

    /* renamed from: b */
    public final int mo112387b() {
        return this.f78276b;
    }

    /* renamed from: c */
    public final int mo112388c() {
        return this.f78277c;
    }

    public OneInstance(int i, int i2, int i3) {
        this.f78275a = i;
        this.f78276b = i2;
        this.f78277c = i3;
    }
}
