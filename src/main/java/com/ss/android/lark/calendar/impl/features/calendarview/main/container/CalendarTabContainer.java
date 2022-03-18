package com.ss.android.lark.calendar.impl.features.calendarview.main.container;

import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.features.calendarview.C30804f;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarNavigationTabView;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarTabView;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarTabContainer;", "", "()V", "mCalendarNaviTabController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarNavigationTabView;", "mCalendarTabController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabView;", "mProgress", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabScrollProgress;", "destroy", "", "scrollToProgress", "process", "", "scrollToTodayProgress", "duration", "", "setProgress", "updateTabArrow", "isUpDownArrow", "", "progress", "updateTabDate", "currentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.b */
public final class CalendarTabContainer {

    /* renamed from: a */
    private CalendarTabView f77808a;

    /* renamed from: b */
    private CalendarNavigationTabView f77809b;

    /* renamed from: c */
    private final C30804f f77810c = new C30804f();

    /* renamed from: a */
    public final void mo111880a() {
        this.f77810c.mo111610c(BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public final void mo111881a(float f) {
        this.f77810c.mo111610c(f);
    }

    /* renamed from: a */
    public final void mo111882a(int i) {
        this.f77810c.mo111609b(i);
    }

    /* renamed from: a */
    public final void mo111883a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "currentDate");
        View a = C30022a.f74882a.mainModuleDependency().mo108277a();
        if (this.f77808a == null && (a instanceof CalendarTabView)) {
            this.f77808a = (CalendarTabView) a;
        }
        CalendarTabView calendarTabView = this.f77808a;
        if (calendarTabView != null) {
            calendarTabView.mo110682a(calendarDate.getMonthDay(), false);
        }
        if (this.f77809b == null && (a instanceof CalendarNavigationTabView)) {
            this.f77809b = (CalendarNavigationTabView) a;
        }
        CalendarNavigationTabView calendarNavigationTabView = this.f77809b;
        if (calendarNavigationTabView != null) {
            calendarNavigationTabView.setCalendarDay(calendarDate.getMonthDay());
        }
    }

    /* renamed from: a */
    public final void mo111884a(boolean z, float f) {
        this.f77810c.mo111607a(z);
        this.f77810c.mo111610c(f);
    }
}
