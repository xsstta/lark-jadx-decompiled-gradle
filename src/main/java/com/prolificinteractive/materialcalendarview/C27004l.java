package com.prolificinteractive.materialcalendarview;

import androidx.collection.C0525g;

/* renamed from: com.prolificinteractive.materialcalendarview.l */
class C27004l extends AbstractC26993c<C27006m> {

    /* renamed from: com.prolificinteractive.materialcalendarview.l$a */
    public static class C27005a implements AbstractC26997f {

        /* renamed from: a */
        private final CalendarDay f67068a;

        /* renamed from: b */
        private final int f67069b;

        /* renamed from: c */
        private C0525g<CalendarDay> f67070c = new C0525g<>();

        @Override // com.prolificinteractive.materialcalendarview.AbstractC26997f
        /* renamed from: a */
        public int mo96074a() {
            return this.f67069b;
        }

        @Override // com.prolificinteractive.materialcalendarview.AbstractC26997f
        /* renamed from: a */
        public int mo96075a(CalendarDay calendarDay) {
            return ((calendarDay.mo95889b() - this.f67068a.mo95889b()) * 12) + (calendarDay.mo95892c() - this.f67068a.mo95892c());
        }

        @Override // com.prolificinteractive.materialcalendarview.AbstractC26997f
        /* renamed from: a */
        public CalendarDay mo96076a(int i) {
            CalendarDay a = this.f67070c.mo3047a(i);
            if (a != null) {
                return a;
            }
            int b = this.f67068a.mo95889b() + (i / 12);
            int c = this.f67068a.mo95892c() + (i % 12);
            if (c >= 12) {
                b++;
                c -= 12;
            }
            CalendarDay a2 = CalendarDay.m98024a(b, c, 1);
            this.f67070c.mo3051b(i, a2);
            return a2;
        }

        public C27005a(CalendarDay calendarDay, CalendarDay calendarDay2) {
            this.f67068a = CalendarDay.m98024a(calendarDay.mo95889b(), calendarDay.mo95892c(), 1);
            this.f67069b = mo96075a(CalendarDay.m98024a(calendarDay2.mo95889b(), calendarDay2.mo95892c(), 1)) + 1;
        }
    }

    C27004l(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public boolean mo96029a(Object obj) {
        return obj instanceof C27006m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo96019a(C27006m mVar) {
        return mo96033c().mo96075a(mVar.mo96103e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C27006m mo96021a(int i) {
        return new C27006m(this.f67020a, mo96040f(i), this.f67020a.getFirstDayOfWeek());
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public AbstractC26997f mo96022a(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new C27005a(calendarDay, calendarDay2);
    }
}
