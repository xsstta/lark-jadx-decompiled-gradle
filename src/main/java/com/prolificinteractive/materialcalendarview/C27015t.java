package com.prolificinteractive.materialcalendarview;

import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26988e;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h;
import java.util.Calendar;
import java.util.Collection;

/* renamed from: com.prolificinteractive.materialcalendarview.t */
public class C27015t extends AbstractView$OnClickListenerC26994d {
    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    /* renamed from: a */
    public boolean mo96045a(CalendarDay calendarDay) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public int getRows() {
        return 2;
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i) {
        super.setDateTextAppearance(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setDayFormatter(AbstractC26988e eVar) {
        super.setDayFormatter(eVar);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setMaximumDate(CalendarDay calendarDay) {
        super.setMaximumDate(calendarDay);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setMinimumDate(CalendarDay calendarDay) {
        super.setMinimumDate(calendarDay);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setSelectedDates(Collection collection) {
        super.setSelectedDates(collection);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setSelectionColor(int i) {
        super.setSelectionColor(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setSelectionEnabled(boolean z) {
        super.setSelectionEnabled(z);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setShowOtherDates(@MaterialCalendarView.ShowOtherDates int i) {
        super.setShowOtherDates(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setWeekDayFormatter(AbstractC26991h hVar) {
        super.setWeekDayFormatter(hVar);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i) {
        super.setWeekDayTextAppearance(i);
    }

    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractView$OnClickListenerC26994d.C26995a mo96042a(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.prolificinteractive.materialcalendarview.AbstractView$OnClickListenerC26994d
    /* renamed from: b */
    public void mo96047b(Collection<C26998g> collection, Calendar calendar) {
        for (int i = 0; i < 7; i++) {
            mo96044a(collection, calendar);
        }
    }

    public C27015t(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i) {
        super(materialCalendarView, calendarDay, i);
    }
}
