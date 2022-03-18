package com.haibin.calendarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

public final class MonthViewPager extends ViewPager {

    /* renamed from: a */
    public boolean f57534a;

    /* renamed from: b */
    public int f57535b;

    /* renamed from: c */
    public C23350e f57536c;

    /* renamed from: d */
    public int f57537d;

    /* renamed from: e */
    public int f57538e;

    /* renamed from: f */
    public int f57539f;

    /* renamed from: g */
    CalendarLayout f57540g;

    /* renamed from: h */
    WeekViewPager f57541h;

    /* renamed from: i */
    C23363o f57542i;

    /* renamed from: j */
    public boolean f57543j;

    /* access modifiers changed from: private */
    /* renamed from: com.haibin.calendarview.MonthViewPager$a */
    public final class C23337a extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return MonthViewPager.this.f57535b;
        }

        private C23337a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            if (MonthViewPager.this.f57534a) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            int D = (((MonthViewPager.this.f57536c.mo81109D() + i) - 1) / 12) + MonthViewPager.this.f57536c.mo81183y();
            int D2 = (((MonthViewPager.this.f57536c.mo81109D() + i) - 1) % 12) + 1;
            try {
                AbstractC23343a aVar = (AbstractC23343a) MonthViewPager.this.f57536c.mo81177s().getConstructor(Context.class).newInstance(MonthViewPager.this.getContext());
                aVar.mMonthViewPager = MonthViewPager.this;
                aVar.mParentLayout = MonthViewPager.this.f57540g;
                aVar.setup(MonthViewPager.this.f57536c);
                aVar.setTag(Integer.valueOf(i));
                aVar.initMonthWithDate(D, D2);
                aVar.setSelectedCalendar(MonthViewPager.this.f57536c.f57634o);
                viewGroup.addView(aVar);
                return aVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            BaseView baseView = (BaseView) obj;
            if (baseView != null) {
                baseView.onDestroy();
                viewGroup.removeView(baseView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81039a() {
        this.f57534a = true;
        getAdapter().notifyDataSetChanged();
        this.f57534a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo81042b() {
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC23343a aVar = (AbstractC23343a) getChildAt(i);
            aVar.setSelectedCalendar(this.f57536c.f57634o);
            aVar.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo81043c() {
        for (int i = 0; i < getChildCount(); i++) {
            ((AbstractC23343a) getChildAt(i)).update();
        }
    }

    /* access modifiers changed from: package-private */
    public List<Calendar> getCurrentMonthCalendars() {
        AbstractC23343a aVar = (AbstractC23343a) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (aVar == null) {
            return null;
        }
        return aVar.mItems;
    }

    /* renamed from: g */
    private void m84715g() {
        this.f57535b = (((this.f57536c.mo81184z() - this.f57536c.mo81183y()) * 12) - this.f57536c.mo81109D()) + 1 + this.f57536c.mo81110E();
        setAdapter(new C23337a());
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.haibin.calendarview.MonthViewPager.C233361 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Calendar a = C23349d.m84781a(i, MonthViewPager.this.f57536c);
                if (MonthViewPager.this.getVisibility() == 0) {
                    if (!(MonthViewPager.this.f57536c.f57620a || MonthViewPager.this.f57536c.f57635p == null || a.getYear() == MonthViewPager.this.f57536c.f57635p.getYear() || MonthViewPager.this.f57536c.f57629j == null)) {
                        MonthViewPager.this.f57536c.f57629j.mo81037a(a.getYear());
                    }
                    MonthViewPager.this.f57536c.f57635p = a;
                }
                if (MonthViewPager.this.f57536c.f57630k != null) {
                    MonthViewPager.this.f57536c.f57630k.onMonthChange(a.getYear(), a.getMonth());
                }
                if (MonthViewPager.this.f57541h.getVisibility() == 0) {
                    MonthViewPager.this.mo81040a(a.getYear(), a.getMonth());
                    return;
                }
                if (MonthViewPager.this.f57536c.mo81131Z() == 0) {
                    if (!a.isCurrentMonth()) {
                        MonthViewPager.this.f57536c.f57634o = a;
                    } else {
                        MonthViewPager.this.f57536c.f57634o = C23349d.m84797c(a, MonthViewPager.this.f57536c);
                    }
                    MonthViewPager.this.f57536c.f57635p = MonthViewPager.this.f57536c.f57634o;
                } else if (MonthViewPager.this.f57536c.f57637r != null && MonthViewPager.this.f57536c.f57637r.isSameMonth(MonthViewPager.this.f57536c.f57635p)) {
                    MonthViewPager.this.f57536c.f57635p = MonthViewPager.this.f57536c.f57637r;
                } else if (a.isSameMonth(MonthViewPager.this.f57536c.f57634o)) {
                    MonthViewPager.this.f57536c.f57635p = MonthViewPager.this.f57536c.f57634o;
                }
                MonthViewPager.this.f57536c.ak();
                if (!MonthViewPager.this.f57543j && MonthViewPager.this.f57536c.mo81131Z() == 0) {
                    MonthViewPager.this.f57542i.onDateSelected(MonthViewPager.this.f57536c.f57634o, MonthViewPager.this.f57536c.mo81129X(), false);
                    if (MonthViewPager.this.f57536c.f57624e != null) {
                        MonthViewPager.this.f57536c.f57624e.mo40118a(MonthViewPager.this.f57536c.f57634o, false);
                    }
                }
                AbstractC23343a aVar = (AbstractC23343a) MonthViewPager.this.findViewWithTag(Integer.valueOf(i));
                if (aVar != null) {
                    int selectedIndex = aVar.getSelectedIndex(MonthViewPager.this.f57536c.f57635p);
                    if (MonthViewPager.this.f57536c.mo81131Z() == 0) {
                        aVar.mCurrentItem = selectedIndex;
                    }
                    if (selectedIndex >= 0 && MonthViewPager.this.f57540g != null) {
                        MonthViewPager.this.f57540g.mo80942a(selectedIndex);
                    }
                    aVar.invalidate();
                }
                MonthViewPager.this.f57541h.mo81051a(MonthViewPager.this.f57536c.f57635p, false);
                MonthViewPager.this.mo81040a(a.getYear(), a.getMonth());
                MonthViewPager.this.f57543j = false;
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                int i3;
                float f2;
                if (MonthViewPager.this.f57536c.mo81125T() != 0) {
                    if (i < MonthViewPager.this.getCurrentItem()) {
                        f2 = ((float) MonthViewPager.this.f57538e) * (1.0f - f);
                        i3 = MonthViewPager.this.f57539f;
                    } else {
                        f2 = ((float) MonthViewPager.this.f57539f) * (1.0f - f);
                        i3 = MonthViewPager.this.f57537d;
                    }
                    ViewGroup.LayoutParams layoutParams = MonthViewPager.this.getLayoutParams();
                    layoutParams.height = (int) (f2 + (((float) i3) * f));
                    MonthViewPager.this.setLayoutParams(layoutParams);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo81044d() {
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC23343a aVar = (AbstractC23343a) getChildAt(i);
            aVar.updateShowMode();
            aVar.requestLayout();
        }
        if (this.f57536c.mo81125T() == 0) {
            int C = this.f57536c.mo81108C() * 6;
            this.f57539f = C;
            this.f57537d = C;
            this.f57538e = C;
        } else {
            mo81040a(this.f57536c.f57634o.getYear(), this.f57536c.f57634o.getMonth());
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f57539f;
        setLayoutParams(layoutParams);
        CalendarLayout calendarLayout = this.f57540g;
        if (calendarLayout != null) {
            calendarLayout.mo80941a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo81045e() {
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC23343a aVar = (AbstractC23343a) getChildAt(i);
            aVar.updateWeekStart();
            aVar.requestLayout();
        }
        mo81040a(this.f57536c.f57634o.getYear(), this.f57536c.f57634o.getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f57539f;
        setLayoutParams(layoutParams);
        if (this.f57540g != null) {
            this.f57540g.mo80945b(C23349d.m84777a(this.f57536c.f57634o, this.f57536c.mo81129X()));
        }
        mo81042b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo81046f() {
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC23343a aVar = (AbstractC23343a) getChildAt(i);
            aVar.updateItemHeight();
            aVar.requestLayout();
        }
        int year = this.f57536c.f57635p.getYear();
        int month = this.f57536c.f57635p.getMonth();
        this.f57539f = C23349d.m84773a(year, month, this.f57536c.mo81108C(), this.f57536c.mo81129X());
        if (month == 1) {
            this.f57538e = C23349d.m84773a(year - 1, 12, this.f57536c.mo81108C(), this.f57536c.mo81129X());
            this.f57537d = C23349d.m84773a(year, 2, this.f57536c.mo81108C(), this.f57536c.mo81129X());
        } else {
            this.f57538e = C23349d.m84773a(year, month - 1, this.f57536c.mo81108C(), this.f57536c.mo81129X());
            if (month == 12) {
                this.f57537d = C23349d.m84773a(year + 1, 1, this.f57536c.mo81108C(), this.f57536c.mo81129X());
            } else {
                this.f57537d = C23349d.m84773a(year, month + 1, this.f57536c.mo81108C(), this.f57536c.mo81129X());
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f57539f;
        setLayoutParams(layoutParams);
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f57536c.mo81126U() || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f57536c.mo81126U() || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setup(C23350e eVar) {
        this.f57536c = eVar;
        mo81040a(eVar.ad().getYear(), this.f57536c.ad().getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f57539f;
        setLayoutParams(layoutParams);
        m84715g();
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        if (Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, z);
        }
    }

    /* renamed from: a */
    public void mo81040a(int i, int i2) {
        if (this.f57536c.mo81125T() == 0) {
            this.f57539f = this.f57536c.mo81108C() * 6;
            return;
        }
        if (this.f57540g != null) {
            if (getVisibility() != 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = C23349d.m84773a(i, i2, this.f57536c.mo81108C(), this.f57536c.mo81129X());
                setLayoutParams(layoutParams);
            }
            this.f57540g.mo80941a();
        }
        this.f57539f = C23349d.m84773a(i, i2, this.f57536c.mo81108C(), this.f57536c.mo81129X());
        if (i2 == 1) {
            this.f57538e = C23349d.m84773a(i - 1, 12, this.f57536c.mo81108C(), this.f57536c.mo81129X());
            this.f57537d = C23349d.m84773a(i, 2, this.f57536c.mo81108C(), this.f57536c.mo81129X());
            return;
        }
        this.f57538e = C23349d.m84773a(i, i2 - 1, this.f57536c.mo81108C(), this.f57536c.mo81129X());
        if (i2 == 12) {
            this.f57537d = C23349d.m84773a(i + 1, 1, this.f57536c.mo81108C(), this.f57536c.mo81129X());
        } else {
            this.f57537d = C23349d.m84773a(i, i2 + 1, this.f57536c.mo81108C(), this.f57536c.mo81129X());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81041a(int i, int i2, int i3, boolean z) {
        this.f57543j = true;
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        calendar.setCurrentDay(calendar.equals(this.f57536c.ad()));
        C23354i.m84878a(calendar);
        this.f57536c.f57635p = calendar;
        this.f57536c.f57634o = calendar;
        this.f57536c.ak();
        int year = (((calendar.getYear() - this.f57536c.mo81183y()) * 12) + calendar.getMonth()) - this.f57536c.mo81109D();
        if (getCurrentItem() == year) {
            this.f57543j = false;
        }
        setCurrentItem(year, z);
        AbstractC23343a aVar = (AbstractC23343a) findViewWithTag(Integer.valueOf(year));
        if (aVar != null) {
            aVar.setSelectedCalendar(this.f57536c.f57635p);
            aVar.invalidate();
            CalendarLayout calendarLayout = this.f57540g;
            if (calendarLayout != null) {
                calendarLayout.mo80942a(aVar.getSelectedIndex(this.f57536c.f57635p));
            }
        }
        if (this.f57540g != null) {
            this.f57540g.mo80945b(C23349d.m84777a(calendar, this.f57536c.mo81129X()));
        }
        if (this.f57536c.f57624e != null) {
            this.f57536c.f57624e.mo40118a(calendar, false);
        }
        if (this.f57536c.f57628i != null) {
            this.f57536c.f57628i.mo81024a(calendar, false);
        }
        mo81042b();
    }
}
