package com.ss.android.lark.calendar.impl.features.calendarview.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$mTimeZoneChangedReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarPresenter$mTimeZoneChangedReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ CalendarPresenter f77781a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CalendarPresenter$mTimeZoneChangedReceiver$1(CalendarPresenter calendarPresenter) {
        this.f77781a = calendarPresenter;
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (intent != null && Intrinsics.areEqual("android.intent.action.TIMEZONE_CHANGED", intent.getAction())) {
            this.f77781a.mo111812b();
        }
    }
}
