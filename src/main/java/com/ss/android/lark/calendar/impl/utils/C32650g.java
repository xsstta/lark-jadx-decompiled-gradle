package com.ss.android.lark.calendar.impl.utils;

import android.app.Activity;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.CalendarPermissionDialog;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.utils.g */
public class C32650g {

    /* renamed from: com.ss.android.lark.calendar.impl.utils.g$a */
    public interface AbstractC32653a {
        /* renamed from: a */
        void mo109663a(boolean z);
    }

    /* renamed from: b */
    public static boolean m125313b(Activity activity) {
        return new C51331a(activity).mo176921a("android.permission.WRITE_CALENDAR");
    }

    /* renamed from: a */
    public static boolean m125312a(Activity activity) {
        if (activity == null) {
            return false;
        }
        String[] strArr = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
        C51331a aVar = new C51331a(activity);
        if (!aVar.mo176921a(strArr[0]) || !aVar.mo176921a(strArr[1])) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m125310a(Activity activity, AbstractC32653a aVar) {
        m125311a(activity, aVar, new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"}, R.string.Calendar_Alert_GoToAppSetting, 2);
    }

    /* renamed from: a */
    public static void m125311a(final Activity activity, final AbstractC32653a aVar, final String[] strArr, final int i, final int i2) {
        C51331a aVar2 = new C51331a(activity);
        boolean z = false;
        for (String str : strArr) {
            z &= aVar2.mo176921a(str);
        }
        if (!z) {
            aVar2.mo176924c(strArr).subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.calendar.impl.utils.C32650g.C326511 */

                /* renamed from: a */
                public void accept(final Boolean bool) {
                    if (!bool.booleanValue()) {
                        final List asList = Arrays.asList(strArr);
                        CalendarPermissionDialog calendarPermissionDialog = new CalendarPermissionDialog(activity, new CalendarPermissionDialog.AbstractC31084a() {
                            /* class com.ss.android.lark.calendar.impl.utils.C32650g.C326511.C326521 */

                            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.CalendarPermissionDialog.AbstractC31084a
                            /* renamed from: a */
                            public void mo112552a() {
                                boolean z = false;
                                for (String str : strArr) {
                                    z |= activity.shouldShowRequestPermissionRationale(str);
                                }
                                if (!z || i2 >= 6) {
                                    C26323w.m95322a(activity.getApplicationContext());
                                    if (aVar != null) {
                                        aVar.mo109663a(bool.booleanValue());
                                    }
                                } else {
                                    C32650g.m125311a(activity, aVar, strArr, i, i2);
                                }
                                if (asList.contains("android.permission.READ_CALENDAR") && asList.contains("android.permission.WRITE_CALENDAR")) {
                                    CalendarHitPoint.m124156q();
                                }
                            }
                        });
                        calendarPermissionDialog.mo112549a(i);
                        calendarPermissionDialog.show();
                        if (asList.contains("android.permission.READ_CALENDAR") && asList.contains("android.permission.WRITE_CALENDAR")) {
                            CalendarHitPoint.m124154p();
                            return;
                        }
                        return;
                    }
                    AbstractC32653a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo109663a(bool.booleanValue());
                    }
                }
            });
        } else if (aVar != null) {
            aVar.mo109663a(z);
        }
    }
}
