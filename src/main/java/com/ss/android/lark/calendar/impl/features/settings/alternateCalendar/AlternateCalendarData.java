package com.ss.android.lark.calendar.impl.features.settings.alternateCalendar;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarData;", "", "calendarTypeName", "", "alternateCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;)V", "getAlternateCalendar", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;", "setAlternateCalendar", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;)V", "getCalendarTypeName", "()Ljava/lang/String;", "setCalendarTypeName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.a.b */
public final class AlternateCalendarData {

    /* renamed from: a */
    private String f83008a;

    /* renamed from: b */
    private CalendarSetting.AlternateCalendar f83009b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlternateCalendarData)) {
            return false;
        }
        AlternateCalendarData bVar = (AlternateCalendarData) obj;
        return Intrinsics.areEqual(this.f83008a, bVar.f83008a) && Intrinsics.areEqual(this.f83009b, bVar.f83009b);
    }

    public int hashCode() {
        String str = this.f83008a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        CalendarSetting.AlternateCalendar alternateCalendar = this.f83009b;
        if (alternateCalendar != null) {
            i = alternateCalendar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AlternateCalendarData(calendarTypeName=" + this.f83008a + ", alternateCalendar=" + this.f83009b + ")";
    }

    /* renamed from: a */
    public final String mo118380a() {
        return this.f83008a;
    }

    /* renamed from: b */
    public final CalendarSetting.AlternateCalendar mo118381b() {
        return this.f83009b;
    }

    public AlternateCalendarData(String str, CalendarSetting.AlternateCalendar alternateCalendar) {
        Intrinsics.checkParameterIsNotNull(str, "calendarTypeName");
        Intrinsics.checkParameterIsNotNull(alternateCalendar, "alternateCalendar");
        this.f83008a = str;
        this.f83009b = alternateCalendar;
    }
}
