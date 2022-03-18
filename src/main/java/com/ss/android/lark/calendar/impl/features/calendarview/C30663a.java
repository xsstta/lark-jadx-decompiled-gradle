package com.ss.android.lark.calendar.impl.features.calendarview;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.a */
public class C30663a {

    /* renamed from: a */
    private CalendarDate f76813a;

    /* renamed from: b */
    private CalendarDate f76814b;

    /* renamed from: c */
    private TimeZone f76815c;

    /* renamed from: d */
    private int f76816d;

    /* renamed from: e */
    private CalendarDaysContract.CalendarViewMode f76817e;

    /* renamed from: a */
    public CalendarDate mo110699a() {
        return this.f76813a;
    }

    /* renamed from: d */
    public CalendarDate mo110705d() {
        return this.f76814b;
    }

    /* renamed from: f */
    public TimeZone mo110707f() {
        return this.f76815c;
    }

    /* renamed from: b */
    public void mo110703b() {
        mo110701a(this.f76814b);
    }

    /* renamed from: e */
    public void mo110706e() {
        TimeZone h = m113990h();
        this.f76815c = h;
        this.f76814b = new CalendarDate(h);
    }

    /* renamed from: h */
    private TimeZone m113990h() {
        if (this.f76817e == CalendarDaysContract.CalendarViewMode.MODE_DAY_VIEW || this.f76817e == CalendarDaysContract.CalendarViewMode.MODE_THREE_DAYS_VIEW) {
            return C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone();
        }
        return TimeZone.getDefault();
    }

    /* renamed from: c */
    public boolean mo110704c() {
        TimeZone h = m113990h();
        this.f76815c = h;
        return !this.f76814b.sameDay(new CalendarDate(h));
    }

    /* renamed from: g */
    public void mo110708g() {
        TimeZone h = m113990h();
        this.f76815c = h;
        this.f76814b = new CalendarDate(h);
        this.f76813a = new CalendarDate(this.f76813a, this.f76815c);
    }

    /* renamed from: a */
    public void mo110701a(CalendarDate calendarDate) {
        TimeZone h = m113990h();
        this.f76815c = h;
        this.f76813a = new CalendarDate(calendarDate, h);
    }

    /* renamed from: a */
    public void mo110702a(TimeZone timeZone) {
        if (timeZone != null) {
            this.f76815c = timeZone;
            this.f76813a = new CalendarDate(this.f76813a, timeZone);
            this.f76814b = new CalendarDate(this.f76815c);
        }
    }

    public C30663a(int i) {
        this.f76816d = i;
        this.f76817e = CalendarDaysContract.CalendarViewMode.forNumDays(i);
        TimeZone h = m113990h();
        this.f76815c = h;
        this.f76814b = new CalendarDate(h);
        mo110701a(new CalendarDate(this.f76815c));
    }

    /* renamed from: a */
    public void mo110700a(int i) {
        this.f76816d = i;
        this.f76817e = CalendarDaysContract.CalendarViewMode.forNumDays(i);
        TimeZone h = m113990h();
        this.f76815c = h;
        this.f76813a = new CalendarDate(this.f76813a, h);
        this.f76814b = new CalendarDate(this.f76815c);
    }
}
