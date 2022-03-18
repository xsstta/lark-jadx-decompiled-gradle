package com.haibin.calendarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

public final class WeekViewPager extends ViewPager {

    /* renamed from: a */
    public boolean f57546a;

    /* renamed from: b */
    public int f57547b;

    /* renamed from: c */
    public C23350e f57548c;

    /* renamed from: d */
    CalendarLayout f57549d;

    /* renamed from: e */
    public boolean f57550e;

    /* access modifiers changed from: private */
    /* renamed from: com.haibin.calendarview.WeekViewPager$a */
    public class C23339a extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return WeekViewPager.this.f57547b;
        }

        private C23339a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            if (WeekViewPager.this.f57546a) {
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
            Calendar b = C23349d.m84793b(WeekViewPager.this.f57548c.mo81183y(), WeekViewPager.this.f57548c.mo81109D(), WeekViewPager.this.f57548c.ah(), i + 1, WeekViewPager.this.f57548c.mo81129X());
            try {
                AbstractC23348c cVar = (AbstractC23348c) WeekViewPager.this.f57548c.mo81178t().getConstructor(Context.class).newInstance(WeekViewPager.this.getContext());
                cVar.mParentLayout = WeekViewPager.this.f57549d;
                cVar.setup(WeekViewPager.this.f57548c);
                cVar.setup(b);
                cVar.setTag(Integer.valueOf(i));
                cVar.setSelectedCalendar(WeekViewPager.this.f57548c.f57634o);
                viewGroup.addView(cVar);
                return cVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            AbstractC23348c cVar = (AbstractC23348c) obj;
            if (cVar != null) {
                cVar.onDestroy();
                viewGroup.removeView(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo81052b() {
        this.f57546a = true;
        getAdapter().notifyDataSetChanged();
        this.f57546a = false;
    }

    /* access modifiers changed from: package-private */
    public List<Calendar> getCurrentWeekCalendars() {
        List<Calendar> b = C23349d.m84794b(this.f57548c.f57635p, this.f57548c);
        this.f57548c.mo81136a(b);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo81053c() {
        if (this.f57548c.mo81131Z() != 0) {
            for (int i = 0; i < getChildCount(); i++) {
                ((AbstractC23348c) getChildAt(i)).mo81101c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo81054d() {
        for (int i = 0; i < getChildCount(); i++) {
            ((AbstractC23348c) getChildAt(i)).update();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo81055e() {
        for (int i = 0; i < getChildCount(); i++) {
            ((AbstractC23348c) getChildAt(i)).mo81096a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo81057g() {
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC23348c cVar = (AbstractC23348c) getChildAt(i);
            cVar.updateItemHeight();
            cVar.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81049a() {
        this.f57547b = C23349d.m84775a(this.f57548c.mo81183y(), this.f57548c.mo81109D(), this.f57548c.ah(), this.f57548c.mo81184z(), this.f57548c.mo81110E(), this.f57548c.ai(), this.f57548c.mo81129X());
        getAdapter().notifyDataSetChanged();
    }

    /* renamed from: h */
    private void m84724h() {
        this.f57547b = C23349d.m84775a(this.f57548c.mo81183y(), this.f57548c.mo81109D(), this.f57548c.ah(), this.f57548c.mo81184z(), this.f57548c.mo81110E(), this.f57548c.ai(), this.f57548c.mo81129X());
        setAdapter(new C23339a());
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.haibin.calendarview.WeekViewPager.C233381 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Calendar calendar;
                if (WeekViewPager.this.getVisibility() != 0) {
                    WeekViewPager.this.f57550e = false;
                } else if (WeekViewPager.this.f57550e) {
                    WeekViewPager.this.f57550e = false;
                } else {
                    AbstractC23348c cVar = (AbstractC23348c) WeekViewPager.this.findViewWithTag(Integer.valueOf(i));
                    if (cVar != null) {
                        if (WeekViewPager.this.f57548c.mo81131Z() != 0) {
                            calendar = WeekViewPager.this.f57548c.f57635p;
                        } else {
                            calendar = WeekViewPager.this.f57548c.f57634o;
                        }
                        cVar.mo81098a(calendar, !WeekViewPager.this.f57550e);
                        if (WeekViewPager.this.f57548c.f57631l != null) {
                            WeekViewPager.this.f57548c.f57631l.mo81036a(WeekViewPager.this.getCurrentWeekCalendars());
                        }
                    }
                    WeekViewPager.this.f57550e = false;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo81056f() {
        int count = getAdapter().getCount();
        int a = C23349d.m84775a(this.f57548c.mo81183y(), this.f57548c.mo81109D(), this.f57548c.ah(), this.f57548c.mo81184z(), this.f57548c.mo81110E(), this.f57548c.ai(), this.f57548c.mo81129X());
        this.f57547b = a;
        if (count != a) {
            this.f57546a = true;
            getAdapter().notifyDataSetChanged();
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((AbstractC23348c) getChildAt(i)).mo81100b();
        }
        this.f57546a = false;
        mo81051a(this.f57548c.f57634o, false);
    }

    public WeekViewPager(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public void setup(C23350e eVar) {
        this.f57548c = eVar;
        m84724h();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f57548c.mo81127V() || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f57548c.mo81127V() || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public WeekViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f57548c.mo81108C(), 1073741824));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81051a(Calendar calendar, boolean z) {
        boolean z2 = true;
        int a = C23349d.m84778a(calendar, this.f57548c.mo81183y(), this.f57548c.mo81109D(), this.f57548c.ah(), this.f57548c.mo81129X()) - 1;
        if (getCurrentItem() == a) {
            z2 = false;
        }
        this.f57550e = z2;
        setCurrentItem(a, z);
        AbstractC23348c cVar = (AbstractC23348c) findViewWithTag(Integer.valueOf(a));
        if (cVar != null) {
            cVar.setSelectedCalendar(calendar);
            cVar.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81050a(int i, int i2, int i3, boolean z) {
        this.f57550e = true;
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        calendar.setCurrentDay(calendar.equals(this.f57548c.ad()));
        C23354i.m84878a(calendar);
        this.f57548c.f57635p = calendar;
        this.f57548c.f57634o = calendar;
        this.f57548c.ak();
        mo81051a(calendar, z);
        if (this.f57548c.f57628i != null) {
            this.f57548c.f57628i.mo81025b(calendar, false);
        }
        if (this.f57548c.f57624e != null) {
            this.f57548c.f57624e.mo40118a(calendar, false);
        }
        this.f57549d.mo80945b(C23349d.m84777a(calendar, this.f57548c.mo81129X()));
    }
}
