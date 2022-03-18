package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.b */
public class C30970b extends PagerAdapter {

    /* renamed from: a */
    List<List<MonthEventChipViewData>> f78034a;

    /* renamed from: b */
    private CalendarDate f78035b;

    /* renamed from: c */
    private CalendarDate f78036c;

    /* renamed from: d */
    private MonthDayPage[] f78037d = new MonthDayPage[7];

    /* renamed from: e */
    private Context f78038e;

    /* renamed from: f */
    private IMonthDayViewListener f78039f;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 7;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: a */
    public void mo112109a() {
        for (int i = 0; i < 7; i++) {
            MonthDayPage monthDayPage = this.f78037d[i];
            if (monthDayPage != null) {
                monthDayPage.mo112085a();
            }
        }
    }

    /* renamed from: a */
    public void mo112110a(SparseArray<List<MonthEventChipViewData>> sparseArray) {
        mo112111a(sparseArray, this.f78035b);
    }

    /* renamed from: b */
    private List<List<MonthEventChipViewData>> m115584b(SparseArray<List<MonthEventChipViewData>> sparseArray) {
        ArrayList arrayList = new ArrayList(7);
        if (sparseArray == null) {
            for (int i = 0; i < 7; i++) {
                arrayList.add(new ArrayList());
            }
        } else {
            arrayList.add(sparseArray.get(this.f78036c.getJulianDay()));
            for (int i2 = 1; i2 < 7; i2++) {
                arrayList.add(sparseArray.get(this.f78036c.addDay(i2).getJulianDay()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo112111a(SparseArray<List<MonthEventChipViewData>> sparseArray, CalendarDate calendarDate) {
        this.f78035b = calendarDate;
        this.f78036c = calendarDate.getFirstDayOfTheWeek();
        this.f78034a = m115584b(sparseArray);
        for (int i = 0; i < 7; i++) {
            MonthDayPage monthDayPage = this.f78037d[i];
            if (monthDayPage == null) {
                monthDayPage = new MonthDayPage(this.f78038e, this.f78039f);
                this.f78037d[i] = monthDayPage;
            }
            monthDayPage.mo112086a(this.f78034a.get(i), this.f78036c.addDay(i));
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        MonthDayPage monthDayPage = this.f78037d[i];
        if (monthDayPage == null) {
            monthDayPage = new MonthDayPage(this.f78038e, this.f78039f);
            if (i < this.f78034a.size()) {
                monthDayPage.mo112086a(this.f78034a.get(i), this.f78036c.addDay(i));
            }
            this.f78037d[i] = monthDayPage;
        }
        viewGroup.addView(monthDayPage);
        return monthDayPage;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.f78037d[i]);
    }

    public C30970b(Context context, SparseArray<List<MonthEventChipViewData>> sparseArray, CalendarDate calendarDate, IMonthDayViewListener aVar) {
        this.f78035b = calendarDate;
        this.f78036c = calendarDate.getFirstDayOfTheWeek();
        this.f78039f = aVar;
        this.f78034a = m115584b(sparseArray);
        this.f78038e = context;
    }
}
