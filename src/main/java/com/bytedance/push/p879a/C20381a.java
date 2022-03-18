package com.bytedance.push.p879a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.message.C59438c;

/* renamed from: com.bytedance.push.a.a */
public class C20381a {

    /* renamed from: c */
    private static volatile C20381a f49765c;

    /* renamed from: a */
    public final Context f49766a;

    /* renamed from: b */
    public final WeakHandler f49767b = C59438c.m230748a().mo202706c();

    /* renamed from: c */
    public synchronized AbstractC20383b mo68751c() {
        return null;
    }

    /* renamed from: b */
    public void mo68750b() {
        AbstractC20383b c = mo68751c();
        if (c != null) {
            c.mo68753a(this.f49766a);
        }
    }

    /* renamed from: a */
    public void mo68748a() {
        RunnableC203821 r0 = new Runnable() {
            /* class com.bytedance.push.p879a.C20381a.RunnableC203821 */

            public void run() {
                AbstractC20383b c = C20381a.this.mo68751c();
                if (c != null) {
                    c.mo68754a(C20381a.this.f49766a, C20381a.this.f49767b);
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPlus.submitRunnable(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: a */
    public boolean mo68749a(String str) throws PackageManager.NameNotFoundException {
        AbstractC20383b c = mo68751c();
        if (c != null) {
            return c.mo68755a(this.f49766a, str);
        }
        return true;
    }

    private C20381a(Context context) {
        this.f49766a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C20381a m74252a(Context context) {
        if (f49765c == null) {
            synchronized (C20381a.class) {
                if (f49765c == null) {
                    f49765c = new C20381a(context);
                }
            }
        }
        return f49765c;
    }
}
