package com.ss.android.lark.calendar.wrapper.impl.tabspec;

import android.view.View;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarNavigationTabView;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarTabView;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabDateUpdate;", "Landroidx/lifecycle/LifecycleEventObserver;", "()V", "currentDay", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "tag", "", "bind", "", "owner", "onStateChanged", ShareHitPoint.f121868c, "event", "Landroidx/lifecycle/Lifecycle$Event;", "update", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarTabDateUpdate implements AbstractC1168n {

    /* renamed from: a */
    private final String f83895a = "CalendarTabDateUpdate";

    /* renamed from: b */
    private int f83896b = new CalendarDate().getJulianDay();

    /* renamed from: c */
    private LifecycleOwner f83897c;

    /* renamed from: a */
    public final void mo120469a() {
        boolean z;
        CalendarDate calendarDate = new CalendarDate();
        String str = this.f83895a;
        StringBuilder sb = new StringBuilder();
        sb.append("update ");
        if (calendarDate.getJulianDay() != this.f83896b) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i(str, sb.toString());
        if (calendarDate.getJulianDay() != this.f83896b) {
            this.f83896b = calendarDate.getJulianDay();
            View a = C30022a.f74882a.mainModuleDependency().mo108277a();
            if (a instanceof CalendarTabView) {
                ((CalendarTabView) a).mo110682a(calendarDate.getMonthDay(), false);
            } else if (a instanceof CalendarNavigationTabView) {
                ((CalendarNavigationTabView) a).setCalendarDay(calendarDate.getMonthDay());
            }
        }
    }

    /* renamed from: a */
    public final void mo120470a(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        String str = this.f83895a;
        Log.m165389i(str, "bind " + lifecycleOwner);
        LifecycleOwner lifecycleOwner2 = this.f83897c;
        if (!(lifecycleOwner2 == null || (lifecycle2 = lifecycleOwner2.getLifecycle()) == null)) {
            lifecycle2.removeObserver(this);
        }
        this.f83897c = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            mo120469a();
        }
    }
}
