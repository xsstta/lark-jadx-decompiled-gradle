package com.ss.android.lark.calendar.impl.features.p1440a;

import android.content.Context;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchMemoryMonitor;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.features.a.c */
public class C30094c {
    /* renamed from: a */
    public static void m111350a(Context context) {
        Log.m165389i("CalendarRustInit", C32673y.m125376b(Long.toString(new Date().getTime()), "initSdkSend", "initSdkTZid", TimeZone.getDefault().getID()));
        LaunchMemoryMonitor.m124418a();
    }
}
