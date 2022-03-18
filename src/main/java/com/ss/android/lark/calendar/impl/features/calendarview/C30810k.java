package com.ss.android.lark.calendar.impl.features.calendarview;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.k */
public class C30810k {

    /* renamed from: a */
    public Calendar f77508a;

    /* renamed from: b */
    private AbstractC32595g f77509b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.k$a */
    public static class C30812a {

        /* renamed from: a */
        public static final C30810k f77513a = new C30810k();
    }

    /* renamed from: a */
    public static C30810k m114955a() {
        return C30812a.f77513a;
    }

    private C30810k() {
        this.f77509b = C32583e.m124816a();
    }

    /* renamed from: c */
    public String mo111644c() {
        Calendar calendar = this.f77508a;
        if (calendar != null) {
            return calendar.getServerId();
        }
        Log.m165383e("LoginInfoManager", C32673y.m125378d("mLoginPrimaryCalendar_is_null"));
        return "";
    }

    /* renamed from: b */
    public void mo111643b() {
        final String l = Long.toString(new Date().getTime());
        Log.m165389i("LoginInfoManager", C32673y.m125376b(l, "loadPrimaryCalendars", new String[0]));
        this.f77509b.mo119046d(new IGetDataCallback<Calendar>("loadPrimaryCalendars") {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.C30810k.C308111 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LoginInfoManager", C32673y.m125370a(l, "loadPrimaryCalendars", errorResult));
            }

            /* renamed from: a */
            public void onSuccess(Calendar calendar) {
                String str = l;
                String str2 = "loadPrimaryCalendars";
                String[] strArr = new String[2];
                boolean z = false;
                strArr[0] = "calendar_is_null_";
                if (calendar == null) {
                    z = true;
                }
                strArr[1] = String.valueOf(z);
                Log.m165389i("LoginInfoManager", C32673y.m125373a(str, str2, strArr));
                C30810k.this.f77508a = calendar;
            }
        });
    }
}
