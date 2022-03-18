package com.prolificinteractive.materialcalendarview.p1228a;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.prolificinteractive.materialcalendarview.a.d */
public class C26987d implements AbstractC26990g {

    /* renamed from: a */
    private final DateFormat f67015a = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());

    @Override // com.prolificinteractive.materialcalendarview.p1228a.AbstractC26990g
    /* renamed from: a */
    public CharSequence mo96015a(CalendarDay calendarDay) {
        return this.f67015a.format(calendarDay.mo95895e());
    }
}
