package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26988e;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26990g;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.prolificinteractive.materialcalendarview.s */
public class C27013s extends AbstractC26993c<C27015t> {

    /* renamed from: com.prolificinteractive.materialcalendarview.s$a */
    public static class C27014a implements AbstractC26997f {

        /* renamed from: a */
        private final CalendarDay f67085a;

        /* renamed from: b */
        private final int f67086b;

        @Override // com.prolificinteractive.materialcalendarview.AbstractC26997f
        /* renamed from: a */
        public int mo96074a() {
            return this.f67086b;
        }

        @Override // com.prolificinteractive.materialcalendarview.AbstractC26997f
        /* renamed from: a */
        public int mo96075a(CalendarDay calendarDay) {
            return m98208a(this.f67085a, calendarDay);
        }

        @Override // com.prolificinteractive.materialcalendarview.AbstractC26997f
        /* renamed from: a */
        public CalendarDay mo96076a(int i) {
            return CalendarDay.m98026a(new Date(this.f67085a.mo95895e().getTime() + TimeUnit.MILLISECONDS.convert((long) (i * 7), TimeUnit.DAYS)));
        }

        /* renamed from: a */
        private CalendarDay m98209a(CalendarDay calendarDay, int i) {
            Calendar instance = Calendar.getInstance();
            calendarDay.mo95890b(instance);
            while (instance.get(7) != i) {
                instance.add(7, -1);
            }
            return CalendarDay.m98025a(instance);
        }

        /* renamed from: a */
        private int m98208a(CalendarDay calendarDay, CalendarDay calendarDay2) {
            return (int) (TimeUnit.DAYS.convert(((calendarDay2.mo95895e().getTime() - calendarDay.mo95895e().getTime()) + ((long) calendarDay2.mo95897f().get(16))) - ((long) calendarDay.mo95897f().get(16)), TimeUnit.MILLISECONDS) / 7);
        }

        public C27014a(CalendarDay calendarDay, CalendarDay calendarDay2, int i) {
            CalendarDay a = m98209a(calendarDay, i);
            this.f67085a = a;
            this.f67086b = m98208a(a, calendarDay2) + 1;
        }
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo96023a() {
        super.mo96023a();
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo96035d() {
        super.mo96035d();
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo96027a(AbstractC26991h hVar) {
        super.mo96027a(hVar);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo96028a(boolean z) {
        super.mo96028a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public boolean mo96029a(Object obj) {
        return obj instanceof C27015t;
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    @MaterialCalendarView.ShowOtherDates
    /* renamed from: b */
    public /* bridge */ /* synthetic */ int mo96030b() {
        return super.mo96030b();
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: c */
    public /* bridge */ /* synthetic */ AbstractC26997f mo96033c() {
        return super.mo96033c();
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: e */
    public /* bridge */ /* synthetic */ List mo96037e() {
        return super.mo96037e();
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public C27013s(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo96031b(int i) {
        super.mo96031b(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo96034c(int i) {
        super.mo96034c(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo96038e(int i) {
        super.mo96038e(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ int mo96018a(CalendarDay calendarDay) {
        return super.mo96018a(calendarDay);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo96036d(@MaterialCalendarView.ShowOtherDates int i) {
        super.mo96036d(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: f */
    public /* bridge */ /* synthetic */ CalendarDay mo96040f(int i) {
        return super.mo96040f(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getItemPosition(Object obj) {
        return super.getItemPosition(obj);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ CharSequence getPageTitle(int i) {
        return super.getPageTitle(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo96019a(C27015t tVar) {
        return mo96033c().mo96075a(tVar.getFirstViewDay());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C27015t mo96021a(int i) {
        return new C27015t(this.f67020a, mo96040f(i), this.f67020a.getFirstDayOfWeek());
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC26993c mo96020a(AbstractC26993c cVar) {
        return super.mo96020a((AbstractC26993c<?>) cVar);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo96025a(AbstractC26988e eVar) {
        super.mo96025a(eVar);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo96026a(AbstractC26990g gVar) {
        super.mo96026a(gVar);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ boolean isViewFromObject(View view, Object obj) {
        return super.isViewFromObject(view, obj);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo96032b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        super.mo96032b(calendarDay, calendarDay2);
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public AbstractC26997f mo96022a(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new C27014a(calendarDay, calendarDay2, this.f67020a.getFirstDayOfWeek());
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo96024a(CalendarDay calendarDay, boolean z) {
        super.mo96024a(calendarDay, z);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractC26993c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
    }
}
