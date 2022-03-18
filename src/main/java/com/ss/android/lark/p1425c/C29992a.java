package com.ss.android.lark.p1425c;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1425c.p1426a.AbstractC29994a;
import com.ss.android.lark.p1425c.p1427b.C30002b;

/* renamed from: com.ss.android.lark.c.a */
public class C29992a {

    /* renamed from: a */
    private static volatile AbstractC29994a f74828a;

    /* renamed from: a */
    public static AbstractC29994a m110932a() {
        return f74828a;
    }

    /* renamed from: b */
    public void mo108069b() {
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.p1425c.C29992a.RunnableC299931 */

            public void run() {
                Log.m165389i("AppRating", "Invoke onBackToFrontEvent.");
                C30002b.m110947a().mo108092a(C29992a.this.mo108070c(), false);
            }
        });
    }

    /* renamed from: c */
    public Context mo108070c() {
        return m110932a().mo108072a();
    }

    public C29992a(AbstractC29994a aVar) {
        f74828a = aVar;
    }

    /* renamed from: a */
    public void mo108066a(Activity activity) {
        C30002b.m110947a().mo108087a(activity);
    }

    /* renamed from: a */
    public void mo108067a(boolean z) {
        C30002b.m110947a().mo108090a(z);
    }

    /* renamed from: a */
    public void mo108068a(boolean z, String str) {
        C30002b.m110947a().mo108088a(mo108070c(), z, str);
    }
}
