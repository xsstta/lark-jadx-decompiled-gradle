package com.prolificinteractive.materialcalendarview.p1228a;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.prolificinteractive.materialcalendarview.a.c */
public class C26986c implements AbstractC26988e {

    /* renamed from: b */
    private final DateFormat f67014b = new SimpleDateFormat(C63690d.f160779a, Locale.getDefault());

    @Override // com.prolificinteractive.materialcalendarview.p1228a.AbstractC26988e
    /* renamed from: a */
    public String mo96014a(CalendarDay calendarDay) {
        return this.f67014b.format(calendarDay.mo95895e());
    }
}
