package com.ss.android.lark.passport.infra.widget.p2450d;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.larksuite.component.universe_design.toast.UDToast;

/* renamed from: com.ss.android.lark.passport.infra.widget.d.a */
public class C49266a {

    /* renamed from: a */
    private static final Handler f123664a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static boolean f123665b;

    /* renamed from: a */
    public static void m194145a() {
        f123665b = false;
    }

    /* renamed from: b */
    public static void m194149b() {
        f123665b = true;
    }

    /* renamed from: c */
    private static boolean m194150c() {
        return !f123665b;
    }

    /* renamed from: a */
    private static void m194148a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f123664a.post(runnable);
        }
    }

    /* renamed from: a */
    public static void m194146a(Context context, int i) {
        m194147a(context, context.getString(i));
    }

    /* renamed from: a */
    public static void m194147a(final Context context, final String str) {
        if (context != null && !m194150c()) {
            m194148a(new Runnable() {
                /* class com.ss.android.lark.passport.infra.widget.p2450d.C49266a.RunnableC492671 */

                public void run() {
                    UDToast.show(context, str);
                }
            });
        }
    }
}
