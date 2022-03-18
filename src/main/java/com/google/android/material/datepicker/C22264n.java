package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.n */
public class C22264n {

    /* renamed from: a */
    private static final C22264n f54441a = new C22264n(null, null);

    /* renamed from: b */
    private final Long f54442b;

    /* renamed from: c */
    private final TimeZone f54443c;

    /* renamed from: a */
    static C22264n m80533a() {
        return f54441a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Calendar mo77439b() {
        return mo77438a(this.f54443c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo77438a(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f54442b;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }

    private C22264n(Long l, TimeZone timeZone) {
        this.f54442b = l;
        this.f54443c = timeZone;
    }
}
