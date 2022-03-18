package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32645b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/MonthInfo;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDateHolder;", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "showYear", "", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;Z)V", "currentDate", "getDate", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "monthString", "", "getMonthString", "()Ljava/lang/CharSequence;", "isPasted", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.k */
public final class MonthInfo implements CalendarDateHolder {

    /* renamed from: a */
    private final CharSequence f75656a;

    /* renamed from: b */
    private final CalendarDate f75657b = new CalendarDate();

    /* renamed from: c */
    private final CalendarDate f75658c;

    @Override // com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDateHolder
    /* renamed from: a */
    public CalendarDate mo109174a() {
        return this.f75658c;
    }

    /* renamed from: b */
    public final CharSequence mo109244b() {
        return this.f75656a;
    }

    /* renamed from: c */
    public final boolean mo109245c() {
        if (mo109174a().monthDiff(this.f75657b) < 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MonthInfo: " + mo109174a();
    }

    public MonthInfo(CalendarDate calendarDate, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        this.f75658c = calendarDate;
        this.f75656a = C32645b.m125234a(mo109174a(), z);
    }
}
