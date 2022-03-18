package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.calendar.impl.features.calendarview.C30804f;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import java.util.List;

public class MonthDayViewPager extends ViewPager {

    /* renamed from: a */
    public C30804f f78023a;

    /* renamed from: b */
    public boolean f78024b;

    /* renamed from: c */
    public int f78025c;

    /* renamed from: d */
    public AbstractC31110f f78026d;

    /* renamed from: e */
    public int f78027e;

    /* renamed from: f */
    public int f78028f;

    /* renamed from: g */
    private CalendarDate f78029g;

    /* renamed from: h */
    private boolean f78030h;

    /* renamed from: i */
    private C30975d f78031i;

    /* renamed from: j */
    private int f78032j = -1;

    /* renamed from: a */
    public boolean mo112096a() {
        return this.f78030h;
    }

    public int getSelectedCol() {
        return this.f78032j;
    }

    public CalendarDate getSelectedDate() {
        return this.f78029g;
    }

    public C30975d getSelectedRowView() {
        return this.f78031i;
    }

    /* renamed from: b */
    private void m115578b() {
        addOnPageChangeListener(new C30968a());
        C30804f fVar = new C30804f();
        this.f78023a = fVar;
        fVar.mo111605a(1);
    }

    public void setIsClickToScroll(boolean z) {
        this.f78024b = z;
    }

    public void setListener(AbstractC31110f fVar) {
        this.f78026d = fVar;
    }

    public void setSelectedCol(int i) {
        this.f78032j = i;
    }

    public void setSelectedRowView(C30975d dVar) {
        this.f78031i = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayViewPager$a */
    public class C30968a implements ViewPager.OnPageChangeListener {
        C30968a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                if (i == 1) {
                    MonthDayViewPager.this.f78024b = false;
                }
                if (MonthDayViewPager.this.f78026d != null) {
                    MonthDayViewPager.this.f78026d.mo108577a(MonthDayViewPager.this.f78028f);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            int i2 = MonthDayViewPager.this.f78027e - i;
            m115582a(MonthDayViewPager.this.f78027e, i);
            if (i2 > 0) {
                MonthDayViewPager.this.f78028f = 1;
            } else if (i2 < 0) {
                MonthDayViewPager.this.f78028f = 0;
            } else {
                MonthDayViewPager.this.f78028f = -999;
            }
            if (MonthDayViewPager.this.f78026d != null) {
                MonthDayViewPager.this.f78026d.mo112084b(MonthDayViewPager.this.f78028f);
            }
            MonthDayViewPager.this.f78027e = i;
        }

        /* renamed from: a */
        private void m115582a(int i, int i2) {
            String str;
            if (i2 > i) {
                str = "next";
            } else {
                str = "prev";
            }
            GeneralHitPoint.m124209a("default_view", str, "month");
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (!MonthDayViewPager.this.f78024b) {
                MonthDayViewPager.this.f78023a.mo111610c(((float) (MonthDayViewPager.this.f78025c + i)) + f);
            }
        }
    }

    public MonthDayViewPager(Context context) {
        super(context);
        m115578b();
    }

    /* renamed from: a */
    public void mo112094a(SparseArray<List<MonthEventChipViewData>> sparseArray) {
        C30970b bVar = (C30970b) getAdapter();
        if (sparseArray != null && bVar != null) {
            bVar.mo112110a(sparseArray);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            super.onTouchEvent(motionEvent);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return true;
        }
    }

    public void setCurrentPage(CalendarDate calendarDate) {
        int weeklyDayIndex = calendarDate.getWeeklyDayIndex();
        this.f78027e = weeklyDayIndex;
        setCurrentItem(weeklyDayIndex, this.f78030h);
    }

    public void setOpened(boolean z) {
        this.f78030h = z;
        C30975d dVar = this.f78031i;
        if (dVar == null) {
            return;
        }
        if (!z) {
            dVar.setSelectedCol(-1);
        } else {
            dVar.setSelectedCol(this.f78032j);
        }
    }

    public void setSelectedDate(CalendarDate calendarDate) {
        this.f78029g = calendarDate;
        if (calendarDate != null) {
            this.f78025c = calendarDate.dayDiff(new CalendarDate(calendarDate.getTimeZone())) - getCurrentItem();
        }
    }

    public MonthDayViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m115578b();
    }

    /* renamed from: a */
    public void mo112095a(SparseArray<List<MonthEventChipViewData>> sparseArray, CalendarDate calendarDate) {
        int weeklyDayIndex = calendarDate.getWeeklyDayIndex();
        this.f78027e = weeklyDayIndex;
        setCurrentItem(weeklyDayIndex, this.f78030h);
        C30970b bVar = (C30970b) getAdapter();
        if (bVar != null) {
            bVar.mo112111a(sparseArray, calendarDate);
        }
    }
}
