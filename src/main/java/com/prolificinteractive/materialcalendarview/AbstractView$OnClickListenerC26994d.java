package com.prolificinteractive.materialcalendarview;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26988e;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.prolificinteractive.materialcalendarview.d */
public abstract class AbstractView$OnClickListenerC26994d extends ViewGroup implements View.OnClickListener {

    /* renamed from: b */
    private static final Calendar f67037b = C26996e.m98121a();
    @MaterialCalendarView.ShowOtherDates

    /* renamed from: a */
    protected int f67038a = 4;

    /* renamed from: c */
    private final ArrayList<C27012r> f67039c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C27002j> f67040d = new ArrayList<>();

    /* renamed from: e */
    private MaterialCalendarView f67041e;

    /* renamed from: f */
    private CalendarDay f67042f;

    /* renamed from: g */
    private CalendarDay f67043g = null;

    /* renamed from: h */
    private CalendarDay f67044h = null;

    /* renamed from: i */
    private int f67045i;

    /* renamed from: j */
    private final Collection<C26998g> f67046j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo96045a(CalendarDay calendarDay);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo96047b(Collection<C26998g> collection, Calendar calendar);

    /* access modifiers changed from: protected */
    public abstract int getRows();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public int getFirstDayOfWeek() {
        return this.f67045i;
    }

    /* access modifiers changed from: protected */
    public CalendarDay getFirstViewDay() {
        return this.f67042f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.prolificinteractive.materialcalendarview.d$a */
    public static class C26995a extends ViewGroup.MarginLayoutParams {
        public C26995a() {
            super(-2, -2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C26995a generateDefaultLayoutParams() {
        return new C26995a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo96046b() {
        for (C26998g gVar : this.f67046j) {
            CalendarDay b = gVar.mo96084b();
            gVar.mo96079a(this.f67038a, b.mo95888a(this.f67043g, this.f67044h), mo96045a(b));
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Calendar mo96043a() {
        CalendarDay firstViewDay = getFirstViewDay();
        Calendar calendar = f67037b;
        firstViewDay.mo95890b(calendar);
        calendar.setFirstDayOfWeek(getFirstDayOfWeek());
        int firstDayOfWeek = getFirstDayOfWeek() - C26996e.m98126d(calendar);
        boolean z = true;
        if (!MaterialCalendarView.m98041a(this.f67038a) ? firstDayOfWeek <= 0 : firstDayOfWeek < 0) {
            z = false;
        }
        if (z) {
            firstDayOfWeek -= 7;
        }
        calendar.add(5, firstDayOfWeek);
        return calendar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo96048c() {
        C27000i iVar = new C27000i();
        for (C26998g gVar : this.f67046j) {
            iVar.mo96090a();
            Iterator<C27002j> it = this.f67040d.iterator();
            while (it.hasNext()) {
                C27002j next = it.next();
                if (next.f67066a.mo96089a(gVar.mo96084b())) {
                    next.f67067b.mo96092a(iVar);
                }
            }
            gVar.mo96083a(iVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C26995a;
    }

    /* renamed from: a */
    public C26995a generateLayoutParams(AttributeSet attributeSet) {
        return new C26995a();
    }

    public void setMaximumDate(CalendarDay calendarDay) {
        this.f67044h = calendarDay;
        mo96046b();
    }

    public void setMinimumDate(CalendarDay calendarDay) {
        this.f67043g = calendarDay;
        mo96046b();
    }

    public void setShowOtherDates(@MaterialCalendarView.ShowOtherDates int i) {
        this.f67038a = i;
        mo96046b();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C26995a();
    }

    public void onClick(View view) {
        if (view instanceof C26998g) {
            this.f67041e.mo95911a((C26998g) view);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractView$OnClickListenerC26994d.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractView$OnClickListenerC26994d.class.getName());
    }

    /* access modifiers changed from: package-private */
    public void setDayViewDecorators(List<C27002j> list) {
        this.f67040d.clear();
        if (list != null) {
            this.f67040d.addAll(list);
        }
        mo96048c();
    }

    public void setDateTextAppearance(int i) {
        for (C26998g gVar : this.f67046j) {
            gVar.setTextAppearance(getContext(), i);
        }
    }

    public void setDayFormatter(AbstractC26988e eVar) {
        for (C26998g gVar : this.f67046j) {
            gVar.mo96082a(eVar);
        }
    }

    public void setSelectionColor(int i) {
        for (C26998g gVar : this.f67046j) {
            gVar.mo96078a(i);
        }
    }

    public void setSelectionEnabled(boolean z) {
        AbstractView$OnClickListenerC26994d dVar;
        for (C26998g gVar : this.f67046j) {
            if (z) {
                dVar = this;
            } else {
                dVar = null;
            }
            gVar.setOnClickListener(dVar);
            gVar.setClickable(z);
        }
    }

    public void setWeekDayFormatter(AbstractC26991h hVar) {
        Iterator<C27012r> it = this.f67039c.iterator();
        while (it.hasNext()) {
            it.next().mo96114a(hVar);
        }
    }

    public void setWeekDayTextAppearance(int i) {
        Iterator<C27012r> it = this.f67039c.iterator();
        while (it.hasNext()) {
            it.next().setTextAppearance(getContext(), i);
        }
    }

    /* renamed from: a */
    private void m98111a(Calendar calendar) {
        for (int i = 0; i < 7; i++) {
            C27012r rVar = new C27012r(getContext(), C26996e.m98126d(calendar));
            this.f67039c.add(rVar);
            addView(rVar);
            calendar.add(5, 1);
        }
    }

    public void setSelectedDates(Collection<CalendarDay> collection) {
        boolean z;
        for (C26998g gVar : this.f67046j) {
            CalendarDay b = gVar.mo96084b();
            if (collection == null || !collection.contains(b)) {
                z = false;
            } else {
                z = true;
            }
            gVar.setChecked(z);
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == 0 || mode == 0) {
            throw new IllegalStateException("CalendarPagerView should never be left to decide it's size");
        }
        int i3 = size / 7;
        int rows = size2 / getRows();
        setMeasuredDimension(size, size2);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(rows, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96044a(Collection<C26998g> collection, Calendar calendar) {
        C26998g gVar = new C26998g(getContext(), CalendarDay.m98025a(calendar));
        gVar.setOnClickListener(this);
        collection.add(gVar);
        addView(gVar, new C26995a());
        calendar.add(5, 1);
    }

    public AbstractView$OnClickListenerC26994d(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i) {
        super(materialCalendarView.getContext());
        ArrayList arrayList = new ArrayList();
        this.f67046j = arrayList;
        this.f67041e = materialCalendarView;
        this.f67042f = calendarDay;
        this.f67045i = i;
        setClipChildren(false);
        setClipToPadding(false);
        m98111a(mo96043a());
        mo96047b(arrayList, mo96043a());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth() + i5;
            int measuredHeight = childAt.getMeasuredHeight() + i6;
            childAt.layout(i5, i6, measuredWidth, measuredHeight);
            if (i7 % 7 == 6) {
                i6 = measuredHeight;
                i5 = 0;
            } else {
                i5 = measuredWidth;
            }
        }
    }
}
