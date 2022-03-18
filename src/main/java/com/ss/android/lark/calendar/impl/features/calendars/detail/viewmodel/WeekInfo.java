package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32645b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/WeekInfo;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDateHolder;", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "dayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;)V", "currentDate", "getDate", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "weekString", "", "getWeekString", "()Ljava/lang/CharSequence;", "isPasted", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.l */
public final class WeekInfo implements CalendarDateHolder {

    /* renamed from: a */
    private final CharSequence f75659a;

    /* renamed from: b */
    private final CalendarDate f75660b = new CalendarDate();

    /* renamed from: c */
    private final CalendarDate f75661c;

    @Override // com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDateHolder
    /* renamed from: a */
    public CalendarDate mo109174a() {
        return this.f75661c;
    }

    /* renamed from: b */
    public final CharSequence mo109247b() {
        return this.f75659a;
    }

    /* renamed from: c */
    public final boolean mo109248c() {
        if (this.f75660b.getJulianDay() > mo109174a().getJulianDay()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "WeekInfo: " + mo109174a();
    }

    public WeekInfo(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "dayOfWeek");
        this.f75661c = calendarDate;
        this.f75659a = C32645b.m125233a(mo109174a(), dayOfWeek);
    }
}
