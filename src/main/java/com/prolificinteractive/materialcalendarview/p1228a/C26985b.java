package com.prolificinteractive.materialcalendarview.p1228a;

import com.prolificinteractive.materialcalendarview.C26996e;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.prolificinteractive.materialcalendarview.a.b */
public class C26985b implements AbstractC26991h {

    /* renamed from: b */
    private final Calendar f67013b;

    public C26985b() {
        this(C26996e.m98121a());
    }

    public C26985b(Calendar calendar) {
        calendar.get(7);
        this.f67013b = calendar;
    }

    @Override // com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h
    /* renamed from: a */
    public CharSequence mo96013a(int i) {
        this.f67013b.set(7, i);
        return this.f67013b.getDisplayName(7, 1, Locale.getDefault());
    }
}
