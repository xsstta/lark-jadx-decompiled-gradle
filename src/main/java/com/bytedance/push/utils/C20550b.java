package com.bytedance.push.utils;

import android.app.Service;
import android.app.job.JobService;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.reflect.Reflect;
import com.ss.android.message.p3002a.C59436a;

/* renamed from: com.bytedance.push.utils.b */
public class C20550b {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.push.utils.b$a */
    public static class C20551a implements Handler.Callback {

        /* renamed from: a */
        Handler f50117a;

        /* renamed from: b */
        Handler.Callback f50118b;

        public boolean handleMessage(Message message) {
            boolean z;
            Handler handler;
            if (message != null) {
                try {
                    if (C20552c.m74848a()) {
                        C20552c.m74845a("PushJobService", "handleMsg what = " + message.what);
                    }
                    Handler.Callback callback = this.f50118b;
                    if (callback != null) {
                        z = callback.handleMessage(message);
                    } else {
                        z = false;
                    }
                    if (!z && (handler = this.f50117a) != null) {
                        handler.handleMessage(message);
                    }
                    return true;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            Handler.Callback callback2 = this.f50118b;
            if (callback2 != null) {
                return callback2.handleMessage(message);
            }
            return false;
        }

        public C20551a(Handler handler, Handler.Callback callback) {
            this.f50117a = handler;
            this.f50118b = callback;
        }
    }

    /* renamed from: a */
    public static void m74841a(Service service) {
        Reflect on;
        try {
            if (service instanceof JobService) {
                JobService jobService = (JobService) service;
                if (!C59436a.m230732b(jobService) && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 26 && (on = Reflect.on(jobService)) != null) {
                    on.call("ensureHandler");
                    Handler handler = (Handler) on.field("mHandler", Class.forName("android.app.job.JobService$JobHandler")).get();
                    if (handler != null) {
                        Reflect on2 = Reflect.on(handler);
                        on2.set("mCallback", new C20551a(handler, (Handler.Callback) on2.field("mCallback", Handler.Callback.class).get()));
                        if (C20552c.m74848a()) {
                            C20552c.m74845a("PushJobService", "tryHackJobHandler success");
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
