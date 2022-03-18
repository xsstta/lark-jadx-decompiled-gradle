package com.ss.android.lark.calendar.impl.features.calendars.share.helper;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1144ai;
import com.larksuite.component.universe_design.toast.UDToast;
import com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/helper/CalendarShareHelper;", "", "()V", "getCalendarShareViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "activity", "Landroidx/activity/ComponentActivity;", "showToast", "", "context", "Landroid/content/Context;", "stringResId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.c.c */
public final class CalendarShareHelper {

    /* renamed from: a */
    public static final CalendarShareHelper f76321a = new CalendarShareHelper();

    private CalendarShareHelper() {
    }

    /* renamed from: a */
    public final CalendarShareViewModel mo110028a(ComponentActivity componentActivity) {
        if (componentActivity != null) {
            return (CalendarShareViewModel) new C1144ai(componentActivity).mo6005a(CalendarShareViewModel.class);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo110029a(Context context, int i) {
        if (context != null) {
            UDToast.show(context, i);
        }
    }
}
