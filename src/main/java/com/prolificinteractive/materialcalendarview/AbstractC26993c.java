package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26988e;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26990g;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.prolificinteractive.materialcalendarview.c */
abstract class AbstractC26993c<V extends AbstractView$OnClickListenerC26994d> extends PagerAdapter {

    /* renamed from: a */
    protected final MaterialCalendarView f67020a;

    /* renamed from: b */
    private final ArrayDeque<V> f67021b;

    /* renamed from: c */
    private final CalendarDay f67022c;

    /* renamed from: d */
    private AbstractC26990g f67023d;

    /* renamed from: e */
    private Integer f67024e;

    /* renamed from: f */
    private Integer f67025f;

    /* renamed from: g */
    private Integer f67026g;
    @MaterialCalendarView.ShowOtherDates

    /* renamed from: h */
    private int f67027h = 4;

    /* renamed from: i */
    private CalendarDay f67028i;

    /* renamed from: j */
    private CalendarDay f67029j;

    /* renamed from: k */
    private AbstractC26997f f67030k;

    /* renamed from: l */
    private List<CalendarDay> f67031l = new ArrayList();

    /* renamed from: m */
    private AbstractC26991h f67032m = AbstractC26991h.f67018a;

    /* renamed from: n */
    private AbstractC26988e f67033n = AbstractC26988e.f67016a;

    /* renamed from: o */
    private List<AbstractC26999h> f67034o = new ArrayList();

    /* renamed from: p */
    private List<C27002j> f67035p = null;

    /* renamed from: q */
    private boolean f67036q = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo96019a(V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo96021a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC26997f mo96022a(CalendarDay calendarDay, CalendarDay calendarDay2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo96029a(Object obj);

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @MaterialCalendarView.ShowOtherDates
    /* renamed from: b */
    public int mo96030b() {
        return this.f67027h;
    }

    /* renamed from: c */
    public AbstractC26997f mo96033c() {
        return this.f67030k;
    }

    /* renamed from: a */
    public void mo96028a(boolean z) {
        this.f67036q = z;
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            it.next().setSelectionEnabled(this.f67036q);
        }
    }

    /* renamed from: e */
    public List<CalendarDay> mo96037e() {
        return Collections.unmodifiableList(this.f67031l);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f67030k.mo96074a();
    }

    /* renamed from: d */
    public void mo96035d() {
        this.f67031l.clear();
        m98085h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo96039f() {
        Integer num = this.f67025f;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo96041g() {
        Integer num = this.f67026g;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: h */
    private void m98085h() {
        m98086i();
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            it.next().setSelectedDates(this.f67031l);
        }
    }

    /* renamed from: i */
    private void m98086i() {
        CalendarDay calendarDay;
        int i = 0;
        while (i < this.f67031l.size()) {
            CalendarDay calendarDay2 = this.f67031l.get(i);
            CalendarDay calendarDay3 = this.f67028i;
            if ((calendarDay3 != null && calendarDay3.mo95891b(calendarDay2)) || ((calendarDay = this.f67029j) != null && calendarDay.mo95887a(calendarDay2))) {
                this.f67031l.remove(i);
                this.f67020a.mo95913b(calendarDay2);
                i--;
            }
            i++;
        }
    }

    /* renamed from: a */
    public void mo96023a() {
        this.f67035p = new ArrayList();
        for (AbstractC26999h hVar : this.f67034o) {
            C27000i iVar = new C27000i();
            hVar.mo96088a(iVar);
            if (iVar.mo96094b()) {
                this.f67035p.add(new C27002j(hVar, iVar));
            }
        }
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            it.next().setDayViewDecorators(this.f67035p);
        }
    }

    /* renamed from: f */
    public CalendarDay mo96040f(int i) {
        return this.f67030k.mo96076a(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        AbstractC26990g gVar = this.f67023d;
        if (gVar == null) {
            return "";
        }
        return gVar.mo96015a(mo96040f(i));
    }

    /* renamed from: a */
    public void mo96025a(AbstractC26988e eVar) {
        this.f67033n = eVar;
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            it.next().setDayFormatter(eVar);
        }
    }

    /* renamed from: b */
    public void mo96031b(int i) {
        this.f67024e = Integer.valueOf(i);
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            it.next().setSelectionColor(i);
        }
    }

    /* renamed from: c */
    public void mo96034c(int i) {
        if (i != 0) {
            this.f67025f = Integer.valueOf(i);
            Iterator<V> it = this.f67021b.iterator();
            while (it.hasNext()) {
                it.next().setDateTextAppearance(i);
            }
        }
    }

    /* renamed from: d */
    public void mo96036d(@MaterialCalendarView.ShowOtherDates int i) {
        this.f67027h = i;
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            it.next().setShowOtherDates(i);
        }
    }

    /* renamed from: e */
    public void mo96038e(int i) {
        if (i != 0) {
            this.f67026g = Integer.valueOf(i);
            Iterator<V> it = this.f67021b.iterator();
            while (it.hasNext()) {
                it.next().setWeekDayTextAppearance(i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.prolificinteractive.materialcalendarview.c<V extends com.prolificinteractive.materialcalendarview.d> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        int a;
        if (!mo96029a(obj)) {
            return -2;
        }
        AbstractView$OnClickListenerC26994d dVar = (AbstractView$OnClickListenerC26994d) obj;
        if (dVar.getFirstViewDay() != null && (a = mo96019a(dVar)) >= 0) {
            return a;
        }
        return -2;
    }

    AbstractC26993c(MaterialCalendarView materialCalendarView) {
        this.f67020a = materialCalendarView;
        this.f67022c = CalendarDay.m98023a();
        ArrayDeque<V> arrayDeque = new ArrayDeque<>();
        this.f67021b = arrayDeque;
        arrayDeque.iterator();
        mo96032b(null, null);
    }

    /* renamed from: a */
    public int mo96018a(CalendarDay calendarDay) {
        if (calendarDay == null) {
            return getCount() / 2;
        }
        CalendarDay calendarDay2 = this.f67028i;
        if (calendarDay2 != null && calendarDay.mo95887a(calendarDay2)) {
            return 0;
        }
        CalendarDay calendarDay3 = this.f67029j;
        if (calendarDay3 == null || !calendarDay.mo95891b(calendarDay3)) {
            return this.f67030k.mo96075a(calendarDay);
        }
        return getCount() - 1;
    }

    /* renamed from: a */
    public AbstractC26993c<?> mo96020a(AbstractC26993c<?> cVar) {
        cVar.f67023d = this.f67023d;
        cVar.f67024e = this.f67024e;
        cVar.f67025f = this.f67025f;
        cVar.f67026g = this.f67026g;
        cVar.f67027h = this.f67027h;
        cVar.f67028i = this.f67028i;
        cVar.f67029j = this.f67029j;
        cVar.f67031l = this.f67031l;
        cVar.f67032m = this.f67032m;
        cVar.f67033n = this.f67033n;
        cVar.f67034o = this.f67034o;
        cVar.f67035p = this.f67035p;
        cVar.f67036q = this.f67036q;
        return cVar;
    }

    /* renamed from: a */
    public void mo96026a(AbstractC26990g gVar) {
        this.f67023d = gVar;
    }

    /* renamed from: a */
    public void mo96027a(AbstractC26991h hVar) {
        this.f67032m = hVar;
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            it.next().setWeekDayFormatter(hVar);
        }
    }

    /* renamed from: b */
    public void mo96032b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.f67028i = calendarDay;
        this.f67029j = calendarDay2;
        Iterator<V> it = this.f67021b.iterator();
        while (it.hasNext()) {
            V next = it.next();
            next.setMinimumDate(calendarDay);
            next.setMaximumDate(calendarDay2);
        }
        if (calendarDay == null) {
            calendarDay = CalendarDay.m98024a(this.f67022c.mo95889b() - 200, this.f67022c.mo95892c(), this.f67022c.mo95893d());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.m98024a(this.f67022c.mo95889b() + LocationRequest.PRIORITY_HD_ACCURACY, this.f67022c.mo95892c(), this.f67022c.mo95893d());
        }
        this.f67030k = mo96022a(calendarDay, calendarDay2);
        notifyDataSetChanged();
        m98085h();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        V a = mo96021a(i);
        a.setContentDescription(this.f67020a.getCalendarContentDescription());
        a.setAlpha(BitmapDescriptorFactory.HUE_RED);
        a.setSelectionEnabled(this.f67036q);
        a.setWeekDayFormatter(this.f67032m);
        a.setDayFormatter(this.f67033n);
        Integer num = this.f67024e;
        if (num != null) {
            a.setSelectionColor(num.intValue());
        }
        Integer num2 = this.f67025f;
        if (num2 != null) {
            a.setDateTextAppearance(num2.intValue());
        }
        Integer num3 = this.f67026g;
        if (num3 != null) {
            a.setWeekDayTextAppearance(num3.intValue());
        }
        a.setShowOtherDates(this.f67027h);
        a.setMinimumDate(this.f67028i);
        a.setMaximumDate(this.f67029j);
        a.setSelectedDates(this.f67031l);
        viewGroup.addView(a);
        this.f67021b.add(a);
        a.setDayViewDecorators(this.f67035p);
        return a;
    }

    /* renamed from: a */
    public void mo96024a(CalendarDay calendarDay, boolean z) {
        if (z) {
            if (!this.f67031l.contains(calendarDay)) {
                this.f67031l.add(calendarDay);
                m98085h();
            }
        } else if (this.f67031l.contains(calendarDay)) {
            this.f67031l.remove(calendarDay);
            m98085h();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractView$OnClickListenerC26994d dVar = (AbstractView$OnClickListenerC26994d) obj;
        this.f67021b.remove(dVar);
        viewGroup.removeView(dVar);
    }
}
