package com.ss.android.lark.calendar.impl.features.calendarview.days.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\b\u0010\u001c\u001a\u00020\u0007H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/SettingReadyData;", "", "weekStartDay", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "isShowLunarCalendar", "", "viewTimeZoneId", "", "isTwentyFourHours", "defaultEventDuration", "", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;ZLjava/lang/String;ZI)V", "getDefaultEventDuration", "()I", "()Z", "getViewTimeZoneId", "()Ljava/lang/String;", "getWeekStartDay", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.g */
public final class SettingReadyData {

    /* renamed from: a */
    private final CalendarSetting.DayOfWeek f77043a;

    /* renamed from: b */
    private final boolean f77044b;

    /* renamed from: c */
    private final String f77045c;

    /* renamed from: d */
    private final boolean f77046d;

    /* renamed from: e */
    private final int f77047e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingReadyData)) {
            return false;
        }
        SettingReadyData gVar = (SettingReadyData) obj;
        return Intrinsics.areEqual(this.f77043a, gVar.f77043a) && this.f77044b == gVar.f77044b && Intrinsics.areEqual(this.f77045c, gVar.f77045c) && this.f77046d == gVar.f77046d && this.f77047e == gVar.f77047e;
    }

    public int hashCode() {
        CalendarSetting.DayOfWeek dayOfWeek = this.f77043a;
        int i = 0;
        int hashCode = (dayOfWeek != null ? dayOfWeek.hashCode() : 0) * 31;
        boolean z = this.f77044b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str = this.f77045c;
        if (str != null) {
            i = str.hashCode();
        }
        int i7 = (i6 + i) * 31;
        boolean z2 = this.f77046d;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return ((i7 + i2) * 31) + this.f77047e;
    }

    /* renamed from: a */
    public final CalendarSetting.DayOfWeek mo110984a() {
        return this.f77043a;
    }

    /* renamed from: b */
    public final String mo110985b() {
        return this.f77045c;
    }

    public String toString() {
        return "weekStartDay = " + this.f77043a + ", isShowLunarCalendar = " + this.f77044b + ", viewTimeZoneId = " + this.f77045c + ", isTwentyFourHours = " + this.f77046d + ", defaultEventDuration = " + this.f77047e;
    }

    public SettingReadyData(CalendarSetting.DayOfWeek dayOfWeek, boolean z, String str, boolean z2, int i) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "weekStartDay");
        Intrinsics.checkParameterIsNotNull(str, "viewTimeZoneId");
        this.f77043a = dayOfWeek;
        this.f77044b = z;
        this.f77045c = str;
        this.f77046d = z2;
        this.f77047e = i;
    }
}
