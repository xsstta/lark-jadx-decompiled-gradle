package com.prolificinteractive.materialcalendarview;

import java.util.Calendar;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.prolificinteractive.materialcalendarview.m */
public class C27006m extends AbstractView$OnClickListenerC26994d {
    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public int getRows() {
        return 7;
    }

    /* renamed from: e */
    public CalendarDay mo96103e() {
        return getFirstViewDay();
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    /* renamed from: a */
    public boolean mo96045a(CalendarDay calendarDay) {
        if (calendarDay.mo95892c() == getFirstViewDay().mo95892c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    /* renamed from: b */
    public void mo96047b(Collection<C26998g> collection, Calendar calendar) {
        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                mo96044a(collection, calendar);
            }
        }
    }

    public C27006m(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i) {
        super(materialCalendarView, calendarDay, i);
    }
}
