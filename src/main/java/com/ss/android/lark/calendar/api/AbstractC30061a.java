package com.ss.android.lark.calendar.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.calendar.api.entity.CalendarNotice;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30062a;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30063b;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30065a;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30066b;
import com.ss.android.lark.calendar.api.search.ICalendarModuleForSearch;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.Scene;
import com.ss.android.lark.calendar.impl.features.p1440a.AbstractC30093b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.api.a */
public interface AbstractC30061a {
    /* renamed from: a */
    PendingIntent mo108103a(CalendarNotice calendarNotice);

    /* renamed from: a */
    AbstractC30063b mo108104a(Activity activity, String str, AbstractC30062a aVar);

    /* renamed from: a */
    AbstractC30066b mo108105a(Activity activity, String str, String str2, AbstractC30065a aVar);

    /* renamed from: a */
    void mo108107a(int i, String str);

    /* renamed from: a */
    void mo108108a(Activity activity);

    /* renamed from: a */
    void mo108109a(Activity activity, String str);

    /* renamed from: a */
    void mo108110a(Activity activity, String str, boolean z);

    /* renamed from: a */
    void mo108111a(Activity activity, String str, boolean z, String str2, ArrayList<String> arrayList, long j, long j2, boolean z2, Scene scene);

    /* renamed from: a */
    void mo108112a(Context context, String str);

    /* renamed from: a */
    void mo108113a(Context context, String str, long j);

    /* renamed from: a */
    void mo108114a(Context context, String str, long j, long j2, boolean z);

    /* renamed from: a */
    void mo108115a(Context context, String str, String str2);

    /* renamed from: a */
    void mo108116a(Context context, String str, String str2, long j);

    /* renamed from: a */
    void mo108121a(Context context, String str, List<String> list);

    /* renamed from: a */
    boolean mo108122a(String str);

    /* renamed from: b */
    Intent mo108123b(Context context, String str, long j);

    /* renamed from: b */
    List<String> mo108124b(String str);

    /* renamed from: c */
    Intent mo108128c(String str);

    /* renamed from: c */
    AbstractC30093b mo108129c();

    /* renamed from: d */
    AbstractC30064b mo108130d();

    /* renamed from: e */
    String mo108131e();

    /* renamed from: f */
    boolean mo108132f();

    /* renamed from: g */
    boolean mo108133g();

    /* renamed from: h */
    void mo108134h();

    /* renamed from: i */
    void mo108135i();

    /* renamed from: j */
    ICalendarModuleForSearch mo108136j();

    /* renamed from: k */
    List<String> mo108137k();

    /* renamed from: l */
    boolean mo108138l();
}
